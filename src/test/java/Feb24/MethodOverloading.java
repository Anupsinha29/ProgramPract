package Feb24;

public class MethodOverloading {
	
	
	static int add(int a, int b) {
		return a+b;
		
		
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(MethodOverloading.add(8, 9));
		System.out.println(MethodOverloading.add(1, 2, 3));
		

	}

}
