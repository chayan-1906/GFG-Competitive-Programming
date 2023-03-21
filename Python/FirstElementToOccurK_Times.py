#User function Template for python3

class Solution:
    def firstElementKTime(self,  a, n, k):
        occurences = {}
        for i in a:
            occurences[i] = occurences[i]+1 if i in occurences.keys() else 1 
            if occurences[i] == k:
                return i
        return -1