package ass10_2;

public class Rational {

	int numerator;
	int denominator;
	public Rational(int numerator, int denominator) {
		if(denominator<=0) {
			throw new IllegalArgumentException("dinominator can not be less than or equal to ziro");
		}
		this.numerator=numerator;
		this.denominator=denominator;	
	}
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	//adds the rational rat to this Rational
	public Rational add(Rational rat) {
		int gcf = getGCF(denominator, rat.denominator);
		int result = (gcf/denominator * numerator) + (gcf/rat.denominator * rat.numerator);
		return simplified(result,gcf);
	}

	
	public Rational multiply(Rational rat) {
			int numr = numerator * rat.numerator;
			int denum = denominator * rat.denominator;
			
			
		return simplified(numr, denum);
	}
	
	private int getGCF(int n,int d) {
		int larg = (n>d) ? n:d;
		
		int gcf = 1;
		
		for(int i = 1; i<= larg; i++  ) {
			if(n%i == 0 && d%i == 0) {
				gcf = i;
			}
		}
		
		if(gcf == 0){
			return n*d;
		}
		
		return gcf;
	}
	
	public Rational simplified(int n, int d) {
		int smaller = (n < d)? n:d;
		int lcm = 1;
		for(int i=1; i<=smaller; i++) {
			if(n % i == 0 && d % i ==0)
				lcm = i;
		}
		
		return new Rational(n/lcm, d/lcm);
	}
	
	private int compareTo(Rational rat) {
		int res1 = numerator * rat.denominator;
		int res2 = denominator * rat.numerator;
		
		if(res1 == res2)
			return 0;
		else if(res1 < res2)
			return -1;
		else
			return 1;

	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Rational raf = (Rational) obj;
		int resu1 = numerator * raf.denominator;
		int resu2 = denominator * raf.numerator;
		
		if(resu1 != resu2) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}
	
	@Override
	public String toString() {
		return numerator+"/"+denominator	;
	}
	
	public static void main(String[] args) {
		
		Rational rat1 = new Rational(2, 3);
		Rational rat2 = new Rational(-17, 5);
		Rational rat3 = new Rational(1, 3);
		
		
		Rational che1 =  rat1.multiply(rat2).add(rat3);
		Rational che2 = rat1.add(rat2.multiply(rat3));
		
		int compare =  che1.compareTo(che2);
		
		if(compare == 0) {
			System.out.println("(2/3 * -17/5) + 1/3 is equal to 2/3 * (-17/5 + 1/3)");
		}else if(compare > 1) {
			System.out.println("(2/3 * -17/5) + 1/3 is greater than to 2/3 * (-17/5 + 1/3)");
		}else {
			System.out.println("(2/3 * -17/5) + 1/3 is less than to 2/3 * (-17/5 + 1/3)");
		}
		
		
	}
	
	
	
	
}
