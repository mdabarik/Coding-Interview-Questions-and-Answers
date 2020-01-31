"""
def twoSum(nums, target):
    seen = {}        
    for index, num in enumerate(nums):
        com = target - num            
        if com in seen:
            return True
        else:
            seen[num] = index
    return False;

print(twoSum([1, 2, 3, 4, 5], 3)); """



def twoSum(nums, k):
    map = {};
    for index, num in enumerate(nums):
        complement = k - num;
        if complement in map:
            return True
        else:
            map[num] = num
    return False

print(twoSum([1, 2, 3, 4, 5], 10))