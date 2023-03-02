class Circle{
  public final double CirclePi = 3.14;
  private double r;
  public Circle(double radius){
    this.r =radius;
  }
  public double getArea(){
    return CirclePi*r*r;
  }
  public double getVolume(){
    return (4/3)*CirclePi*r*r*r;
  }
  public double getCircumference(){
    return 2*CirclePi*r;
  }
}