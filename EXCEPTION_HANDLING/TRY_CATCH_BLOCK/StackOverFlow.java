class StackOverFlow{
        static void Fun( int x ){
             Fun( ++x );
        }
        public static void main( String[]args ){
			try{
                Fun( 3 ) ;
			}catch( StackOverFlowError ee ){
				System.out.println( "Stack is OverFlowed" );
			}
        }
}
