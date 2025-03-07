package accessing_method;

public class Call_By_Reference_demo {

	int data = 50;

	void change(Call_By_Reference_demo cd) {
		cd.data = cd.data + 100;// changes will be in the instance variable
	}

	public static void main(String args[]) {
		Call_By_Reference_demo op = new Call_By_Reference_demo();

		System.out.println("before change " + op.data);
		op.change(op);// passing object
		System.out.println("after change " + op.data);

	}
}
//In case of call by reference original value is changed 
//if we made changes in the called method. If we pass object in place of 
//any primitive value, original value will be changed.
//In this example we are passing object as a value. 
