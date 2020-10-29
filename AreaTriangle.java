import java.util.Scanner;
class AreaTriangle {
   public static void main(String args[]) {   
      Scanner Scanner = new Scanner(System.in);

      System.out.println("Enter the width of the Triangle:");
      double base = scanner.nextDouble();

      System.out.println("Enter the height of the Triangle:");
      double height = scanner.nextDouble();

      //Area = (width*height)/2
      double area = (base* height)/2;
      System.out.println("Area of Triangle is: " + area);      
   }
}
/*no user intervention
class AreaTriangleDemo2 {
   public static void main(String args[]) {   
      double base = 20.0;
      double height = 110.5;
      double area = (base* height)/2;
      System.out.println("Area of Triangle is: " + area);      
    }
}
*/
/*Asterisk Triangle 
public class Triangle {
public static void main(String[] args) {
int n=5;
for (int i=1;i<=n ;i++ ){
for (int j=1;j<=i ;j++ ){
System.out.print("*");
}
System.out.println( );
}
}
}
*/