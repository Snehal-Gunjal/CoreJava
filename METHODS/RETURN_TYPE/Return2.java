class Return2{
	int Fun( int x ) {
		System.out.println( "In Fun Method") ;
	}
	public static void main( String[]args){
		Return2 obj = new Return2();
		int ans = obj.Fun(10) ;
		System.out.println( ans );
		
	}
}