
public class Son extends Parents {
	
	String language=null;
	@Override
	public void details() {
		super.details();
		System.out.println("language:"+language);
	}

	public Son(String lastname, String skinColor, String hight, String language) {
		super(lastname, skinColor, hight);
		this.language = language;
	}

}
