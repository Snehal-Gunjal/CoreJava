class Thread4 extends Thread{
       public void run() {
              for( int i =0 ; i<5; i++ ){
                System.out.println( "In Fun()" );
              }
       }
        public static void main( String[]args ) throws InterruptedException{
                Thread4 obj = new Thread4();
                obj.start() ;
                for( int i = 0 ; i<5 ; i++ ){
                        System.out.println( "In Main" ) ;
                }
        }
}
