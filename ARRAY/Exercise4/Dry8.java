import java.io.*;
class Dry8{
	public static void main( String[]args )throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader(isr) ;
		System.out.println( "Enter the size of array :" );
		int size =Integer.parseInt( br.readLine()) ;
		char[] ch = new char[size];
		System.out.println( "Enter Array Elements:");
		for( int i=0 ; i<ch.length ; i++ ){
				ch[i] = ( char) br.read() ;
				br.skip(2);
			}
		System.out.println("Repalce elements with # , which are not in range of 'a to z':");
		for( int i=0 ; i<ch.length ; i++ ){
				if( ch[i] <='a' || ch[i] >= 'z' ){
					System .out.print( "#"+" ");
				}else{
					System.out.print( ch[i]+" ");
				}
				System.out.println();
			}
		}
}
					
		
		