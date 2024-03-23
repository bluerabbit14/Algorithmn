//Bubble sort
//time complexity O(N^2)

class bubble_sort 
{
    static void sort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
         int arr[]={2,4,1,9,6,7,3,5,8};
         int n=arr.length;
         sort(arr,n);

         for(int i: arr)
         {
            System.out.print(i+" ");
         }
    }
}
