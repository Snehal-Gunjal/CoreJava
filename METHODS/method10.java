import java.io.*;
class Method{
        int a = 10 ;         
        static int b = 20 ;  // static variable;
        void fun(){         
                System.out.println( a ) ;
                System.out.println( b ) ;
        }
        static void gun(){
                System.out.println( b ) ;
        }
        public static void main( String[]args ){
                Method obj = new Method() ;
                obj.fun() ;
                gun() ;
                obj.funn() ;

        }
        static void funn(){
                System.out.println( "In funn() method" ) ;
        }

}