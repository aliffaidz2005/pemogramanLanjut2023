public class Solution {
    public Solution() {
    }

    public static void main(String[] args) {
        Solution ts = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

        // tugas let code ke dua find media of two arrray
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{2};
        double hasil = findMedianSortedArrays(nums1, nums2);
        System.out.println("hasil : " + hasil);

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        int i = 0;
        int j = 0;

        int k;
        for(k = 0; i < n1 && j < n2; merged[k++] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++]) {
        }

        while(i < n1) {
            merged[k++] = nums1[i++];
        }

        while(j < n2) {
            merged[k++] = nums2[j++];
        }

        int mid = merged.length / 2;
        return merged.length % 2 == 0 ? (double)(merged[mid - 1] + merged[mid]) / 2.0 : (double)merged[mid];
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; ++i) {
            for(int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}