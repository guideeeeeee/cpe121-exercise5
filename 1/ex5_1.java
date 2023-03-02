public class ex5_1{
  public static void main (String[]args){
    Circle C1 = new Circle(4);
    Circle C2 = new Circle(Math.sqrt(2.25)); 
    System.out.print("First Circle (C1)\n ----------\n");
    System.out.println("Circle's Area = "+C1.getArea());
    System.out.println("Circle's Volume = "+C1.getVolume());
    System.out.println("Circle's Circumference = "+C1.getCircumference());
    System.out.print("First Circle (C2)\n ----------\n");
    System.out.println("Circle's Area = "+C2.getArea());
    System.out.println("Circle's Volume = "+C2.getVolume());
    System.out.println("Circle's Circumference = "+C2.getCircumference());
  }
}