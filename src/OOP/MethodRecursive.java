package OOP;

public class MethodRecursive {

	public static void main(String[] args) {

		int num = 5;
		System.out.println(factorial(1, num));
		
	}
	
//	Method Recursive မှာ stack over flow error တက်နိုင်လို့ သတိထားပါ
	static int factorial(int result, int time) {
		if (time == 1) return result;
		return factorial(result * time, --time);
	}

}
