
    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
                SinglyLinkedListNode nuevo;
                    if(llist == null){
                    llist = new SinglyLinkedListNode(data);
                    return llist;
                    }
                        nuevo = new SinglyLinkedListNode(data);
                        nuevo.next = llist;
                        llist = nuevo;
                    return llist;

    }

