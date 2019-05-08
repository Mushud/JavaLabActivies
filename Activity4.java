/**
 * Activity4
 */
public class Activity4 {

    public static void main(String[] args) {
        int[] list = {2,7,4,1,5,3};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void bubbleSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            for (int k = 0; k < list.length; k++) {
                if(list[k] > list[i]){
                    int temp = list[k];
                    list[k] = list[i];
                    list[i] = temp;
                }    
            }
            printArray(list);
        }
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");      
        }
        System.out.println();
    }
}