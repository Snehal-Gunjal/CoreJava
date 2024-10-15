class Internal4{
	static void Fun( char[] xarr ){
		xarr[0] = 'D' ;
	}
	public static void main( String[]args ){
		char[] arr = { 'A' ,'B' , 'C' } ;
		System.out.println(System.identityHashCode( arr[0] ));
		System.out.println(System.identityHashCode( arr[1] ));
		System.out.println(System.identityHashCode( arr[2] ));
		Fun( arr );
		for( char x : arr ){
			System.out.println( x ) ;
		}
		System.out.println(System.identityHashCode( arr[0] ));
		System.out.println(System.identityHashCode( arr[1] ));
		System.out.println(System.identityHashCode( arr[2] ));
		char x = 'A' ;
		System.out.println( System.identityHashCode( x));
	}
}
		
		
