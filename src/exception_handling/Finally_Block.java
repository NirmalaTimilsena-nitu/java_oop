package exception_handling;

public class Finally_Block {
	  public static void main(String[] args) {
	    try {
	      // code that generates exception
	      int divideByZero = 5 / 0;
	    }

	    catch (ArithmeticException e) {
	      System.out.println("ArithmeticException => " + e.getMessage());
	    }
	    
	    finally {
	      System.out.println("This is the finally block");
	    }
	  }
	}
//the finally block is always executed no matter whether there is an exception or not.
//The finally block is optional. And, for each try block, there can be only one finally block.