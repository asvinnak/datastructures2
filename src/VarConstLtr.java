public class VarConstLtr{
  public static final int constint;
  
  static{
	  constint= 5;
  }
  
  public final int constint1;
  
  
  VarConstLtr()
  {
	  constint1= 5;
  }
  
  public static void main(String[] args){
  int intvariable;
    for (int i = 0;i <= 10;i++){
  intvariable = i;
  
  System.out.println("All the values are : \n intvariable = " 

+ intvariable + "\nconstint = " + constint);
  }
  System.out.println("Directory of this file : c:\\code\\varconstltr.java");
  }
}