package Feb27;
// Example of abstraction
abstract class Testabstract{ // abstract class--parent class
	abstract void display(); // abstract method
	// non abstract method
	void show() {
		System.out.println("non abstract method invoked");
	}
	}
		class Demo1 extends Testabstract{ // 1stchild class
			// abstract method of parent class
			void display() {
				System.out.println("Demo1 method invoked");
			}
			}
		class Demo2 extends Testabstract{ // 2nd child class
			// abstract method of parent class
			void display() {
				System.out.println("demo2 method invoked");
			}
		}
	
public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 child1 = new Demo1();
		Demo2 child2 = new Demo2();
		child1.display();
		child2.display();
		child2.show();
	}
}