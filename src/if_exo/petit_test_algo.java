package if_exo;

public class petit_test_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x < 100; x++) {

			if (x < 3) {
				System.out.println("Micro fonctionne bein");

			} else {
				if (x % 2 == 0) {
					System.out.println("comment vous appelez vous " + x);
				} else if (x % 3 == 0) {
					System.out.println(" je ne parle pas binaire ");
				} else if (x % 5 == 0) {
					System.out.println(" FizzBuzz");
				} else {
					System.out.println("toilette");
				}

			}

		}

	}
}