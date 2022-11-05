public class SortedArrayMedians {
    int[] A;
    int[] B;
    double output;

    public static void main(String[] args) {
        int[][][] inputs = {
                { { 1, 3 }, { 2 } },
                { { 1, 2 }, { 3 } },
                { { 2, 3 }, { 1 } },
                { { 3 }, { 1,2 } },
                { { 2 }, { 1,3 } },
                { { 1 }, { 2,3 } },
                { { 1, 2 }, { 3, 4 } },
                { { 1, 3 }, { 2, 4 } },
                { { 1, 4 }, { 2, 3 } },
                { { 2, 3 }, { 1, 4 } },
                { { 2, 4 }, { 1, 3 } },
                { { 3, 4 }, { 1, 2 } },
                { { 4 }, { 1,2,3 } },
                { { 2 }, { 1,3,4 } },
                { { 2,3,4 }, {1  } },
                { { 1,2,4 }, {3  } },
                { { 2, 4, 7 }, { 3, 8 } },
                { { 2, 4 }, { 3,7, 8 } },
                { { 2, 7 }, { 3,4, 8 } },
                { { 2}, { 3,4,  7 ,8 } },
                { { 3}, { 2,4,  7 ,8 } },
                { { 2,3,4,  7}, { 8 } },
                { { 2,3,  7,8}, { 4 } },
                { { 3, 4, 7 }, { 2, 8 } }
        };
        double[] expects = { 
                2,
                2,
                2,
                2,
                2,
                2,
                2.5,
                2.5,
                2.5,
                2.5,
                2.5,
                2.5,
                2.5,
                2.5,
                2.5,
                2.5,
                4,
                4,
                4,
                4,
                4,
                4,
                4,
                4
        };
        for (int i = 0; i < expects.length; ++i) {
            if(i == 10000){
                System.out.print("Eh!");
            }
            SortedArrayMedians attempt = new SortedArrayMedians(inputs[i][0], inputs[i][1]);
            System.out.println("Attempt #" + i + ":\t" + attempt.test(expects[i]));
        }
    }

    public SortedArrayMedians(int[] A, int[] B) {
        this.A = A;
        this.B = B;
        output = findMedianSortedArrays(A, B);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int stopAt = nums1.length + nums2.length;
        if (stopAt % 2 == 0) {
            stopAt = stopAt / 2;
            int left1 = 0;
            int left2 = 0;
            int averageWith = 0;
            while (left1 + left2 < stopAt) {
                if(left1 > nums1.length - 1){
                    if(left1 + left2 == stopAt - 1){
                        averageWith = nums2[left2];
                    }
                    ++left2;
                }
                else if(left2 > nums2.length - 1){
                    if(left1 + left2 == stopAt - 1){
                        averageWith = nums1[left1];
                    }
                    ++left1;
                }
                else if (nums1[left1] < nums2[left2]) {
                    if(left1 + left2 == stopAt - 1){
                        averageWith = nums1[left1];
                    }
                    ++left1;
                } else {
                    if(left1 + left2 == stopAt - 1){
                        averageWith = nums2[left2];
                    }
                    ++left2;
                }
            }
            if (nums1.length <= left1) {
                return (double)(nums2[left2]+averageWith)/2;
            }
            if (nums2.length <= left2) {
                return (double)(nums1[left1]+averageWith)/2;
            }
            return (double)(Math.min(nums1[left1], nums2[left2])+averageWith)/2;
        } 
            stopAt = (stopAt - 1) / 2;
            int left1 = 0;
            int left2 = 0;
            while (left1 + left2 < stopAt) {
                if(left1 > nums1.length - 1){
                    ++left2;
                }
                else if(left2 > nums2.length - 1){
                    ++left1;
                }
                else if (nums1[left1] < nums2[left2]) {
                    ++left1;
                } else {
                    ++left2;
                }
            }
            if (nums1.length <= left1) {
                return nums2[left2];
            }
            if (nums2.length <= left2) {
                return nums1[left1];
            }
            return Math.min(nums1[left1], nums2[left2]);
            
        
    }

    public boolean test(double expected) {
        return expected == output;
    }
}
