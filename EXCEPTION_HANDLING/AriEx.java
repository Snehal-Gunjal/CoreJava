
class AriEx{
        void m1(){
                System.out.println( "In m1 Start" ) ;
                System.out.println( 10/0 ) ;
                System.out.println( "In a m1 Method" ) ;
        }
        void m2(){
                System.out.println( "In m2 Start" ) ;
                m1() ;
                System.out.println( "In a m2 method" ) ;
        }
        public static void main( String[]args){
                System.out.println( "In main" ) ;
                AriEx obj = new AriEx() ;
                obj.m2() ;
        }
}

                                                                                             ~         