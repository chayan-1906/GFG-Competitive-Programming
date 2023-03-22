# https://practice.geeksforgeeks.org/problems/d25f415de2ff3e02134de03e17ad019d723ab2e9/1
class Solution:
    
    def Calculate (self, st, s, S, val, ans):
        for c in S[::-1]:
            if len(st)!=0 and c==s[0] and st[-1]==s[1]:
                st.pop()
                ans += val
            else:
                st.append(c)
        return ans,st
        
    def solve (self, X, Y, S):
        s1, s2 = "pr", "rp"
        if X<Y:
            s1, s2 = s2, s1
            X, Y = Y, X
        ans,s = self.Calculate([],s1,S,X,0)
        ans,_ = self.Calculate([],s2,s[::-1],Y,ans)
        return ans