//selection sort
//time complexity - O(N^2)

class selection_sort 
{
    static void sort(int arr[],int n)
    {
       for(int i=0; i<n-1; i++)
       {
        int min_idx=i;
        for(int j=i+1; j<n; j++)
            if(arr[j]<arr[min_idx])
            min_idx = j;

            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp;
       }
    }
    public static void main(String args[])
    {
        int arr[] = {2,5,6,4,1,9,7,3,8};
        int n=arr.length;

        sort(arr,n);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}
  