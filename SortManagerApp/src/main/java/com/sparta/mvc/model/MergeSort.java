package com.sparta.mvc.model;

public class MergeSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return mergeSort(arrayToSort);
    }

    public void merge(int[] leftArray,int[] rightArray, int[] array,int leftSize, int rightSize){

        int i=0,l=0,r = 0;
        //The while loops check the conditions for merging
        while(l<leftSize && r<rightSize){

            if(leftArray[l]<rightArray[r]){
                array[i++] = leftArray[l++];
            }
            else{
                array[i++] = rightArray[r++];
            }
        }
        while(l<leftSize){
            array[i++] = leftArray[l++];
        }
        while(r<rightSize){
            array[i++] = rightArray[r++];
        }
    }

    public int[] mergeSort(int [] array){
        int len = array.length;
        if (len < 2)return array;

        int mid = len / 2;
        int [] leftArray = new int[mid];
        int [] rightArray = new int[len-mid];

        //Dividing array into two and copying into two separate arrays
        int k = 0;
        for(int i = 0;i<len;++i){
            if(i<mid){
                leftArray[i] = array[i];
            }
            else{
                rightArray[k] = array[i];
                k = k+1;
            }
        }
        // Recursively calling the function to divide the sub-arrays further
        mergeSort(leftArray);
        mergeSort(rightArray);
        // Calling the merge method on each subdivision
        merge(leftArray,rightArray,array,mid,len-mid);
        return array;
    }
}
