class MyThread  extends Thread{
        static Thread  nmMain ;
		
        public void run(){
                for( int i =0 ; i<5 ; i++ ){
                try{
                  nmMain.join() ;
                  System.out.println( "In run" );
                }catch( InterruptedException e ){
                     }
                }
        }
}
class ThreadDemo{
        public static void main( String[]args ) throws InterruptedException {
                MyThread.nmMain = Thread.currentThread() ; //returns referenced of main Thread;
               MyThread obj = new MyThread() ;
                obj.start() ;

                obj.join() ;
                

                for( int i = 0 ; i<5 ; i++ ) {
                        System.out.println( "In Main" ) ;
                }
        }
}

             