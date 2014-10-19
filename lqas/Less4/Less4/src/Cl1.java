
public class Cl1 extends ClMain implements Inter{

	public static void main(String[] args) {
		func2();
		ClMain c1 = new ClMain();
		c1.func1();
		Cl1 c2 = new Cl1();
		c2.func3();
		func5();
		
	}

	@Override
	public void func3() {
		System.out.println("Inter");
		func1();
		System.out.println(func1(1, 1));
	}
	
	@Override
	public void func1() {
		System.out.println("Well Done");
	}
	
	public Integer func1(int a, int b) {
		Integer c = 0;
		c= a+b;
		return c;	
	}
	
	public static void func6()
	{}

}
