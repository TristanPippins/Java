class DivMod {

	public static void main(String args[]){
	double dn, dthree,ddiv3;
	int n, three, div3;

		for (n = 1; n < 101; n++){
			dn = (int)n;
			div3 = n / 3;
			three = n % 3;
		
			ddiv3 = (double) dn / 3;
			dthree = (double)dn % 3;
		
		
			System.out.println("integers " +n+" mod 3 is equal to "+three+" and "+n+" div 3 is equal to "+div3 );
			System.out.println("double  "+n+" mod 3 is equal to "+dthree+" and "+n+" divided by 3 is equal to "+ddiv3 );
			if (n % 2 == 0) System.out.println();

		}
	}

}
