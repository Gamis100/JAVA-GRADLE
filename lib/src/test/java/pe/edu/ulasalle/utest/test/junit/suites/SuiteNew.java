package pe.edu.ulasalle.utest.test.junit.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import pe.edu.ulasalle.utest.test.junit.suites.packa.TestA;
import pe.edu.ulasalle.utest.test.junit.suites.packb.TestB;

@Suite
@SelectClasses({TestA.class, GeneracionDynamic.class})
public class SuiteNew {

	
}
