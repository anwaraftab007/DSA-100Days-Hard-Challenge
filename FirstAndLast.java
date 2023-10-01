class Solution {
    public int[] searchRange(int[] nums, int target) {
        int mid = mid(nums, target);

        int start = arr1(nums, target, 0, mid);
        int end = arr2(nums, target, mid, end);
    }
}
int[] mid(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
        int mid = start + (end-start)/2;

        if(target > arr[mid])
            start = mid+1;
        else if(target < arr[mid])
            end = mid-1;
        else
            return mid;
    }
    return -1;
}

int[] arr1(int[] arr, int target, int start, int end){
    while(start <= end){
        int mid = start + (end-start)/2;
        
        if(target > arr[mid])
            start = mid+1;
        else
            end = mid-1;
    }
    return (start%arr.length);
}
int[] arr2(int[] arr, int target, int start, int end){
    while(start <= end){
        int mid = start + (end-start)/2;
        
        if(target > arr[mid])
            start = mid+1;
        else
            end = mid-1;
    }
    return (end%arr.length);
}
