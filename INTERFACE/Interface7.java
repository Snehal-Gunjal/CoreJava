interface Interface7{
        default void Fun(){
                System.out.println( "In Interface 1 " );
        }
}
class FaceInter implements Interface7{
        void Gun(){
                System.out.println("In a Gun method" ) ;
        }
}
class IF{
        public static void main( String[]args ){
                Interface7 obj = new FaceInter();
                obj.Fun() ;
                FaceInter obj1 = new FaceInter() ;
                obj1.Fun() ;
                obj1.Gun() ;
        }

}
