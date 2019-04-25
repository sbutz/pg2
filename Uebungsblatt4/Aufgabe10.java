class Aufgabe10 {
	public static void main(String[] args) {
		I x = new B();
		x.f();
	}
}

interface I {
	void f();
}

class A {
	public void f() {
		System.out.println("A.f()");
	}
}

class B extends A implements I {
}
