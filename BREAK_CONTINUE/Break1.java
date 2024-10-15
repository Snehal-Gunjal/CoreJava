class Break1{
	public static void main( String[]args){
		int num = 12 ;
		int count = 0 ;
		int i ;
		for( i=1 ; i<=num ; i++ ){
			if( num % i == 0 ){
				count++ ;
			}
			if( count > 2 ){
				break;
			}
		}
		System.out.println( i ) ;  //how many times loop iterate ;
		if( count==2 ){
			System.out.println( "Prime Number" ) ;
		}
		else
			System.out.println( "Not Prime" ) ;
	}
}