class Solution:
    
    # arr[] : the input array
    # N : size of the array arr[]
    
    #Function to return length of longest subsequence of consecutive integers.
    def findLongestConseqSubseq(self,arr, N):
        present ={}
        for i in arr:
            present[i]=1
        checked ={}
        max_count = 0
        for n in arr:
            i = n
            if i-1 not in present.keys() and i not in checked.keys():
                count = 0
                while i in present.keys():
                    count+=1
                    checked[i]=1
                    max_count = max(max_count,count)
                    i+=1
        return max_count
                