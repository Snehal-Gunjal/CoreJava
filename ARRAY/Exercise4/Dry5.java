import java.util.*;
class Dry5{
    public static void main( String[]args ){
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter Size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Insert Elements in array:");
        for( int i=0 ; i<arr.length ; i++ ){
            arr[i] = sc.nextInt() ;
        }
        System.out.println( "Display :");
        System.out.println( "Enter number to check how many times it occurs : ");
        int num = sc.nextInt() ;
        int count = 0;
        for( int i=0 ; i<arr.length ; i++ ){
            if( arr[i] == num ){
                count++;
            }
        }
        if( count == 2 ){
            System.out.println( num+ " occurs 2 times in the array .");
        }else if( count > 2 ){
            System.out.println( num+" occurs more than 2 times in an array. ");
        }
    }
}