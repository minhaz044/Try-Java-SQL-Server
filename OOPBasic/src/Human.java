
public class Human extends Person implements Student{
	protected String fellings;
	protected String thought;
	protected String  humanity;
	public Human(int id, String name, int age, String gender, String address, String fellings, String thought,
			String humanity) {
		super(id, name, age, gender, address);
		this.fellings = fellings;
		this.thought = thought;
		this.humanity = humanity;
	}

	public String toString() {
		return "Human [fellings=" + fellings + ", thought=" + thought + ", humanity=" + humanity + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender()
				+ ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public String study() {
		return super.getName()+" is Reading.";
		
	}
	public String exam() {
		return "NOT Implimented Yet";
		
	}


}
