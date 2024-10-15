class MyThread extends Thread{
        public void run(){
                System.out.println( Thread.currentThread().getThreadGroup()) ;
                }
}
class ThreadGroup{
        public static void main( String[]args ){
                MyThread obj = new MyThread() ;
                System.out.println( obj.getName());
                System.out.println( Thread.currentThread().getName()) ;//provide current thread name ;
                obj.start() ;
                System.out.println( Thread.currentThread().getThreadGroup()) ;
                System.out.println( obj.getName()) ; //Thread-0
        }
}