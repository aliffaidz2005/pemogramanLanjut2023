package com;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
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
}
