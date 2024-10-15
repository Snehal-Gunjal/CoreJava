interface Interface2{
        void Fun() ;
}
class InterChild implements Interface{
        public void Fun(){
                System.out.println( "In a fun Method" ) ;
        }
        public static void main( String[]args ){
                InterChild obj = new InterChild() ;
                obj.Fun() ;
        }
}
