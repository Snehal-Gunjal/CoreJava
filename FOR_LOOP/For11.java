class For11{
	public static void main( String[]args ){
		int num = 3 , flag = 0 , i;
		for(  i=2 ; i<=num ; i++ ){
			if( num%i==0 ){
				flag = 1 ;
			}
		}
		if(i==num){
			System.out.println( "Prime") ;
		}
		else
		    System.out.println( "Not a Prime") ;
	}
}