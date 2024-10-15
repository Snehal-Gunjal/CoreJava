abstract class Sppu{
        void Syllabus(){
                System.out.println( "Syllabus is common for all collegs" ) ;
        }
        abstract void CollegeFee() ;
}
abstract class University extends Sppu{
      
        void CollegeFee(){
                System.out.println( "Not a same fee for all colleges" ) ;
        }
         abstract void AmrutFee() ;
}
class Amrutvahini extends University{
      
        void AmrutFee(){
                System.out.println( "71000" );
        }
}
class College extends Amrutvahini{
        public static void main( String[]args ){
                Sppu obj = new Amrutvahini() ;
                obj.Syllabus() ;
                obj.CollegeFee() ;
                obj.AmrutFee() ;
        }
}