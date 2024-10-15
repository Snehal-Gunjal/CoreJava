class MyThread extends Thread {
        public void run(){
                System.out.println( Thread.currentThread()) ;
        }
}
class ThreadDemo{
        public static void main( String[]args ) throws InterruptedException{
                System.out.println( Thread.currentThread()) ; // returns the reference of currently executing thread.
                MyThread obj = new MyThread() ;
                obj.start() ;

                Thread.sleep( 1000 ) ;
              

                Thread.currentThread().setName( "Core2Web" ) ;  
                System.out.println( Thread.currentThread() ) ;
		}
}
