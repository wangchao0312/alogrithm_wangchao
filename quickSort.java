package paixu.alogrithm_wangchao;

public class quickSort {
    public static int partition(int[] arr,int l,int r){
        int v=arr[l];
        int j=l;
        for(int i=l+1;i<=r;i++)
        {
            if(arr[i]<v) {
             j++;
                swap(arr, i, j);
            }
        }
        swap(arr,l,j);
        return j;

    }
    public static void quickSort(int[] arr,int l,int r)
    {
        if(l>=r)
            return;
        int p=partition(arr,l,r);
        quickSort(arr,l,p-1);
        quickSort(arr,p+1,r);
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args){
        int[] array={6,8,5,4,2,3,1};
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
        System.out.println("------------------");

        quickSort(array,0,array.length-1);

        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }

}


