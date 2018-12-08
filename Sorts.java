import java.util.Random;
public class Sorts{
  public static void main(String[] args){
    int[] toSort = new int[Integer.parseInt(args[0])];
    Random randgen = new Random();
    for (int i = 0; i < toSort.length; i++){
      toSort[i] = randgen.nextInt();
    }
    selectionSort(toSort);
  }
  public static String printArray(int[] ary){
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
  }
  public static void selectionSort(int [] ary){
    int index = 0;
    for (int i = 0; i < ary.length; i++){
      int smallest = ary[i];
      for (int z = i; z < ary.length; z++){
        if (ary[z] < smallest){
          smallest = ary[z];
        }
      }
      for (int y = 0; y < ary.length; y++){
        if (ary[y] == smallest){
          index = y;
        }
      }
      ary[index] = ary[i];
      ary[i] = smallest;
    }
  }
}
