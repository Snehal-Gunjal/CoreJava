interface Interface{
        void Fun() ;
}
class InterChild implements Interface{
        void Fun(){
                System.out.println( "In a fun Method" ) ;
        }
        public static void main( String[]args ){
                InterChild obj = new InterChild() ;
                obj.Fun() ;
        }
}
