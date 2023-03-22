# https://practice.geeksforgeeks.org/problems/7995e41d167d81f14f1d4194b29ef839f52d18ba/1
from typing import List

class Solution:
    def minimumTime(self, N : int, cur : int, pos : List[int], time : List[int]) -> int:
        minTime = abs(cur - pos[0])*time[0]
        for i in range(1,N):
            dis = abs(cur - pos[i])*time[i]
            minTime = min(minTime,dis)
        return minTime
        

