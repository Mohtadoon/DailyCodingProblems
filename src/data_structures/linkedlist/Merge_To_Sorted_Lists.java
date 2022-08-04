package data_structures.linkedlist;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Merge_To_Sorted_Lists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,null);
        l1.next = new ListNode(2, null);
        l1.next.next = new ListNode(4, null);


        ListNode l2 = new ListNode(1,null);
        l2.next = new ListNode(3, null);
        l2.next.next = new ListNode(4, null);


        ListNode mergedList = mergeLists(l1, l2);
        ListNode temp = mergedList;

        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


    public static ListNode mergeLists(ListNode list1, ListNode list2){


        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }




        ListNode head;

        if(list1.val < list2.val){
            head =list1;
            list1 = list1.next;
        }else{
            head = list2;
            list2 = list2.next;
        }

        ListNode temp =head;


        while(list1 !=null && list2 != null){


            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }

        }

        if(list1 == null) {
            temp.next = list2;
        }
        if(list2 == null){
            temp.next = list1;
        }


        return head;

    }

}
