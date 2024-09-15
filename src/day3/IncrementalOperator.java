package day3;

public class IncrementalOperator {

	public static void main(String[] args) {

		// ++ is called incremental operator

		// --Case 1:
		int a = 10;
		System.out.println(a);
		a++; // a+1=10+1=1
		System.out.println(a);

		// --case 2:
		int b = 20;
		int result = b++; // Post Increment
		System.out.println(result); // 20
		System.out.println(b);// 21

		// --case 3:
		int c = 30;
		int res= ++c; // Pre Increment
		System.out.println(res); // 31
		System.out.println(c);//31 

	}

}
