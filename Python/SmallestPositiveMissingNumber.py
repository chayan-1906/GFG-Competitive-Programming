class Solution:
    
    #Function to find the smallest positive number missing from the array.
    def missingNumber(self,arr,n):
        num_set = set()
        for n in arr:
            if n>0:
                num_set.add(n)
        for i in range(1,len(num_set)+1):
            if i not in num_set:
                return i
        return len(num_set)+1
