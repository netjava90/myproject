package nestedclass;

public class TestOuter {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.inner.innerMethod();
		//ob/hostclass(inside the outer class).ob/innerclass(inside the hostclass).[  ]();

	}    //System.out.println(); out is a nested class inside a class. 

}
