package inheritance;

//Base class
class First {
  public void printOne() {
    System.out.println("printOne() Method of Class One");
  }
}

// Derived class 1
class Second extends First {
  public void printTwo() {
    System.out.println("Two() Method of Class Two");
  }
}

// Derived class 2
class Third extends First {
  public void printThree() {
    System.out.println("printThree() Method of Class Three");
  }
}

// Testing CLass
public class Hierarchical_Inheritance_Demo {
  public static void main(String args[]) {
    Second s = new Second();
    Third t = new Third();

    //All classes can access the method of class One
    s.printOne();
    t.printOne();
  }
}