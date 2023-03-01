package Feb28;
abstract class Shape1{            //abstract class
	abstract void calculateArea();//abstract method
}
class Circle1 extends Shape1{
	void calculateArea() {        //implement of abstract method
		System.out.println("Area of circle");
	}
}
class Rectangle extends Shape1{
	void calculateArea() {         //implement of abstract method
		System.out.println("Area of rectangle");
	}
}
public class Eg4 {//main class
public static void main(String[] args) {   //main method
	Circle1 c1 = new Circle1();
	Rectangle r1= new Rectangle();
	c1.calculateArea();
	r1.calculateArea();
}
}