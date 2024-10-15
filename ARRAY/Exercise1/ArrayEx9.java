import java.io.*;
class ArrayEx9{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println( "Enter Total Number of Country population you have to stored:");
		int size = Integer.parseInt( br.readLine() );
		float[] avg = new float[size];
		System.out.println( "Enter Total Population average of an country:");
		for( int i=0 ; i<avg.length ; i++ ){
			avg[i] = Float.parseFloat( br.readLine());
		}
		System.out.println("Display country Population:");
		for( int i=0 ; i<avg.length ; i++ ){
			System.out.println( avg[i] );
		}
		
	}
}