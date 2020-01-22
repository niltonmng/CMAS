package cmas;

public class Step1 {
	
	public String printCMASsystems(int entry) {
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