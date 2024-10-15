class Internal2{
	void Gun( int[] arr ){
		arr[0] = 250 ; 
		arr[1] = 300 ;
	}
	public static void main( String[]args ){
		Internal2 obj = new Internal2();
		int[] arr = {100 , 200 , 300 };
		System.out.println("Identity hash code before changed the array:");
		System.out.println( System.identityHashCode( arr[0] ));
		System.out.println( System.identityHashCode( arr[1] ));
		System.out.println( System.identityHashCode( arr[2] ));
		obj.Gun(arr);
		for( int x : arr ){
			System.out.println( x );
		}
		System.out.println( System.identityHashCode( arr[0] ));
		System.out.println( System.identityHashCode( arr[1] ));
		System.out.println( System.identityHashCode( arr[2] ));
		int x = 100 ;
		int y = 200 ;
        System.out.println( System.identityHashCode( x ));
	    System.out.println( System.identityHashCode( y ));

	}
}
		
		
		
		
		
