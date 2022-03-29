package com.simplilearn.demo;
class LIS {
    static int max_ref; 
  
    static int _lis(int arr[], int n)
    {
        
        if (n == 1)
            return 1;
  
        
        int res, max_ending = 1;
        for (int i = 1; i < n; i++) {
            res = _lis(arr, i);
            if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending)
                max_ending = res + 1;
        }
 
        if (max_ref < max_ending)
            max_ref = max_ending;
 
        return max_ending;
    }
  
    
    static int lis(int arr[], int n)
    {
        
        max_ref = 1;
        _lis(arr, n);
        return max_ref;
    }
  
    
    public static void main(String args[])
    {
        int arr[] = { 60, 18, 29, 43, 11, 70, 51, 10, 90 };
        int n = arr.length;
        System.out.println("Length of LIS is :"+ lis(arr, n) );
    }
}

