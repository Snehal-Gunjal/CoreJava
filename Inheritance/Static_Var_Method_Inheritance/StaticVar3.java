class University{
        University(){
                System.out.println( "In a University constructor" ) ;//4
        }
        static{
                System.out.println( "In a University Static Block") ; //1
        }
        {
                System.out.println( "In a University Instance block" ) ; //3
        }
        static void Board(){
                System.out.println( "CBSC , State , HSC " ) ;//2
        }
}
class College extends University{
        Colleg(){
                System.out.println( "In a College class Constructor") ; //6
        }
        static{
                System.out.println("In a College Static Block") ; //2
                Board() ;
        }
        {
                System.out.println( "In a college Instance block") ; //5
        }

}
class Gaku{
         public static void main( String[]args ){
                 System.out.println( "In main" ) ; //0
                 College obj = new College() ;
                 System.out.println("Outside main") ; //7

         }
}
/*
In main
In a University Static Block
In a College Static Block
CBSC , State , HSC
In a University Instance block
In a University constructor
In a college Instance block
In a College class Constructor
Outside main
*/