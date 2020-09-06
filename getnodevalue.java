    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
 
        SinglyLinkedListNode nodo1 = head;
        SinglyLinkedListNode nodo2 = head;
               
        for (int i=0; i<=positionFromTail; i++){
            nodo1 = nodo1.next;
        }
       while (nodo1 != null){
            nodo1 = nodo1.next;
           nodo2 = nodo2.next;
        }
        return nodo2.data;

    }
