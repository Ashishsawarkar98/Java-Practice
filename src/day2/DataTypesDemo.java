package day2;

public class DataTypesDemo {

	public static void main(String[] args) {

		// --Numeric Data type
		int a = 100; // -- Range = 4 byte
		System.out.println("The value of a is : " + a);

		byte b = 127; // --Range = 1 byte
		System.out.println("The value of b is : " + b);

		short c = 32766; // --Range = 2 byte
		System.out.println("The value of c is : " + c);
		// --Note : For long and float data type we need to add litrel l
		long d = 9307034031L; // --Range = 8 byte
		System.out.println("The valuje of d is: " + d);

		// --Decimal Number
		float f = 15.5f;
		System.out.println("The value of f is : " + f);
		double g = 152256.36589;
		System.out.println("The value of g is : " + g);

		char grade = 'A'; // --char store single charecter
		System.out.println("The grade is : " + grade);

		String name = "Ashish Sawarkar"; // --String store multiple charecter
		System.out.println("My name is : " + name);

		boolean b1 = true;
		System.out.println("Ashish is Softaware Test Engineer : " + b1);

		/*
		 * Note : Java is statically type programmed languange int x =100; x =
		 * "Welcome";
		 */

	}

}
