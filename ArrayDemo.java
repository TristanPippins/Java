//save
class ArrayDemo {
	public static void main (String args[]) {
		int i;
		int [] fish;
		fish = new int [10];
		//put elements in the array
		fish[0] = 1; fish[1] = 1; fish[2] = 2;
		fish[3] = 3; fish[4] = 5; fish[5] = 8;
		fish[6]	= 13; fish[7]= 21; fish[8] = 34;
		fish[9]	= 55;
		System.out.println(" - - - - -");
		for (i = 0;i < 10; i++){
			System.out.print(fish[i]);
			System.out.print(" ");
		}
			System.out.println(" - - - - -");


	}//end main
}// end class
