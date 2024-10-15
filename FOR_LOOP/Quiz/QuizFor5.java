class QuizFor5{
	public static void main( String[]args){
		System.out.println( "Before for loop") ;
		for( int i , j ; i<3 ;i++ , j++ ){
			System.out.println( "Inside For") ;
		}
		System.out.println( "After For Loop") ;
	}
}
/*
QuizFor5.java:4: error: variable i might not have been initialized
                for( int i , j ; i<3 ;i++ , j++ ){
                                 ^
QuizFor5.java:4: error: variable j might not have been initialized
                for( int i , j ; i<3 ;i++ , j++ ){
                                            ^
2 errors
*/