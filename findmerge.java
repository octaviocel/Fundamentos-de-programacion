    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null)
    {
        SinglyLinkedListNode temp = head1.next;
        head1.next = null;
        head1 = temp;
    }

     while (head2.next.next != null)
        {
        head2 = head2.next;
        }

    return head2.next.data;

    }
