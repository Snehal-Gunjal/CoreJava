class Demo implements Runnable {
        public void run(){
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In run" ) ;
                }
        }
}
class Run1{
        public static void main( String[]args ){
                Demo obj = new Demo() ;
                Thread obj1 = new Thread( obj ) ;  
                obj1.start() ;
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In Main" ) ;
                }
        }
}
