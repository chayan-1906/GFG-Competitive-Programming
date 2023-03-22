# https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1
class Solution:
    # Program for zig-zag conversion of array
    def zigZag(self, arr, n):
        for i in range(n-1):
            if i%2 == 0 and arr[i] > arr[i+1]:
                arr[i],arr[i+1]=arr[i+1],arr[i]
            if i%2 == 1 and arr[i] < arr[i+1]:
                arr[i],arr[i+1]=arr[i+1],arr[i]
        return arr