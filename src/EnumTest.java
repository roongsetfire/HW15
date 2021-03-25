
public class EnumTest {
	enum Status {
		HEALTHY, SLEEPY, DEAD
	}

	public static void main(String[] args) {
		Status myStatus = Status.HEALTHY;
		System.out.println(myStatus);
		switch (myStatus) {
		case HEALTHY:
			System.out.println("Already");

			break;
		case SLEEPY:
			System.out.println("So Sleepy");

			break;
		case DEAD:
			System.out.println("Wait me pls");

			break;

		}

	}
}
