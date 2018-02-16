import java.util.*;

class Circle{
private
double radius = 1.0;
String colour = "Red";

Circle(){

}
Circle(double r){
  this.radius = r;
  //this.colour = c;
}

public double getRadius(){
  return radius;
}
public double getArea(){
  double a = 3.14 * radius * radius;
  return a;
}
}


public class circleRadius{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double r = scan.nextDouble();
    //String c = scan.next();

    Circle c1 = new Circle(r);
    System.out.println("Radius " + c1.getRadius());
    System.out.println("Area " + c1.getArea());
  }
}
