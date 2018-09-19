import java.util.*;
class rotate
{
public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
        String[] line= (sc.nextLine()).split(" ");
        int rotations= Integer.parseInt(line[1]);
        int size= Integer.parseInt(line[0]);
        String[] line2= (sc.nextLine()).split(" ");
        int[] arr= new int[size];
        int[] arr2= new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.parseInt(line2[i]);
        }
        
        for(int i=0; i<arr.length; i++){
            int index= (i+(size-(rotations%size))) %size;
            arr2[index]=arr[i];
        }
        
        for(int i=0; i<arr.length; i++)
            System.out.print(arr2[i]+" ");

    }
}