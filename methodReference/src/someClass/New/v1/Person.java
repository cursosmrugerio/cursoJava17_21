package someClass.New.v1;

public class Person {
	
	private int id; //0
	private String name;
	private StringBuilder curp;
	
	Person(){
		name = "Person";
		System.out.println("0 Params");
	}
	
	Person(int id){
		this.id = id;
		name = "Person";
		System.out.println("1 Param");
	}
	
	Person(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("2 Params");
	}
	
	Person(int id, String name, StringBuilder curp){
		this.id = id;
		this.name = name;
		this.curp = curp;
		System.out.println("3 Params");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", curp=" + curp + "]";
	}

	

}
