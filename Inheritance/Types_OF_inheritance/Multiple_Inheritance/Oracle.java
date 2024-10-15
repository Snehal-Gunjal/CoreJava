
class Oracle{
        Oracle(){
                System.out.println( "Oak") ;
        }
}
class Games{
        Games(){
                System.out.println( "Developed") ;
        }
}
class Java extends Games , Oracle{
        public static void main( String[]args ){
                Games obj = new Games() ;
        }
}