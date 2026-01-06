class Solution:
    def sumFourDivisors(self, nums: List[int]) -> int:
        result = 0
        for i in nums:
            div = set()
            num = 1
            while num*num<= i:
                if i%num == 0:
                    div.add(num)
                    div.add(i//num)
                    if len(div)>4:
                        break
                num+=1
                
            if len(div) == 4:
                result += sum(div)
        return result