class Demo1 {
        void fun(){
                System.out.println( "In a Fun method" ) ;
        }
        void gun(){
                System.out.println( "In a gun method" ) ;
        }

}
class MyThread extends Demo1 implements Runnable{
       void inherited(){
             fun() ;
             gun() ;
       }
       public void run(){
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In Run Method" ) ;
                }
        }
}
class Run2{
        public static void main( String[]args ){
                MyThread obj1 = new MyThread() ;
                obj1.inherited() ;
                Thread obj2 = new Thread( obj1 ) ;
                obj2.start() ;
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In Main" ) ;
                }

        }
}
