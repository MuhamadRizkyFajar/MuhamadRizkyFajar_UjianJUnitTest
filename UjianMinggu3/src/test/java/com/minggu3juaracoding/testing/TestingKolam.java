package com.minggu3juaracoding.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.minggu3juaracoding.function.Kolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestingKolam {
	
	Kolam kolam;
	
	@Before
	public void setUp() throws Exception {
		kolam = new Kolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/parameter_kelilingkolam.csv")
	public void testKelilingKolam(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, kolam.kelilingKolam(panjang, lebar, tinggi),0.0);
	}
	
	@Test
	public void testKelilingKolamInputBukanAngka() {
		assertEquals("hasil", kolam.kelilingKolam("panjang", "lebar", "tinggi"),0.0);
	}
	
	@Test
	public void testKelilingKolamInputNegatifAngka() {
		assertEquals(82, kolam.kelilingKolam(-5.5, -12, -3),0.0);
	}
	
	@Test
	public void testKelilingKolamTidakInput() {
		assertEquals(0, kolam.kelilingKolam(0, 0, 0),0.0);
	}

	@Test
	@FileParameters("src/test/resources/parameter_volumekolam.csv")
	public void testVolumeKolam(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, kolam.volumeKolam(panjang, lebar, tinggi),0.0);
	}
	
	@Test
	public void testVolumeKolamInputBukanAngka() {
		assertEquals("hasil", kolam.volumeKolam("panjang", "lebar", "tinggi"),0.0);
	}
	
	@Test
	public void testVolumeKolamInputNegatifAngka() {
		assertEquals(198, kolam.volumeKolam(-5.5, -12, -3),0.0);
	}
	
	@Test
	public void testVolumeKolamTidakInput() {
		assertEquals(0, kolam.volumeKolam(0, 0, 0),0.0);
	}

}
