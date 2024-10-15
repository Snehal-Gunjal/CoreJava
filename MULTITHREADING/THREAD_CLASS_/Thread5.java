
class Thread5 extends Thread{
       static void run() {
              for( int i =0 ; i<5; i++ ){
                System.out.println( "In Fun()" );
              }
       }
        public static void main( String[]args ) throws InterruptedException{
                Thread5 obj = new Thread5();
                obj.start() ;
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In Main" ) ;
                }
        }
}
