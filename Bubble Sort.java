
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                }
            }
        }
    }

}
