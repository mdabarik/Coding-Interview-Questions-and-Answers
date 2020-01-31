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