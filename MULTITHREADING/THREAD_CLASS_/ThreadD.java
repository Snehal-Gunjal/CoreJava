class Demo extends Thread{
        public void run(){
                System.out.println( "Demo: "+ Thread.currentThread().getName()) ;
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In Demo Run:" ) ;
                }
        }
}
class MyThread extends Thread{
        public void run(){
                System.out.println("MyThread: "+Thread.currentThread().getName()) ;

                Demo obj = new Demo() ;
                obj.start() ;
        }
}
class ThreadD{
        public static void main( String[]args ){
                System.out.println( "ThreadD: "+Thread.currentThread().getName()) ;
                MyThread obj1 = new MyThread() ;
                obj1.start() ;
        }
}

             