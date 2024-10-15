class MyThread extends Thread{
        public void run(){
                System.out.println( "In run Method" ) ;
                System.out.println( Thread.currentThread().getName()) ;//Thread-0
        }
       public void start(){
                System.out.println( "In a Start method" ) ;
                run() ;
           }
}
class ThreadDemo{
        public static void main( String[]args ){
                MyThread obj = new MyThread() ;
                obj.start() ;
                System.out.println( Thread.currentThread().getName()) ; //main;
        }
}
