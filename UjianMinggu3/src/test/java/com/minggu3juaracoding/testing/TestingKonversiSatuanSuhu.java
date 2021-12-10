package com.minggu3juaracoding.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.minggu3juaracoding.function.KonversiSatuanSuhu;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestingKonversiSatuanSuhu {
	
	KonversiSatuanSuhu suhu;
	
	@Before
	public void setUp() throws Exception {
		suhu = new KonversiSatuanSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/parameter_konversisatuansuhu.csv")
	public void testFahrenheitToCelcius(double f, double c) {
		assertEquals(c, suhu.FahrenheitToCelcius(f),0.0001);
	}
	
	@Test
	public void testFahrenheitToCelciusInputBukanAngka() {
		assertEquals("c", suhu.FahrenheitToCelcius("f"),0.0001);
	}
	
	@Test
	public void testFahrenheitToCelciusInputNegatifAngka() {
		assertEquals(2.22222, suhu.FahrenheitToCelcius(-36),0.0001);
	}
	
	@Test
	public void testFahrenheitToCelciusTidakInput() {
		assertEquals(0, suhu.FahrenheitToCelcius(0),0.0001);
	}

}
