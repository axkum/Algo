package intro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EuclidAlgoTest {
	
	@Test
	public void testFindGCD() {
		EuclidAlgo ea = new EuclidAlgo();
		int gcd = 3;
		assertTrue(gcd == ea.findGCD(6, 3));
		assertTrue(gcd == ea.findGCD2(6, 3));
		assertTrue(gcd == ea.findGCDByEuclid(6, 3));
		System.out.println("--------------------");
		assertTrue(14 == ea.findGCD(98, 56));
		assertTrue(14 == ea.findGCD2(98, 56));
		assertTrue(14 == ea.findGCDByEuclid(98, 56));
	}

}
