import java.util.Arrays;


public class Sort {
//There are multiple ways to sort an array
//Lets move with Bubble sort
    int[] arr = new int[]{1,2,3,4};
    public void bubble(int[] arr){
        for(int i=0; i < arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j, j - 1);
                }
            }
        }
    }

    private void swap(int[] arr,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    }

