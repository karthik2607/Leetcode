//75
//Sort colors
//https://leetcode.com/problems/sort-colors/
//29.5.24

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.




public class SortColors {
    public void sortc(int nums[]){
        int n=nums.length;
        int l=0;
        int r=n-1;
        sort(nums,l,r);
    }
    public void sort(int nums[],int l,int r){
        if(l<r){
        int mid=l+(r-l)/2;
        sort(nums,l,mid);
        sort(nums,mid+1,r);
        merge(nums,l,mid,r);
        }
    }

    public void merge(int nums[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int [] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=nums[l+i];
        }

        for(int i=0;i<n2;i++){
            R[i]=nums[m+1+i];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                nums[k]=L[i];
                i++;
            }else{
                nums[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k]=nums[i];
            i++;
            k++;
        }

        while(j<n2){
            nums[k]=nums[j];
            j++;
            k++;
        }
    }

       
    
    
}
