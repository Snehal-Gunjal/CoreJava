class Identity4{
	public static void main( String[]args ){
		float[] arr1 = { 10.2f , 45.6f };
		float[] arr2 = { 23.4f , 56.6f } ;
		System.out.println( arr1 );
		System.out.println( arr2 );
		System.out.println( System.identityHashCode(arr1[0]));
		System.out.println( System.identityHashCode(arr2[0]));
		boolean[] arr3 = { true , false } ;
		boolean[] arr4 = { true , false };
		System.out.println( arr3 );
		System.out.println( arr4 );
		System.out.println( System.identityHashCode(arr3[0]));
		System.out.println( System.identityHashCode(arr4[0]));
		long[] arr5 = { 12345 };
		System.out.println( arr5 );
		short[] arr6 = { 12 , 34 };
		System.out.println( arr6 );
		byte[] arr7 = { 2 , 5 };
		System.out.println( arr7 );
			
	}
}
		
		