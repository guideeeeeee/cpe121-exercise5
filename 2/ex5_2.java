public class ex5_2{
  public static void main(String[]args){
    Triangle tri1 = new Triangle(12,6,10);
    Triangle tri2 = new Triangle(11,5,15);
    System.out.println("First Triangle (T1)");
    System.out.println("----------");
    System.out.println("Triangle's area = "+tri1.getArea());
    System.out.println("Triangle's perimeter = "+tri1.getPerimeter());
    System.out.println();
    System.out.println("Second Triangle (T2)");
    System.out.println("----------");
    System.out.println("Triangle's area = "+tri2.getArea());
    System.out.println("Triangle's perimeter = "+tri2.getPerimeter());
  }
}