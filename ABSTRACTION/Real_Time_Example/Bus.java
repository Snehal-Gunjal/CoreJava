abstract class Bus{
        void Ticket(){
                System.out.println( "Tickets") ;
        }
        abstract void TicketPrices();
}
class passenger extends Bus{
        void TicketPrices(){
                System.out.println( "Change According to time ") ;
        }
}
class process{
        public static void main(String[]args ){
                Bus obj = new passenger() ;
                obj.TicketPrices();
        }
}