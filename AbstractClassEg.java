package Feb27;
abstract class Parentabs{
	Parentabs(){
		System.out.println("No-args cons");
		
	}
	abstract void show(); // abstract method
	void run() { //non abstract
		System.out.println("Non abstrsct method");
	}
}
class Childabs extends Parentabs{
	@Override
	void show() {
		System.out.println("parents abstract method");
	}
}

 class AbstractClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentabs object = new Childabs();
		object.show();
		object.run();
}
}
