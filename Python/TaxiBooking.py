from typing import List

class Solution:
    def minimumTime(self, N : int, cur : int, pos : List[int], time : List[int]) -> int:
        minTime = abs(cur - pos[0])*time[0]
        for i in range(1,N):
            dis = abs(cur - pos[i])*time[i]
            minTime = min(minTime,dis)
        return minTime
        

