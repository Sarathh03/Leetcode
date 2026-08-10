class Solution(object):

    def twoSum(self, nums, target):
        seen = {}
        for index, n in enumerate(nums):
            completement = target - n
            if completement in seen:
                return [seen[completement],index]

            seen[n] = index            
        