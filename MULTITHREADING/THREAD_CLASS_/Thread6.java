class Thread6 extends Thread{
       public void run() throws InterruptedException{
              for( int i =0 ; i<5; i++ ){
                System.out.println( "In Fun()" );
                Thread.sleep( 1000 ) ;
              }
       }
        public static void main( String[]args ) throws InterruptedException{
                Thread6 obj = new Thread6();
                obj.start() ;
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In Main" ) ;
                        Thread.sleep(1000);
                }
        }
}

