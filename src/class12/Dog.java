package class12;

public class Dog {
    private String name;
    private String breed;
    
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog("jojo","pug");
		System.out.println(obj);
		obj.setName("bojo");
		obj.setBreed("bommarian");
		System.out.println(obj);
		

	}

}
