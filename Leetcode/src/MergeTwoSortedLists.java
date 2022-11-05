public class MergeTwoSortedLists {
    private ListNode A;
    private ListNode B;
    private ListNode Out;

    public static void main(String[] args) {
        int[] inATest1 = {1, 2, 4};
        int[] inBTest1 = {1, 3, 4};
        int[] expected1 = {1, 1, 2, 3, 4, 4};
        System.out.println("Test 1 Passed: "+Test(inATest1, inBTest1, expected1));
    }
    private static boolean Test(int[] inATest1, int[] inBTest1, int[] expected1) {
        MergeTwoSortedLists demo = new MergeTwoSortedLists(ArrayToList(inATest1), ArrayToList(inBTest1));
        ListNode expected = ArrayToList(expected1);
        return demo.Out.equals(expected);
    }
    private static ListNode ArrayToList(int[] in) {
        ListNode out = new ListNode(in[0]);
        for(int i = 1; i < in.length; ++i){
            out.AddToTail(in[i]);
        }
        return out;
    }
    public MergeTwoSortedLists(ListNode in1, ListNode in2) {
        A = in1;
        B = in2;
        Out = mergeTwoLists(A, B);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        } else {
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }


        public void AddToTail(int i) {
            if(next == null){
                next = new ListNode(i);
            } else{
                next.AddToTail(i);
            }
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public boolean equals(ListNode comparedTo) {
            if(val == comparedTo.val){
                if(next == null && comparedTo.next == null){
                    return true;
                }
                return next.equals(comparedTo.next);
            }
            return false;
        }
    }
}
