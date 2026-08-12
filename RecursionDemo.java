package OOPSC26CS070;

class Recursion{
	public void reduceByOne(int n) {
		if(n>=0) {
			reduceByOne(n-1);
		}
		System.out.print(n);
	}
}

public class RecursionDemo {
	public static void main(String[]args) {
	
		Recursion test=new Recursion();
		test.reduceByOne(3);
	}

}
