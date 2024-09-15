package day2;

public class VariablesDemo {

	public static void main(String[] args) {

		/*
		 * int a; //------- Declaration // a =100; //------ assignment
		 * 
		 * //int a = 100; // Declaration+assignment System.out.println(a);
		 * 
		 * a = 200; // Update the value of a System.out.println(a);
		 */

		// --------------Approaches to use variables---------------------------

		// --Appraoch-1 ---(If all the varibales belong to diffrent data types)
		/*
		 * int a =100; int b =200; int c =300;
		 */
		// --Approach-2 (If varibale is belong to same data type)
		/*
		 * int a,b,c; a=100; b=200; c=300;
		 */

		// --Approach-3 (If varibale is belong to same data type
		int a = 100, b = 200, c = 300;
		System.out.println("The value of a is : "+a);
		System.out.println("The value of b is : "+b);
		System.out.println("The value of c is : "+c);
		
		// If we want to print all values in single line
		System.out.println(a+" "+b+" "+c);



	}

}
