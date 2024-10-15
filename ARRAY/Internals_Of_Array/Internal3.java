class Internal3{
	static void Fun( int[] xarr ){
		xarr[0] = -127 ;
		
	}
	public static void main( String[]args ){
		int[] arr = { -12 , -34 , -78 };
		System.out.println("Identity hash code before changed the array:");
		System.out.println( System.identityHashCode( arr[0] ));
		System.out.println( System.identityHashCode( arr[1] ));
		System.out.println( System.identityHashCode( arr[2] ));
		Fun(arr);
		for( int x : arr ){
			System.out.println( x );
		}
		System.out.println( System.identityHashCode( arr[0] ));
		System.out.println( System.identityHashCode( arr[1] ));
		System.out.println( System.identityHashCode( arr[2] ));
		
	}
}