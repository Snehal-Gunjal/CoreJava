class India{
        India(){
                System.out.println( "India is Parent for all states" ) ;
        }
}
class States extends India{
        States(){
                System.out.println( "Maharashtra , Punjab , Tamilnadu " );
        }
}
class City extends India{
        City(){
                System.out.println( "Common-Rules") ;
        }
}
class Villege{
        public static void main( String[]args ){
                City obj = new City() ;
        }
}