package test1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.method1();
		t.method2();

	}
	 void method1()
	{
		System.out.println("method 1 called");
		method2();
		
	}
	 void method2()
	{
		System.out.println("Method 2 called");
		
	}

}
