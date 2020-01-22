import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cmas.Step1;
import cmas.Step2;

class Tests {
	
	@Test
	void test() {
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
		
		
		assertEquals(step_1, aux1);
		assertEquals(step_2, aux2);
		assertEquals("CMAS: 4\n" + "systems: 3\n" + "CMASsystems: 1\n" + "good: 2\n" + "integer: 10", s2.counter(step_3));
	}

}
