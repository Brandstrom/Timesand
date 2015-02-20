
public class Dog extends Mammal {
	
	private boolean isStupid;

	public Dog(String latinName, int gestationTime, boolean isStupid) {
		super(latinName, gestationTime);
		this.isStupid = isStupid;
	}
	
	public Dog(String latinName, int gestationTime, boolean isStupid, String friendlyName) {
		super(latinName, gestationTime);
		this.isStupid = isStupid;
		setFriendlyName(friendlyName);
	}

	public boolean isStupid() {
		return isStupid;
	}
	
	@Override
	public String getInfo() {
		String info = "";
		if(isStupid) {
			info = "en hund som heter: " + getFriendlyName() + ", latin: " + getLatinName() + 
			" som har dr�ktighetsperiod i " + getGestationTime() + " m�nader och �r dum";
		} else {
			info = "en hund som heter: " + getFriendlyName() + ", latin: " + getLatinName() + 
			" som har dr�ktighetsperiod i " + getGestationTime() + " m�nader och �r inte dum";
		}
		return info;
	}
	
	
}
