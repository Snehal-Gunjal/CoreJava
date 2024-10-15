class For10{
	public static void main( String[]args){
		int num  = 6 , count = 0 ;
		for( int i=1 ; i<=num ; i++ ){
			if( num % i == 0 ){
				count++ ;
			}
		}
		System.out.println( "Total number of a factor is : " + count ) ;
	}
}
				