#User function Template for python3

class Solution:
    ##Complete this function
    #Function to find the sum of contiguous subarray with maximum sum.
    def maxSubArraySum(self,arr,N):
        maxSum = arr[0]
        localSum = 0
        for i in arr:
            localSum += i
            maxSum = max(maxSum,localSum)
            localSum = 0 if localSum < 0 else localSum
        return maxSum