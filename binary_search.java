//binary search
//note: array must be sorted
// time complexity O(log N)

import java.util.Scanner;
class binary_search
{
    static boolean check(int arr[],int sk)
    {
        boolean flag=false;
        int l=0,h=arr.length-1;
        int mid=l+(h-l)/2;
        while(l<=h)
        {
        if(arr[mid]==sk)
        {
        flag= true;
        break;
        }
        else if(arr[mid]<sk)
        {
        l=mid+1;
        }
        else 
        {
        h=mid-1;
        }
        mid=l+(h-l)/2;
        }
        return flag;
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int arr[] = {2,4,6,7,8,9,10,12,14,15,16,17};
      int sk = sc.nextInt();
      if(check(arr,sk))
      System.out.println("element present in the given array");
      else
      System.out.println("element not present in the given array");
    }
}
