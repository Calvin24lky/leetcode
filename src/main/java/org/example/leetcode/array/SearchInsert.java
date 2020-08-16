package org.example.leetcode.array;

public class SearchInsert {

    /*
    35. 搜索插入位置
    给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
    如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

    示例 1:
    输入: [1,3,5,6], 5
    输出: 2

    示例 2:
    输入: [1,3,5,6], 2
    输出: 1
     */



    public int qs(int[] nums, int target) {
        if (nums.length <= 0) {
            return 0;
        }
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            else if (nums[i] < target && i + 1 < nums.length && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return 0;
    }
}
