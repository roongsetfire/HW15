
public class New extends Earthling{
	
	public static void main(String[] args) {
		New test = new New() ;
		test.move();
		test.eat();
	}
	public void move() {
		System.out.println("Move");
	}
	public void eat() {
		System.out.println("Eat");
	}
}