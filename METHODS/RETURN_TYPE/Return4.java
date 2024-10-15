class Return4{
	void Fun( int x ) {
		System.out.println( "In Fun Method") ;
	}
	public static void main( String[]args){
		Return4 obj = new Return4();
		int ans = obj.Fun(10) ;
		System.out.println( ans );
		
	}
}