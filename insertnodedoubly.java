    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
            DoublyLinkedList nuevo = new DoublyLinkedList();
            nuevo.insertNode(data);

            if(head == null)
            {
                return nuevo.head;
            }

            if(head.data > data)
            {
                nuevo.head.next = head;
                head = nuevo.head;
            }else
                {
                 head.next = sortedInsert(head.next, data);
                }
            return head;

    }
