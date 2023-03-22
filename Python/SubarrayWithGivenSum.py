# https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

#Function to find a continuous sub-array which adds up to a given number.
class Solution:
    def subArraySum(self,arr, n, Sum):
        Map = {}
        curr_sum = 0
        for i in range(0, n):
            curr_sum = curr_sum + arr[i]
            if curr_sum == Sum:
                return [1,i+1]
            if (curr_sum - Sum) in Map:
                return [Map[curr_sum - Sum]+2,i+1]
            Map[curr_sum] = i
        return [-1]