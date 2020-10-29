import java.util.Scanner;
class Circle
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
      /*We are storing the entered radius in double
       * because a user can enter radius in decimals
       */
      double radius = sc.nextDouble();
      //Area = PI*radius*radius
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
      //Circumference = 2*PI*radius
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}
/* no user intervention
class CircleDemo2
{
   public static void main(String args[])
   {
      int radius = 3;
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}
*/