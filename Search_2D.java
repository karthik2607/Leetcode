//74
//29.5.24
//https://leetcode.com/problems/search-a-2d-matrix/description/

// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

 

// Example 1:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
// Example 2:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false

//Brute force solution
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
//             }
//         }
//         return false;
        
//     }
// }


//binary serach
import java.util.*;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c=0;
        int start=0;
        int end=matrix.length;
        while(start <= end){
            int mid=(start+end)/2;
            if(matrix[mid][0] == target){
                c = mid;
                break;
            }
            if(matrix[mid][0] > target){
                end = mid;
            }else{
                start = mid;
            }
            if((end-start) <= 1){
                c = start;
                break;
            }
        }
        
        int j = Arrays.binarySearch(matrix[c],target);
        if(j>=0){
            return true;
        }
        return false;
    }
}