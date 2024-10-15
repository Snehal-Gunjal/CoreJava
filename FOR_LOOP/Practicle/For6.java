class For6{
	public static void main( String[]args){
		int num = 12231 ;
		int rev=0 ;
		int d ;
		for(int i=num ; num > 0 ; i = num / 10 ) {
			d = i % 10 ;
			rev = rev*10 + d ;
		}
		System.out.println( "Reversed of a number is :" + rev ) ;
	 }
}

		