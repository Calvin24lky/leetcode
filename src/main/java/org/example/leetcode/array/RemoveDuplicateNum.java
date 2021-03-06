package org.example.leetcode.array;

import java.util.Arrays;

public class RemoveDuplicateNum {
    /*
    26.
    给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

    不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */

    // quick solution
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int cur = 0;
        if (nums.length == 1)
            return 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[cur]) {
                if (cur + 1 < nums.length) {
                    nums[cur + 1] = nums[i];
                    cur++;
                    count++;
                }
            }
        }
        return count;
    }

    // good solution
    public int removeDuplicatesBest(int[] nums) {
        // 判空
        if (nums.length <= 0) return 0;

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
//        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        int[] arr = {1,1,2,3};
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}
