package intro;

public class EuclidAlgo {
	
	public int findGCDByEuclid(int m, int n) {
		if (m < n) {
			int t = m;
			m = n;
			n = t;
		}
		int r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		System.out.println("Euclid:" + n);
		return n;
	}

	public int findGCD(int m, int n) {
		int gcd = 1;
		for (int i = 1; i <= m && i <= n; i++) {
			if (m % i == 0 && n % i == 0) {
				gcd = i;
			}
		}

		System.out.println(gcd);

		return gcd;
	}
	
	public int findGCD2(int m, int n) {
		//int gcd = 1;
		while (m!=n) {
			if (m > n) {
				m = m-n;
			} else {
				n = n-m;
			}
		}
		System.out.println(m);
		return m;
	}

}
