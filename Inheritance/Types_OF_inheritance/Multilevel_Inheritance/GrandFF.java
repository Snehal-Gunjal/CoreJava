class GrandFF{
        static int money = 1000 ;
        static void Property(){
                System.out.println( "GrandFather Father Property is Common") ;
        }
}
class GrandFather extends GrandFF{
        GrandFather(){
                System.out.println( "In a GrandFather Constructor" ) ;
        }
}
class Father extends GrandFather{
        Father(){
                System.out.println( "In a Father Constructor" );
        }
}
class Mother extends Father{
        Mother(){
                System.out.println( "In a Mother Constructor" ) ;
        }
}
class Me {
        public static void main( String[]args ){
                Mother obj = new Mother() ;
        }
}
