package someClass.New.v0;

public class Person {
	
	private int id; //0
	private String name;
	
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
