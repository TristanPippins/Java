class Array2DDemo {
	public static void main (String args[]){
		int i,r,c;
		int fish [ ][ ] = {{0,1,2,3,4,5,6,7}
						 ,{0,1,2,3,4,5,6,7}
						 ,{0,1,2,3,4,5,6,7}
						 ,{0,1,2,3,4,5,6,7}
						 ,{0,1,2,3,4,5,6,7}
						 ,{0,1,2,3,4,5,6,7}
						 ,{0,1,2,3,4,5,6,7}
						 ,{0,1,2,3,4,5,6,7}
						 ,{0,1,2,3,4,5,6,7} };
	for (r=0; r < 8; r++){
		for (c=0; c < 8; c++){
			System.out.print(fish[r][c]);
		}
		System.out.println();
	}
    }
}
