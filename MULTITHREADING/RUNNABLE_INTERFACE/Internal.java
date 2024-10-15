:Rnnable is a interface. 
:Thread class implements Rnnable ;


interface Rnnable {
  public abstract void run() ; 
}

class Thread implements Rnnable{
        Thread(){
                  System.out.println( vm.create()); 
		}
		
		//Thread class have ability to create new thread .
		
        public void run(){
		
		}
}
class MyThread extends Thread{
	MyThread(){
		super() ;
	}
		
}
class Demo{
	public static void main( String[]args ){
		MyThread obj = new MyThread() ;    
		obj.start() ; //create zhaleli Thread call hoil ;
	}
}
