package hackerrank;

public class MergeSortedLists {

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedList c = new SinglyLinkedList();

        return c.head;
    }

    public static void main(String[] args) {
        // build list a
        SinglyLinkedList a = new SinglyLinkedList();
        a.insertNode(1);
        a.insertNode(3);
        a.insertNode(7);

        SinglyLinkedListNode aPtr = a.head;
        while(aPtr != null) {
            System.out.println(aPtr.data);
            aPtr = aPtr.next;
        }


        //        SinglyLinkedListNode head3 =  new SinglyLinkedListNode(3);
//        SinglyLinkedListNode head2 =  new SinglyLinkedListNode(2,head3);
//        SinglyLinkedListNode list1 =  new SinglyLinkedListNode(1,head2);
//
//        SinglyLinkedListNode head4 =  new SinglyLinkedListNode(4);
//        SinglyLinkedListNode list2 =  new SinglyLinkedListNode(3,head4);

        // build list b

        // merge them

        // print the result
    }

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
}

