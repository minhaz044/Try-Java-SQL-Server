
public class Parents {
	public String  lastname=null,skinColor=null,hight=null;
	
	public Parents(String lastname, String skinColor, String hight) {
		super();
		this.lastname = lastname;
		this.skinColor = skinColor;
		this.hight = hight;
	}

	public void details()
	{
		System.out.println("Information About the Person:\n"
	+"Name:"+lastname+"\n"+"skinColor:"+skinColor+"\n"+"hight:"+hight);
		
	}
}
