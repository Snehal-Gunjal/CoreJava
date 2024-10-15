class Identity3{
	public static void main( String[]args ){
		char[] arr1 = { 'A' ,'B' , 'C' };
		char[] arr2 = {  'A' , 'B' , 'C' };
		String[] arr3 = { "ABC", "EfG" };
		System.out.println( arr1);
		System.out.println( arr2);
		System.out.println( arr3);
		System.out.println( System.identityHashCode(arr1[0]));
		System.out.println( System.identityHashCode(arr1[0]));
		System.out.println( System.identityHashCode(arr2[0]));
	}
}
