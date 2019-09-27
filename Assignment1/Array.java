import java.util.Scanner;

public class Array {
    int elements[];
    int size;
    Array(){
        elements = null;
        size = 0;
    }
    Array(int NumberOfElements){
        elements = new int[NumberOfElements];
        size = NumberOfElements;
    }
    private void swap(int array[],int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    void readArray(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter "+size+" elements one by one.");
        for (int i = 0 ; i< size; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            elements[i] = s.nextInt();
        }
        s.close();
    }
    void printArray(){
        for (int element : elements) 
            System.out.print(" " + element);
    }
    private int proper_position(int array[], int low, int high){
        int i=low, x=array[low],j;
        for(j=low+1; j<high;j++)
            if(array[j]<=x){
                i++;
                if(i!=j)
                    swap(array,i,j);
            }
        swap(array,i,low);
        return i;
    }
    private void quicksort(int array[], int low,int high){
        if(low<high){
            int pivot;
            pivot = proper_position(array,low,high);
            quicksort(array,low,pivot);
            quicksort(array,pivot+1,high);
        }
    }
    void quickSort(){
        quicksort(elements, 0, size);
    }
    void bubbleSort(){
        boolean sorted = false;
        for (int i = 0; i < size && !sorted; i++) {
            for (int j = 1; j < size - i; j++) {
                sorted = true;
                if(elements[j-1] > elements[j]){
                    swap(elements,j-1,j);
                    sorted = false;
                }
            }
        }
    }
}