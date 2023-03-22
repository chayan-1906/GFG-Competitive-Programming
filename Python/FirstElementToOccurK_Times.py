# https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1

class Solution:
    def firstElementKTime(self,  a, n, k):
        occurences = {}
        for i in a:
            occurences[i] = occurences[i]+1 if i in occurences.keys() else 1 
            if occurences[i] == k:
                return i
        return -1