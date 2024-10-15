
class MyThread extends Thread{
        MyThread(){

        }
        MyThread( String str ){
                super(str) ;
        }
        public void run(){
                System.out.println( getName()) ;
                System.out.println(Thread.currentThread().getThreadGroup()) ;
        }
}
class ThreadGroupDemo{
        public static void main( String[]args ){
               MyThread obj1 = new MyThread( "XYZ" ) ;
               obj1.start() ;

               MyThread obj2 = new MyThread( "C2W" ) ;
               obj2.start() ;

               MyThread obj3 = new MyThread( ) ;
               obj3.start() ;
        }
}