class University{
        University(){
                System.out.println( "In a University constructor" ) ;
        }
        static{
                System.out.println( "In a University Static Block") ;
        }
        {
                System.out.println( "In a University Instance block" ) ; 
        }
}
class College extends University {
        College(){
                System.out.println( "In a College class Constructor") ;
        }
        static{
                System.out.println("In a College Static Block") ;
        }
        {
                System.out.println( "In a college Instance block") ;
        }
}
class Gaku{
        public static void main( String[]args )
        {
                College obj = new College();
		}
}

