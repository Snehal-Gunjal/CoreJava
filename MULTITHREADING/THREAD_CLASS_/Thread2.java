class Thread2{
       static void Fun() {
              for( int i =0 ; i<5; i++ ){
                System.out.println( i );
                try{
                  Thread.sleep( 1000 ) ;
                }catch( InterruptedException e ){
              }
       }
       }
        public static void main( String[]args ) throws InterruptedException{
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( i ) ;
                        Thread.sleep(1000) ;
                }
                Fun() ;
        }
}