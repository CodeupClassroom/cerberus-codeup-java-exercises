package hackerrank;

public class MergeSortedLists {

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode a, SinglyLinkedListNode b) {
        SinglyLinkedList c = new SinglyLinkedList();

        SinglyLinkedListNode a2 = a;
        SinglyLinkedListNode b2 = b;

        // while a2 and b2 are both still pointing to valid data (i.e., not null)
        // pick the smaller of the 2 and add it to c
        // and move a2 or b2 (whichever was smaller) forward

        // loop will stop when BOTH a2 and b2 are null
        while(a2 != null || b2 != null) {
            if(a2 != null && b2 != null) {
                // need to take the smaller of a2 and b2
                if(a2.data <= b2.data) {
                    c.insertNode(a2.data);
                    a2 = a2.next;
                } else {
                    c.insertNode(b2.data);
                    b2 = b2.next;
                }
            } else {
                // either a2 or b2 are done, so just add the other's next data
                // and move it forward
                if(a2 == null) {
                    // add b2's data
                    c.insertNode(b2.data);
                    b2 = b2.next;
                } else {
                    // b2 is null so add a2's data
                    c.insertNode(a2.data);
                    a2 = a2.next;
                }
            }
        }


        return c.head;
    }

    public static void main(String[] args) {
        // build list a
        SinglyLinkedList a = new SinglyLinkedList();
        a.insertNode(1);
        a.insertNode(3);
        a.insertNode(7);

        SinglyLinkedList b = new SinglyLinkedList();
        b.insertNode(1);
        b.insertNode(2);

        SinglyLinkedList c = new SinglyLinkedList();
        c.head = mergeLists(a.head, b.head);

        SinglyLinkedListNode aPtr = c.head;
//        SinglyLinkedListNode aPtr = b.head;
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

