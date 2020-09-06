    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode nodof=head;
        SinglyLinkedListNode nodos=head;
        
        if(head==null){
            return false;
        }
        while(nodof!=null && nodos!=null && nodof.next!=null){
            
            nodos=nodos.next;
            nodof=nodof.next.next;
            
            if(nodos==nodof){
                return true;
            }
            
        }
        return false; 
    }
