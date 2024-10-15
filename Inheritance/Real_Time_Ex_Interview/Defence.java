class Defence extends Object{
        Defence(){
                System.out.println( "Protection Provide" ) ;
        }
}
class ArmyForce extends Defence{
        ArmyForce(){
                System.out.println( "Provide Protection on the Border") ;
        }
}
class AirForce extends ArmyForce{
        AirForce(){
                System.out.println( "Defence from Terrerits") ;
        }
}
class Navy extends AirForce{
        Navy(){
                System.out.println( "BombSpot Protection" ) ;
        }
        public static void main( String[]args ){
			Navy obj = new Navy() ;
        }
}                                                                                                                                    ~                   