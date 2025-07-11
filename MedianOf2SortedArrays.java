class Solution {
    private int sizeNum1;
    private int sizeNum2;
    private int[] nums1;
    private int[] nums2;
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        sizeNum1 = nums1.length;
        sizeNum2 = nums2.length;
        this.nums1 = nums1;
        this.nums2 = nums2;

        int leftMed = findKthEle(0, 0, (sizeNum1 + sizeNum2 + 1) / 2);
        int rightMed = findKthEle(0, 0, (sizeNum1 + sizeNum2 + 2) / 2);

        return (leftMed + rightMed) / 2.0;
    }

    private int findKthEle(int startNum1, int startNum2, int k)
    {
        if(startNum1 >= sizeNum1)
        {
            return nums2[startNum2 + k - 1];
        }
        if(startNum2 >= sizeNum2)
        {
            return nums1[startNum1 + k - 1];
        }

        if(k == 1)
        {
            return Math.min(nums1[startNum1], nums2[startNum2]);
        }

        int midInd = k / 2;

        int midValNum1 = startNum1 + midInd - 1 < sizeNum1 ? nums1[startNum1 + midInd - 1] : Integer.MAX_VALUE;
        int midValNum2 = startNum2 + midInd - 1 < sizeNum2 ? nums2[startNum2 + midInd - 1] : Integer.MAX_VALUE;

        if(midValNum1 < midValNum2)
        {
            return findKthEle(startNum1 + midInd, startNum2, k - midInd);
        }
        else
        {
            return findKthEle(startNum1, startNum2 + midInd, k - midInd);
        }
    } 
}
