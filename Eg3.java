package Feb28;
interface Person{
	void speak();
}
class Student1 implements Person{
	@Override
	public void speak () {
		System.out.println("A person who his nature is good");
	}
}
class Teacher implements Person{
	@Override
	public void speak() {
		System.out.println("respect our teacher");
	}
}
public class Eg3 {
	public static void main(String[] args) {
		Person obj = new  Student1();
		Person obj1 = new Teacher();
		obj1.speak();
		obj.speak();
	}

}