import java.util.Random;
public class Sorts{
  public static void main(String[] args){
    int[] toSort = new int[Integer.parseInt(args[0])];
    Random randgen = new Random();
    for (int i = 0; i < toSort.length; i++){
      toSort[i] = 0;
    }
    //selectionSort(toSort);
    //bubbleSort(toSort);
    //insertionSort(toSort);
    System.out.println(isSorted(toSort));
    //System.out.println(printArray(toSort));
  }
  public static String printArray(int[] ary){
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
  }
  /**Helper function to test if array is sorted.
  *Returns true if sorted in increasing order, false otherwise.
  *@param data the element to test if it is sorted.
  */
  public static boolean isSorted(int[] data){
    boolean sorted = true;
    for (int i = 0; i < data.length-1; i++){
      if (data[i] > data[i+1]){
        sorted = false;
      }
    }
    return sorted;
  }
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int [] data){
    int index = 0;
    for (int i = 0; i < data.length; i++){
      int smallest = data[i];
      for (int z = i; z < data.length; z++){
        if (data[z] < smallest){
          smallest = data[z];
          index = z;
        }
      }
      for (int y = 0; y < data.length; y++){
        if (data[y] == smallest){
          index = y;
        }
      }
      data[index] = data[i];
      data[i] = smallest;
    }
  }
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int minValue = 0;
    while (!(isSorted(data))){
      for (int i = 0; i < data.length-1; i++){
        if (data[i] > data[i+1]){
          minValue = data[i+1];
          data[i+1] = data[i];
          data[i] = minValue;
        }
      }
    }
  }
  /**Insertion sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length; i++){
      int storage = data[i];
      int index = i;
      while(index > 0 && storage <= data[index-1]){
        data[index] = data[index-1];
        index--;
      }
      data[index] = storage;
    }
  }
}
