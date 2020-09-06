    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    if (head == null) {
            head = new SinglyLinkedListNode(data);
    } else {
        SinglyLinkedListNode nodorem = head;
        while (nodorem.next != null) {
         nodorem = nodorem.next;
        }
        nodorem.next = new SinglyLinkedListNode(data);
    }   
    return head;

    }
