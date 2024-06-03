//GFG
//3.6.24
//https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=merge-k-sorted-arrays

// Given K sorted arrays arranged in the form of a matrix of size K*K. The task is to merge them into one sorted array.
// Example 1:

// Input:
// K = 3
// arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
// Output: 1 2 3 4 5 6 7 8 9
// Explanation:Above test case has 3 sorted
// arrays of size 3, 3, 3
// arr[][] = [[1, 2, 3],[4, 5, 6], 
// [7, 8, 9]]
// The merged list will be 
// [1, 2, 3, 4, 5, 6, 7, 8, 9].
// Example 2:

// Input:
// K = 4
// arr[][]={{1,2,3,4},{2,2,3,4},
//          {5,5,6,6},{7,8,9,9}}
// Output:
// 1 2 2 2 3 3 4 4 5 5 6 6 7 8 9 9 
// Explanation: Above test case has 4 sorted
// arrays of size 4, 4, 4, 4
// arr[][] = [[1, 2, 2, 2], [3, 3, 4, 4],
// [5, 5, 6, 6], [7, 8, 9, 9 ]]
// The merged list will be 
// [1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 
// 6, 6, 7, 8, 9, 9].
// Your Task:
// You do not need to read input or print anything. Your task is to complete mergeKArrays() function which takes 2 arguments, an arr[K][K] 2D Matrix containing K sorted arrays and an integer K denoting the number of sorted arrays, as input and returns the merged sorted array ( as a pointer to the merged sorted arrays in cpp, as an ArrayList in java, and list in python)

// Expected Time Complexity: O(K2*Log(K))
// Expected Auxiliary Space: O(K2)

// Constraints:
// 1 <= K <= 100



import java.util.*;
class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        
        for(int i=0;i<K;i++){
            for(int j=0;j<K;j++){
                minHeap.offer(arr[i][j]);
            }
        }
        
        ArrayList<Integer>l=new ArrayList<>();
        while(!minHeap.isEmpty()){
            l.add(minHeap.poll());
        }
        
        return l;
        
    }
}