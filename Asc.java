//save as Asc.java
class Asc {
	public static void main (String args[]){
		     int n;		char c;
	         String hex;   String bin;
	         n = 0;
	 
		while (n < 1024){
		   c = (char)n;
		   System.out.print("\t");
		   System.out.print(n);
		   System.out.print("\t");
		   System.out.print(c);
		   System.out.print("\t");
		   hex = Integer.toHexString(c);
		   bin = Integer.toBinaryString(c);
		   System.out.print(hex);
		   System.out.print("\t");
		   System.out.print(bin);
		   System.out.print("\t");
		   System.out.println();
		   n = n + 1;
		}
	}
}
				
