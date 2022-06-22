package pe.edu.ulasalle.utest.test.mockito.dobles;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import pe.edu.ulasalle.utest.utils.ReaderProperties;
import pe.edu.ulasalle.utest.utils.SenderEmail;
import pe.edu.ulasalle.utest.utils.SenderSms;
import pe.edu.ulasalle.utest.utils.UtilText;

public class TestUtilText {

	@Spy
	@InjectMocks
	private UtilText util;
	
	@Mock
	private SenderEmail senderEmail;
	
	@Mock
	private SenderSms senderSms;
	
	@Spy
	private ReaderProperties readerProp;
	
	@BeforeEach
	public void init() {
	    MockitoAnnotations.openMocks(this); 
	}
	
	@Test
	void testEncriptar() {
		// ejemplo de Stub
		String texto = "hello UTEST";
		Mockito.when(util.encriptar(texto)).thenReturn("abcdefghijklmnopqrstu");
		assertEquals("abcdefghijklmnopqrstu", util.encriptar(texto));
	}
	
	@Test
	void testEnviarEmail() {
		String email = "myfriend@gmail.com";
		String text = "Hi My friend, Regards.";
		Mockito.when(senderEmail.sendEmail(email, text)).thenReturn(true);
		assertEquals(true, util.enviarEmail(email, text));
	}	
	
	@Test
	void testEnviarSms() {
		String number = "123465789";
		String text = "Hola";
		Mockito.when(senderSms.sendSms(number, text)).thenReturn(true);
		assertEquals(true, util.enviarSms(number, text));
	}
	
	@Test
    void testLeerPropiedad() {
        String archivo = "config.properties";
        String propiedad = "uls.usuario";
        assertEquals("ulsutest", util.leerPropiedad(archivo, propiedad));
    }
	
	@Test
	void testADate() {
		String dateStr = "2020/06/18";
		int hora = 9;
		int minuto = 21;
		util.aDate(dateStr, hora, minuto);
		Mockito.verify(util).aCalendar(dateStr, "yyyy/MM/dd", hora, minuto);
	}

}

