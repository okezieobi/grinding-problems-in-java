public class NextGreaterElement {
    public int[] solution(int[] nums1, int[] nums2) {
         // int[] ans = new int[nums1.length];
        // for (int i = 0; i < nums1.length; i++) {
        //     for (int j = 0; j < nums2.length; j++) {
        //         if (nums1[i] == nums2[j]) {
        //             for (int k = j; k < nums2.length; k++) {
        //                 if (nums2[k] > nums2[j]) {
        //                     ans[i] = nums2[k];
        //                     break;
        //                 } else {
        //                     ans[i] = -1;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return ans;
        int[] ans = new int[nums1.length];
        int[] refs = new int[nums1.length];
        for (int j = 0; j < nums2.length; j++) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums2[j] == nums1[i]) {
                    refs[i] = j;
                }
            }
        }
       for (int i = 0; i < refs.length; i++) {
           for (int j = refs[i]; j < nums2.length; j++) {
               if (nums2[j] > nums2[refs[i]]) {
                   ans[i] = nums2[j];
               } else {
                   ans[i] = -1;
               }
           }
       }
        return ans;
    }
}
