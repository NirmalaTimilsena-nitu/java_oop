package constructor;

class Parent {

	Parent() {

		System.out.println("Parent Constructor");

	}

	Parent(int x) {

		System.out.println("The value of x is :" + x);

	}

}

class Child extends Parent {

	Child() {

		super(5);

		System.out.println("Child Constructor");

	}

	public static void main(String[] args) {

		Child c = new Child();

	}

}
