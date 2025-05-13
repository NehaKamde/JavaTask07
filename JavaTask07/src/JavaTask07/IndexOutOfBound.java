package JavaTask07;

public class IndexOutOfBound {

	public static void main(String[] args) {
		try {
			int num[] = { 1, 2, 3, 4, 5 };
			System.out.println("Accessing element at index 6 : " + num[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Error is: " + e.getMessage());
		}

		try {
			String str = "Hello from String";
			System.out.println("Character at index 19: " + str.charAt(19));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Error is : " + e.getMessage());
		}

	}

}
