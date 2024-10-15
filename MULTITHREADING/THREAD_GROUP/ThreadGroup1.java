class MyThread extends Thread{
        public void run(){
                System.out.println( Thread.currentThread().getThreadGroup()) ;
                }
}
class ThreadGroup{
        public static void main( String[]args ){
                MyThread obj = new MyThread() ;
                obj.start() ;
                System.out.println( Thread.currentThread().getThreadGroup()) ;
        }
}
