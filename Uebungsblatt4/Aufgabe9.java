class Aufgabe9 {
	public static void main(String[] args) {
		C b = new C();
		b.g();
	}
}

class A {
	public void f() {
		System.out.println("A.f()");
	}

	public void h() {
		System.out.println("A.h()");
	}
}

class B extends A {
	public void f() {
		System.out.println("B.f()");
	}

	public void g() {
		System.out.println("B.g()");
	}
}

class C extends B {
	public void g() {
		System.out.println("C.g()");
	}
}
