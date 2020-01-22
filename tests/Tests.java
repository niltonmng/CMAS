import static org.junit.jupiter.api.Assertions.*;

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
		
		assertEquals("1 2 CMAS 4 systems CMAS 7 8 CMAS systems 11 CMAS 13 14 CMASsystems 16 17 CMAS 19 systems", aux1);
		assertEquals("1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems", aux2);
		assertEquals("CMAS: 4\n" + "systems: 3\n" + "CMASsystems: 1\n" + "good: 2\n" + "integer: 10", s2.counter(step_3));

		assertNotEquals(aux1.split(" "), aux2.split(" "));
		
		assertTrue(step_1.equals(aux1));
		assertTrue(step_2.equals(aux2));
		assertTrue("CMAS: 4\nsystems: 3\nCMASsystems: 1\ngood: 2\ninteger: 10".equals(s2.counter(step_3)));
		
		assertFalse(step_1.equals(aux2));
		assertFalse(step_2.equals(aux1));
		assertFalse("CMAS: 4\nsystems: 3\nCMASsystems: 1\ngood: 2\ninteger: 10".equals(s2.counter(step_1)));
		
		
	}

}
