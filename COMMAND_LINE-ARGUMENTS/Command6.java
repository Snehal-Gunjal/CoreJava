class Command6{
	public static void main( String[]args ){
		String[] arr = { "Kanha" , "Kanha" } ;
		System.out.println( System.identityHashCode( arr[0]));
		System.out.println( System.identityHashCode( arr[1]));
		System.out.println( args[0] );
		System.out.println( args[1] );
		System.out.println( System.identityHashCode( args[0]));
		System.out.println( System.identityHashCode( args[1]));	
			
	}
}
