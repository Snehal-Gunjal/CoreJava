class Thread7 extends Thread{
       public void run(){
              for( int i =0 ; i<5; i++ ){
                System.out.println( "In Fun()" );
                try{
                  Thread.sleep( 1000 ) ;
                }catch(  InterruptedException e ){
                }
              }
       }
        public static void main( String[]args ) throws InterruptedException{
                Thread7 obj = new Thread7();
                obj.start() ;
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In Main" ) ;
                        Thread.sleep(1000);
                }
        }
}
