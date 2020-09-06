    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode nodo=head;
        SinglyLinkedListNode nodo1=n.next;
        while(nodo.next!=null){
    
            if(nodo.data==nodo1.data){
            nodo.next=nodo1.next;
            nodo1=nodo.next; 
            }
            else if(nodo.data!=nodo1.data){
                nodo=nodo1;
                nodo1=nodo.next;
             }
        }
return head;

    }
