package com.dp.interfacepattern;
 
	import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	 
	public class BlobTest {
	    //private static String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(LOAD_BALANCE=ON)(FAILOVER=ON)(ADDRESS=(PROTOCOL=TCP)(HOST=lnxdb-prd1-181-vip.cisco.com)(PORT=1573))(ADDRESS=(PROTOCOL=TCP)(HOST=lnxdb-prd1-182-vip.cisco.com)(PORT=1573)))(CONNECT_DATA=(SERVICE_NAME=COEPRD.cisco.com)(SERVER=DEDICATED)))";
		private static String url = "jdbc:oracle:thin:@(DESCRIPTION_LIST=(LOAD_BALANCE=off)(FAILOVER=on)(DESCRIPTION=(ADDRESS_LIST=(LOAD_BALANCE=on)(FAILOVER=ON)(ADDRESS=(PROTOCOL=TCP)(HOST=173.37.234.44)(PORT=1541))(ADDRESS=(PROTOCOL=TCP)(HOST=173.37.234.45)(PORT=1541)))(CONNECT_DATA=(SERVICE_NAME=DMPROD.cisco.com)))(DESCRIPTION=(ADDRESS_LIST=(LOAD_BALANCE=on)(FAILOVER=ON)(ADDRESS=(PROTOCOL=TCP)(HOST=173.36.14.145)(PORT=1541))(ADDRESS=(PROTOCOL=TCP)(HOST=173.36.14.146)(PORT=1541)))(CONNECT_DATA=(SERVICE_NAME=DMPROD.cisco.com))))";
	    private static String username = "XXCFG_Q2O_U";
	    private static String password = "UMPZ1J2M"; //"li0nk1ng";
	 
	    public static void main(String[] args) throws Exception {
	        Connection conn = null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            conn = DriverManager.getConnection(url, username, password);
	            System.out.println(conn);
	           // String sql = "SELECT map FROM woc_core_obf ";
	            String sql= "select data from woc_core_data where name like '%_EXT_PROPS%'";
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            ResultSet resultSet = stmt.executeQuery();
	            while (resultSet.next()) {
	                String map = resultSet.getString(1);
	                File file = new File("C:\\prod\\_EXT_PROPS.ext");
	                FileOutputStream fos = new FileOutputStream(file);
	 
	                byte[] buffer = new byte[256];
	 
	                //
	                // Get the binary stream of our BLOB data
	                //
	                InputStream is = resultSet.getBinaryStream(1);
	                while (is.read(buffer) > 0) {
	                    fos.write(buffer);
	                }
	 
	                fos.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if (conn != null && !conn.isClosed()) {
	                conn.close();
	            }
	        }
	    }
	

}
