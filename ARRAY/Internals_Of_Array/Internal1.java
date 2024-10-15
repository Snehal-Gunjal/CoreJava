class Internal1{
	
	void Fun(int[] xarr ){
		xarr[0] = 70 ;
		xarr[1] = 80 ;
	}
	public static void main( String[]args ){
		Internal1 obj = new Internal1();
		int arr[] = { 10 , 20 , 30 , 40 , 50 } ;
		System.out.println( "Indentity hashcode before change array:");
		System.out.println( System.identityHashCode(arr[0]));
		System.out.println( System.identityHashCode(arr[1]));
		System.out.println( System.identityHashCode(arr[2]));
		System.out.println( System.identityHashCode(arr[3]));
		System.out.println( System.identityHashCode(arr[4]));
		obj.Fun( arr ) ;
		for( int x : arr ){
			System.out.println( x ) ;
		}
		System.out.println( "Identity Hash Code After change array:");
		System.out.println( System.identityHashCode(arr[0]));
		System.out.println( System.identityHashCode(arr[1]));
		System.out.println( System.identityHashCode(arr[2]));
		System.out.println( System.identityHashCode(arr[3]));
		System.out.println( System.identityHashCode(arr[4]));
		int x = 10 ;
		int y = 20 ;
		System.out.println( System.identityHashCode( x ));
		System.out.println( System.identityHashCode( y ));
	}
}

		
		
		

		
		
		
		
		
		
	
