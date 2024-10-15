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
class College{
        College(){
                System.out.println( "In a College class Constructor") ;
        }
        static{
                System.out.println("In a College Static Block") ;
        }
        {
                System.out.println( "In a college Instance block") ;
        }
        public static void main( String[]args ){
        }
}
//In a College Static Block


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
class College extends University{
        College(){
                System.out.println( "In a College class Constructor") ;
        }
        static{
                System.out.println("In a College Static Block") ;
        }
        {
                System.out.println( "In a college Instance block") ;
        }
        public static void main( String[]args ){
        }
}
/*
In a University Static Block
In a College Static Block
*/

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
class College extends University{
        College(){
                System.out.println( "In a College class Constructor") ;
        }
        static{
                System.out.println("In a College Static Block") ;
        }
        {
                System.out.println( "In a college Instance block") ;
        }
        public static void main( String[]args ){
               College obj = new College() ;
         }

}
/*
In a University Static Block
In a College Static Block
In a University Instance block
In a University constructor
In a college Instance block
In a College class Constructor
*/