class Solution:
    def firstUniqChar(self, s: str) -> int:
        map_s={}
        for i in s:
            map_s[i]=map_s.get(i,0)+1
        for j in range(len(s)):
            if map_s[s[j]]==1:
                return j
        return -1
