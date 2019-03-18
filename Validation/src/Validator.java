import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Validator  {
	public  static  String validatePhoneNumber (String s) {
		s=s.trim();
		if(s.length()==11) {
			if(s.startsWith("01")) {
				if(Character.getNumericValue(s.charAt(2))==2 || Character.getNumericValue(s.charAt(2))==0 ) {/*(Character.getNumericValue(s.charAt(1))!=1 || Character.getNumericValue(s.charAt(1))!=3 ||Character.getNumericValue(s.charAt(1))!=4 ||Character.getNumericValue(s.charAt(1))!=6) && */ 
					return null;
				}
				
				for (int i =3 ; i < s.length(); i++) {
					if(Character.getNumericValue(s.charAt(2))< 0 || Character.getNumericValue(s.charAt(2))>9) {
						return null;
						}
				}
				return s;
			}
		}else if(s.length()==13) {
			if(s.startsWith("+8801")) {
				if(Character.getNumericValue(s.charAt(5))==2 || Character.getNumericValue(s.charAt(5))==0 ) {/*(Character.getNumericValue(s.charAt(1))!=1 || Character.getNumericValue(s.charAt(1))!=3 ||Character.getNumericValue(s.charAt(1))!=4 ||Character.getNumericValue(s.charAt(1))!=6) && */ 
					return null;
				}
				for (int i =6 ; i < s.length(); i++) {
					if(Character.getNumericValue(s.charAt(i))<0 || Character.getNumericValue(s.charAt(i))>9) {
						return null;
					}
				}
				return s;
			}			
		}
		return null;
	}
	public static  String validateEmail(String s) {
		s=s.trim();
		s=s.toLowerCase();
		String regex="^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher=pattern.matcher(s);
		return matcher.matches()?s:null;
	}
		
	
	
}
