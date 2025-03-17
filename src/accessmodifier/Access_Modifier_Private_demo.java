package accessmodifier;
class Data {
    // private variable
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Access_Modifier_Private_demo {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.setName("access Modifier");
    }
}
