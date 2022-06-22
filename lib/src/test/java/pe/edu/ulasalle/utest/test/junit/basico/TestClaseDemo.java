package pe.edu.ulasalle.utest.test.junit.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import pe.edu.ulasalle.utest.junit.basico.ClaseDemo;
import pe.edu.ulasalle.utest.junit.basico.exception.DivisionPorZeroException;

class TestClaseDemo {

	@Test
	void testEjecutarSuma() {
		int input1 = 10;
		int input2 = 20;
		ClaseDemo c = new ClaseDemo();
		int output = c.ejecutarSuma(input1, input2);
		assertEquals(30, output);
	}

	@Test
	void testEjecutarResta() {
		int input1 = 10;
		int input2 = 20;
		ClaseDemo c = new ClaseDemo();
		int output = c.ejecutarResta(input1, input2);
		assertEquals(-10, output);
	}

	@Test
	void testEjecutarMultiplicacion() {
		int input1 = 10;
		int input2 = 20;
		ClaseDemo c = new ClaseDemo();
		int output = c.ejecutarMultiplicacion(input1, input2);
		assertEquals(200, output);
	}

	@Test
	void testEjecutarDivision() {
		int input1 = 100;
		int input2 = 20;
		ClaseDemo c = new ClaseDemo();
		int output;
		output = c.ejecutarDivision(input1, input2);
		assertEquals(5, output);
	}

	
	@Test
	void testEjecutarDivisionPorZero() {
		int input1 = 100;
		int input2 = 0;
		ClaseDemo c = new ClaseDemo();
		assertThrows(DivisionPorZeroException.class, ()->c.ejecutarDivision(input1, input2));
	}
}
