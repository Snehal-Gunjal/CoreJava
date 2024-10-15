class For13{
	public static void main( String[]args){
		int num = 1234 ; int x = num ;
		int digit , sum=0 ;
		for( int i = num ; i>0 ; i = i / 10 ){
			digit = i % 10 ;
		    sum = sum + digit * digit * digit * digit ;
		}
		if( x == sum ){
			System.out.println( "The number is a Armstrong Number");
		}
		else
		{
			System.out.println("The number is not a Armstrong number") ;
		}
		
	}
}
