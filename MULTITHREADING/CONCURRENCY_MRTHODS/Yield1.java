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
                obj.yield( 10 ) ;
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In main") ;
                }
        }
}
/*
join.java:14: error: method yield in class Thread cannot be applied to given types;
                obj.yield( 10 ) ;
                   ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length

*/