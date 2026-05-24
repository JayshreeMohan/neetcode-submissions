class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int last = m+n-1;
        int i = m-1;
        int j = n-1;

        //we have to assume that nums1 contains i+j elements out of which i elements are real elements and next j elements are 0 . so if we are scanning from back then greater elements are back.

//have to check from backwards
        while(j>=0){

            if(i>=0 && nums1[i] > nums2[j]){
                nums1[last--] = nums1[i--];
            }
            else{
                nums1[last--] = nums2[j--];
            }


        }
        
    }
}