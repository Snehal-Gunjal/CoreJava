class Alphabet{
        Alphabet(){
                System.out.println( "Owner of a Google Company" ) ;
        }
}
class Google extends Alphabet{
        Google(){
                System.out.println( "Child Company of Alphabet" ) ;
        }
        public static void main( String[]args ){
                Google obj = new Google() ;
        }
}

       