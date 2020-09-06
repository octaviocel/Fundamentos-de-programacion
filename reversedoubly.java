    // Complete the reverse function below.

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
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
          DoublyLinkedListNode aux=head;
          DoublyLinkedListNode sig=null; 
          DoublyLinkedListNode ant=null;
        while(aux!=null){
          sig=aux.next;
          aux.next=ant;
          aux.prev=sig;
          ant=aux;
          aux=sig;
          }
          return ant;

    }
