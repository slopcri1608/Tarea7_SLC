package actividades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	void testEj1() {
		assertEquals(4,Ejercicio2.ej1(2, 2, 3));
		assertEquals(4,Ejercicio2.ej1(2, 6, 3));
		assertEquals(6,Ejercicio2.ej1(2, 6, 1));
		assertEquals(4,Ejercicio2.ej1(1, 2, 3));
	}

	@Test
	void testEj2() {
		assertEquals(6,Ejercicio2.ej2(3, 1, 1));
		assertEquals(6,Ejercicio2.ej2(0, 7, 1));
		assertEquals(6,Ejercicio2.ej2(0, 1, 1));
		assertEquals(4,Ejercicio2.ej2(0, 1, 3));
	}

	@Test
	void testEj5() {
		assertEquals(1,Ejercicio2.ej5(1, 1));
		assertEquals(1,Ejercicio2.ej5(1, 2));
		assertEquals(1,Ejercicio2.ej5(2, 1));
	}

	@Test
	void testEj6() {
		assertEquals(-1,Ejercicio2.ej6(1, 2, 1));
		assertEquals(1,Ejercicio2.ej6(2, 1, 4));
		assertEquals(0,Ejercicio2.ej6(0, 1, 4));
		assertEquals(0,Ejercicio2.ej6(6, 1, 4));

		
	}

	@Test
	void testEj8() {
		assertEquals(0,Ejercicio2.ej8(1, -1));
		assertNotEquals(0,Ejercicio2.ej8(3, 10));

	}

}
