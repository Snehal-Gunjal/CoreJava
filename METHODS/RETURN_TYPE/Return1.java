class Return1{
	int Fun(int x , int y ) {
		System.out.println( "In Fun Method") ;
        return x + y ;
	}
	public static void main( String[]args){
		Return1 obj = new Return1() ;
		System.out.println(obj.Fun(10 , 20 ));
	}
}