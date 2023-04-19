class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = m-1;
        int l2 = n-1;
        int l3 = nums1.length-1;

        while (l2 >= 0) {
            if (l1 >= 0 && nums1[l1] > nums2[l2]) {
                nums1[l3] = nums1[l1];
                l1--;
            }
            else {
                nums1[l3] = nums2[l2];
                l2--;
            }

            l3--;
        }



        // int l1 = 0;
        // int l2 = 0;
        // int l3 = 0;

        // int[] arr = new int[m+n];

        // while (l1 < m && l2 < n) {
        //     if (nums1[l1] <= nums2[l2]) {
        //         arr[l3] = nums1[l1];
        //         System.out.println(Arrays.toString(arr));
        //         l1++;
        //     }
        //     else {
        //         arr[l3] = nums2[l2];
        //         System.out.println(Arrays.toString(arr));
        //         l2++;
        //     }
        //     l3++;
        // }

        // while (l1 < m) {
        //     arr[l3] = nums1[l1];
        //     l1++;
        //     l3++;
        // }

        // while (l2 < n) {
        //     arr[l3] = nums2[l2];
        //     l2++;
        //     l3++;
        // }

        // System.out.println(Arrays.toString(arr));
    }
}