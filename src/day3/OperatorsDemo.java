package day3;

public class OperatorsDemo {

	public static void main(String[] args) {

		// --1) Arithmetic operators + - * / %

		int a = 5, b = 2;
		System.out.println("The sum of the a and b is : " + (a + b));
		System.out.println("The difference between a and b is : " + (a - b));
		System.out.println("The multiplication of a and b is : " + (a * b));
		System.out.println("The Division of a and b is : " + (a / b)); // Quotent value
		System.out.println("The modulo of a and b is : " + (a % b)); // Reminder value
		System.out.println("=========================================");
		// --2)Relational/comparison operators > >= < <= != ==
		// This operators return boolean value true or false
		int c = 10, d = 11;
		System.out.println(c < d); // -True
		System.out.println(c > d); // -False
		System.out.println(c <= d); // -True
		System.out.println(c >= d); // -False
		System.out.println(c != d); // -True
		System.out.println(c == d); // -False
		System.out.println("=========================================");
		// --3)Logical operators && || !
		// This operators return boolean value true or false
		// works between two boolean values
		boolean x = true;
		boolean y = false;
		System.out.println(x && y); // -False
		System.out.println(x || y); // -True
		System.out.println(!x); // -False
		System.out.println(!y); // -True
		boolean b1 = 10 > 20;
		boolean b2 = 20 < 30;
		System.out.println(b1); // -False
		System.out.println(b2); // -True
		System.out.println(b1 && b2); // -False
		System.out.println(b1 || b2); // -True
		System.out.println((10 < 20) && (10 > 20)); // -False
		System.out.println("=========================================");

	}

}
