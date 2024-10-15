
class MyThread extends Thread{
      public void run(){
              System.out.println( "In Run Method" ) ;
      }
}
class Priority1{
        public static void main( String[]args ){
                Thread t = Thread.currentThread() ;
                //Thread.currentThread()  = return object ;
                System.out.println( t ) ;
				 System.out.println( t.getPriority()) ;  //5
                } 
}