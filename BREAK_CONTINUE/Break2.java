class Break2{
	public static void main( String[]args ){
		int num = 100 ;
		int count = 0 ;
		int i; 
		for( i=1 ; i<=num ; i++){
			if( i % 2 == 0 ){
				count++ ;
				System.out.println( i ) ;
			}
			if( count >10 ) {
				break;
			}
		}
	}
}