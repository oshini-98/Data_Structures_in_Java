// In an array, elements in memory are arranged in continuous memory. 
// All the elements of an array are of the same type. And, the type of 
// elements that can be stored in the form of arrays is determined by the programming language.
// An array with each element represented by an index

import java.util.Scanner;

public class ArrayImp {

    public static void main(String[] args){

        int[] arr = new int[10];
        int size = 5;

        Scanner UserIn = new Scanner(System.in);

        System.out.println("Enter Data : ");
        for(int j=0; j<size; j++){
            arr[j] = UserIn.nextInt();
        }

        System.out.println("Output of array");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }



        //----Insert Element------
        // System.out.println("Enter the index you need to add : ");
        // int index = UserIn.nextInt();

        // System.out.println("Enter the value you need to add : ");
        // int value = UserIn.nextInt();

        // for(int x=size; x>=index; x--){
        //     arr[x+1]=arr[x];
        // }

        // arr[index] = value;

        // size++;

        //Print new array
        // System.out.println("Output of array");
        // for(int y=0; y<size; y++){
        //     System.out.println(arr[y]);
        // }



        //-------Search By Element and Delete-------
        // System.out.println("Enter the value you nee to remove : ");
        // int valueDel = UserIn.nextInt();
        // int x;

        // for(x = 0; x<size; x++){
        //     if(arr[x] == valueDel){
        //         break;
        //     }
        // }

        // for(int y=x+1; y<size; y++){
        //     arr[y-1] = arr[y];
        // }

        // size--;

        // System.out.println("Output of array");
        // for(int z=0; z<size; z++){
        //     System.out.println(arr[z]);
        // }


        // -------Search By Element and Update-------
        System.out.println("Enter the value you nee to remove : ");
        int valueDel = UserIn.nextInt();

        System.out.println("Enter the value you nee to update : ");
        int valueUpd = UserIn.nextInt();

        for(int x=0; x<size; x++){
            if(valueDel == arr[x]){
                arr[x] = valueUpd;
                break;
            }
        }

        System.out.println("Output of array");
        for(int z=0; z<size; z++){
            System.out.println(arr[z]);
        }
    }
}
