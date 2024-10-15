
class For12{
	public static void main( String[]args){
		int num = 5, sum=0 , x ;
		x = num ;
	for( int i=1 ; i<=num-1 ; i++ ){
		if( num % i == 0 ){
			sum = sum + i ;	
	 }			
	}
	if( sum==x ){
	  System.out.println( "It is a Perfect Number" ) ;
	}
	else
	  System.out.println( "It is not a perfect number" );
  }
}