class Break4{
	public static void main( String[]args ){
		int num = 100 ;
		int count = 0 , i ;
		for( i=1 ; i<num ; i++ ){
			if( i%3 ==0 && i%5==0 ){
				count++ ;
				System.out.println( i );
			}
			if( count > 5 ){
				break ;
			}
		}
		System.out.println( i ); //how many times loop iterate out of 100;
	}
}