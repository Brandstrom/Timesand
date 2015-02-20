public class Snake extends Animal {
	
	private boolean isPoisonous;

	public Snake(String latinName, boolean isPoisonous) {
		super(latinName);
		this.isPoisonous = isPoisonous;
	}

	@Override
	public String getInfo() {
		String info = "";
		if(isPoisonous) {
			info = "en orm som heter " + getFriendlyName() + ", latin: " + getLatinName() +
				" och som �r giftig";
		} else {
			info = "en orm som heter " + getFriendlyName() + ", latin: " + getLatinName() +
				" och som �r inte giftig";
		}
		
		return info;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}
	
	

}