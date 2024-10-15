
class MyThread extends Thread{
      public void run(){
              Thread t = Thread.currentThread() ;
              System.out.println( t ) ;
              System.out.println( t.getPriority()) ;
      }
}
class Priority2{
        public static void main( String[]args ){
                Thread t = Thread.currentThread() ;
                //Thread.currentThread()  = return object ;
                System.out.println( t.getPriority() ) ;
                 MyThread obj1 = new MyThread() ;
                 obj1.start() ;

                }
}
          