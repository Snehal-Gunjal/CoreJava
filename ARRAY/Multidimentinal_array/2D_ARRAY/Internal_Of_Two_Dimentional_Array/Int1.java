class Int1{
	public static void main( String[]args ){
		int[][] arr = new int[2][2];
		arr[0][0] = 10 ;
		arr[0][1] = 10 ;
		arr[1][0] = 10 ;
		arr[1][1] = 10 ;
        System.out.println(arr );
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( "Identity Hash Code:");
		System.out.println( System.identityHashCode(arr));
		System.out.println( System.identityHashCode(arr[0] ));
		System.out.println( System.identityHashCode(arr[1]));
		System.out.println( System.identityHashCode(arr[0][0]));
		System.out.println( System.identityHashCode(arr[0][1]));
		
	}
}
