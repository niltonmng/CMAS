package cmas;

public class Step2 extends Step1 {
	
	@Override
	public String printCMASsystems(int entry) {
		if (String.valueOf(entry).contains("3")) {
			return "good";
		} else {
			if (entry % 15 == 0) {
				return "CMASsystems";
			} else if (entry % 5 == 0) {
				return "systems";
			} else if (entry % 3 == 0){
				return "CMAS";
			}
			return String.valueOf(entry);
		}
	}
	
	
	public String counter(String entry) {
		int CMAS = 0;
		int systems = 0;
		int good = 0;
		int CMASsystems = 0;
		int integerCount = 0;
		
		String[] myEntry = entry.split(" ");
		
		for (int i = 0; i < myEntry.length; i++) {
			if ("CMAS".equals(myEntry[i])) {
				CMAS++;
			}
			else if ("systems".equals(myEntry[i])) {
				systems++;
			}
			else if ("good".equals(myEntry[i])) {
				good++;
			}
			else if ("CMASsystems".equals(myEntry[i])) {
				CMASsystems++;
			} else {
				integerCount++;
			}
		}
		
		return "CMAS: " + CMAS + "\n" +
			   "systems: " + systems + "\n" +
			   "CMASsystems: " + CMASsystems + "\n" +
			   "good: " + good + "\n" +
			   "integer: " + integerCount;
	}
}
