package day3;

public class DecrementOperator {

	public static void main(String[] args) {
		
		//--Case 1:
		int a = 10;
		a--; //10-1=9
		System.out.println(a);
		
		//--Case 2 : 
		int b =100;
		int result = b--; //Post decrement
		System.out.println(result); //100
		System.out.println(b); //99
		
		//--Case 3 :
		int c = 50;
		int res = --c;  //Pre decrement
		System.out.println(res); //49
		System.out.println(c); //49
				
	}

}
