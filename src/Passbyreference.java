
public class Passbyreference {

	public class Point {
		
		
			
			int x;
			int y;
			
			Point(int a, int b) {
				x=a;
				y=b;
			}
		

		public static void tricky(Point arg1, Point arg2){

		  arg1.x = 100;
		  arg1.y = 100;
		  System.out.println("Arg1: " + arg1.x + arg1.y);
		  System.out.println("Arg2: " + arg2.x + arg2.y);

		  Point temp = arg1;
		  arg1 = arg2;
		  arg2 = temp;
		  System.out.println("Arg1: " + arg1.x + arg1.y);
		  System.out.println("Arg2: " + arg2.x + arg2.y);
		}




		public static void main(String [] args){

		  Point pnt1 = new Point(0,0);
		  Point pnt2 = new Point(0,0);
		  System.out.println("X1: " + pnt1.x + " Y1: " +pnt1.y); 
		  System.out.println("X2: " + pnt2.x + " Y2: " +pnt2.y);
		  System.out.println(" ");
		  tricky(pnt1,pnt2);
		  System.out.println("X1: " + pnt1.x + " Y1:" + pnt1.y); 
		  System.out.println("X2: " + pnt2.x + " Y2: " +pnt2.y);  

		}
		}

}
