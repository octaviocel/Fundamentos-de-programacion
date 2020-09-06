    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
    {
       if(head1==null){ return head2;
       }
        else if(head2==null){ return head1;
        }
        

        else{
            SinglyLinkedListNode nuevo=new SinglyLinkedListNode(0);
            SinglyLinkedListNode cola=nuevo;
            
            SinglyLinkedListNode nodo1=head1;
            SinglyLinkedListNode nodo2=head2;
           while(nodo1!=null && nodo2!=null){
                if(nodo1.data<=nodo2.data){
                SinglyLinkedListNode temp=new SinglyLinkedListNode(nodo1.data);
                
                cola.next=temp;
                nodo1=nodo1.next;
                }
                else{
                    SinglyLinkedListNode temp=new SinglyLinkedListNode(nodo2.data);
                cola.next=temp;
                nodo2=nodo2.next;
                }
                cola=cola.next;
           }
           if(nodo1!=null){
                cola.next=nodo1;
           }
           else{
               cola.next=nodo2;
           }
            return nuevo;
           } 
    }
