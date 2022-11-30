package HW3Java;
// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class task1 {
    public void SortArray(int[] arr, int firstPos, int lastPos){
        
        int middleArray = firstPos + (firstPos - lastPos) /2;
        SortArray(arr, firstPos, middleArray);
        SortArray(arr, middleArray + 1, lastPos);
        int[] buf = Arrays.copyOf(arr, arr.length);
        for (int k = 0; k < lastPos; k++) {
            buf[k] = arr[k];
        }
        int i = firstPos;
        int j = middleArray + 1;
        for (int k = firstPos; k < buf.length; k++) {
            if (i > middleArray) {
                arr[k] = buf[j];
            }
            else if (j > lastPos) {
                arr[k] = buf[i];
                i++;
            }
            else if (buf[j] < buf[i]) {
                arr[k] = buf[j];
                j++;
            }
            else {
                arr[k] = buf[i];
                i++;
            }
        }

        int[] array = {1,3,2,5,10,4,0};
        int firstPosition = 0;
        int lastPosition = arr.length -1;
        SortArray(array, firstPosition, lastPosition);
        System.out.println(Arrays.toString(array));
    }
}
