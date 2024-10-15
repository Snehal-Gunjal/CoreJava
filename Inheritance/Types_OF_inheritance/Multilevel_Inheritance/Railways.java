class RailwayBoard{
        RailwayBoard(){
                System.out.println( "CEO- Jaya verma Sinha" );
        }
        void Function(){
                System.out.println( "Provide direction of the railway" );
        }

}
class Monorail extends RailwayBoard{
        Monorail(){
                System.out.println( "Monorail - Runs on a single rail") ;
        }
}
class FreightTrain extends Monorail{
                 FreightTrain(){
                 System.out.println( "Passenger inter-city trains" ) ;
                 }
}
class LocalTrain extends FreightTrain{
                LocalTrain(){
                 System.out.println( "For gao") ;
                }
}
class CentralTrain{
        public static void main( String[]args ){
                LocalTrain obj = new LocalTrain() ;
        }
}
