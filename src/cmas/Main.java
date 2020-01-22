package cmas;

public class Main {
	
	public static void main(String[] args) {
		Step1 s1 = new Step1();
		Step2 s2 = new Step2();
		
		String step_1 = "1 2 CMAS 4 systems CMAS 7 8 CMAS systems 11 CMAS 13 14 CMASsystems 16 17 CMAS 19 systems";		
		String step_2 = "1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems";
		String step_3 = "1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems";
		
		String aux1 = "";
		String aux2 = "";
		
		for (int i = 1; i <= 20; i++) {
			aux1 += s1.printCMASsystems(i) + " ";
			aux2 += s2.printCMASsystems(i) + " ";
		}
		aux1 = aux1.trim();
		aux2 = aux2.trim();
		
		System.out.println("Test: " + step_1 + "\n" + "Output: " + aux1);
		System.out.println();
		
		System.out.println("Test: " + step_2 + "\n" + "Output: " + aux2);
		System.out.println();
		
		System.out.println(aux1.equals(step_1));
		System.out.println(aux2.equals(step_2));
		
		System.out.println();
		
		System.out.println(s2.counter(step_3));
	}

}
