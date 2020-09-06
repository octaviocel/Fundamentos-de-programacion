

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
            if(head == null){
                 return null;
            }

     SinglyLinkedListNode Nodoreversa = null;

      while(head != null){ 
        SinglyLinkedListNode sig = head.next;
        head.next = Nodoreversa;
        Nodoreversa = head;
        head = sig;
      }
    return Nodoreversa;

    }
