class MyThread  extends Thread{
        public void run(){
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In Run" ) ;
                }
        }
}
class ThreadDemo{
        public static void main( String[]args ) throws InterruptedException {
                MyThread obj = new MyThread() ;
                obj.start() ;

                obj.join() ;
              

                for( int i = 0 ; i<5 ; i++ ) {
                        System.out.println( "In Main" ) ;
                }
        }
}
                     