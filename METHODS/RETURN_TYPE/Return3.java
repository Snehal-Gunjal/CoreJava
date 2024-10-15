class Return3{
	int Fun( int x ) {
		System.out.println( "In Fun Method") ;
        return x ;
        System.out.println( "Outside");
	}
	public static void main( String[]args){
		Return3 obj = new Return3();
		int ans = obj.Fun(10) ;
		System.out.println( ans );
		
	}
}