public class StaticVariable{
  static int noOfInstances;
  
  {
	  System.out.println("from non static block");
  }
  
  public static void display()
  {
	  System.out.println(" From display method");
  }
  
  static
  {
	  System.out.println("from static block");
  }
  
  
  
  
  StaticVariable(){
	  System.out.println("from Constructor block");
  noOfInstances++;
  }
public static void main(String[] args){	
 StaticVariable sv1 = new StaticVariable();
 System.out.println("No. of instances for sv1 : " + sv1.noOfInstances);

 StaticVariable sv2 = new StaticVariable();
 System.out.println("No. of instances for sv1 : "  + sv1.noOfInstances);
 System.out.println("No. of instances for st2 : "  + sv2.noOfInstances);

 StaticVariable sv3 = new StaticVariable();
 System.out.println("No. of instances for sv1 : "  + sv1.noOfInstances);
 System.out.println("No. of instances for sv2 : "  + sv2.noOfInstances);
 System.out.println("No. of instances for sv3 : "  + sv3.noOfInstances);
 
 display();
 }
}