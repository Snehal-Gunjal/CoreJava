class University1{
        static int x = 10 ;
        University1(){
                System.out.println( "In a University constructor" ) ;//4
                System.out.println( x ) ;
        }
        static{
                System.out.println( "In a University Static Block") ; //1
                System.out.println( x ) ;
        }
        {
                System.out.println( "In a University Instance block" ) ; //3
                System.out.println( x ) ;
        }
        static void Board1(){
                System.out.println( "CBSC , State , HSC " ) ;//2
                System.out.println( x ) ;
        }
}
class College1 extends University1{
        College1(){
                System.out.println( "In a College class Constructor") ; //6
                Board1() ;
                System.out.println( x ) ;
        }
        static{
                System.out.println("In a College Static Block") ; //2
                Board1() ;
                System.out.println( x ) ;
        }
        {
                System.out.println( "In a college Instance block") ;
                Board1() ;
                System.out.println( x ) ;
        }

}
class Gaku1{
         public static void main( String[]args ){
                 System.out.println( "In main" ) ;
                 University1 obj = new College1();
                 System.out.println("Outside main") ; //7
         }
}