package accessmodifier;

public class Main {
	public static void main(String[] args) {
//		Student s = new Student();//default accessmodifier
//		s.display();
		Student1 s1 = new Student1();// private access modifier
		s1.setName("prashant");
		System.out.println(s1.getName());

	}

}
