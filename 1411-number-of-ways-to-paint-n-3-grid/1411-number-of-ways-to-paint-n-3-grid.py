class Solution:
    def numOfWays(self, n: int) -> int:
        # initialize with 6 two colour and 6 three colour
        two, three = 6, 6

        for i in range(2, n+1):
            two, three = 3 * two + 2 * three, 2 * (two + three)
        
        return (two + three) % (10**9 + 7)
        