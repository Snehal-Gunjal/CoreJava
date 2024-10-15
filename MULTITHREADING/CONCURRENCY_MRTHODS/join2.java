class Demo extends Thread{
        public void run(){
                for( int i =0 ; i<5 ; i++ ){

                   System.out.println( "In run" );
                }

        }
}
class join{
        public static void main( String[]args )throws InterruptedException {
                Demo obj = new Demo();
                obj.start() ;
                obj.join( 10 ) ;
               
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In main") ;
                }
        }
}