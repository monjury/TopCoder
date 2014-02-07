// SRM 154 DIV 2 - 450 points

public class SuperRot {

	public String decoder(String message) {
		
		StringBuilder m = new StringBuilder();
		
		for(char a : message.toCharArray()) {
			
			if((a >= 'A' && a <= 'M' || a >= 'a' && a <= 'm')) {
				a+=13;
			}
			else if((a >= 'N' && a <= 'Z') ||( a >= 'n' && a <= 'z')) {
				a-=13;
			}
			else if(a >= '0' && a <= '4') {
				a+=5;
			}
			else if(a >= '5' && a <= '9') {
				a-=5;
			}
			m.append(a);
		}
		return m.toString();
	}
}