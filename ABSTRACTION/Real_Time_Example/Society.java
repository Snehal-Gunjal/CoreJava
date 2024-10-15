abstract class Society{
        void SocietyColour(){
                System.out.println( "Society Colour is not change" ) ;
        }
        abstract void PlatColour() ;
}
class Human extends Society{
        void PlatColour(){
                System.out.println( "NavyBlue" ) ;
        }
}
class Colour{
        public static void main( String[]args ){
                Society obj = new Human() ;
                obj.SocietyColour() ;
                obj.PlatColour() ;
        }
}
