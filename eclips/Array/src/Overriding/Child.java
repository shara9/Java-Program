package Overriding;

public class Child extends Parent {

	@Override
	int pare(int a, int b) {
		return a - b;
	}
	void child()
	{
	System.out.println("child");
	}
}
