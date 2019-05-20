class 1g {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
	}	
}

class A {
	class B {
	}
}
