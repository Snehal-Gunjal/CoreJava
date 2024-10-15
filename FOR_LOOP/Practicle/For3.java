class For3{
	public static void main( String[]args){
		int num = 108 ;
		int count = 0 ;
		int digit ;
		for( int i = num ; i > 0 ; i = i / 10 ){
			digit = i % 10 ;
			count++ ;
		}
		System.out.println( + count );
	}
}	
		
	