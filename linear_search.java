//linear search

import java.util.Scanner;
class linear_search
{
    static boolean check(int arr[],int sk)
    {
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(sk==arr[i])
            flag=true;
        }
        return flag;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        int sk=sc.nextInt();
        if(check(arr,sk))
        System.out.println("element present in given array");
        else
        System.out.println("element not present in the given array");
    }
}
