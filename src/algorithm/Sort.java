package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */
    public static void printStoreArray(int[]array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
    int temp;
    for (int i=1;i<array.length; i++){
        int j=i;
        while((j>0) && (array[j] < array[j-1])) {
            temp=array[j];
            array[j]=array[j-1];
            array[j-1]=temp;
            j--;

        }
    }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array) {
        int[] list = array;
        //implement here
        int n = array.length;
        for (int i = 0; i < n - 1; i++) ;
        int j;
        for (j = 0; j < n - j - 1; j++);
        if (array[j] > array[j + 1]) {
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;

        }


        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        int p,q,r;
        p=0;
        q=1;
        r=10;
        int n1=q-p+1;
        int n2 = r-q;

        int L[] = new int[n1];
        int M[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = array[q + 1 + j];
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }

        return list;
    }
    

    public int [] quickSort(int[] array, int i, int i1) {
        int[] list = array;
        //implement here
        quickSort(array, 0, array.length - 1);
        //verify sorted array
        System.out.println(Arrays.toString(array));



        

        return list;
    }

    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i,0);
        }
        

        return list;
    }

    private void heapify(int[] array, int i, int i1) {
        int largest=i;
        int l =2* i+1;
        int r =2*i+2;
        if (1<i && array [1] > array [largest]);
        largest=1;
        if(r<i && array[1] > array[largest]);
        largest =r;
        if(largest !=i){
            int swap=array[i];
            array[i]=array[largest];
            array[largest]=swap;
            heapify(array, i, i1);
        }

    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
