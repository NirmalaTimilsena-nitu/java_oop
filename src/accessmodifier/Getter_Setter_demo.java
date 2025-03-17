package accessmodifier;

class Data1 {
    private String name;
    private int rollno;

    // getter method
    public String getName() {
        return this.name;
    }
    public int getRollno() {
    	return this.rollno;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
    public void setRollno(int rollno) {
    	this.rollno = rollno;
    }
}
public class Getter_Setter_demo {
    public static void main(String[] main){
        Data1 d1 = new Data1();

        // access the private variable using the getter and setter
        d1.setName("BCA 3rd");
        System.out.println(d1.getName());
        d1.setRollno(78);
        System.out.println(d1.getRollno());
    }
}

