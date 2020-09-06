    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
                
                
                    SinglyLinkedListNode aux = head;
                    SinglyLinkedListNode ant = null;
                    int cont=0;
                    while(aux!=null){
                         if(position==0){
                            head = head.next;
                            aux.next = null;
                            return head;
                         }                       
                        while(position==cont){
                            ant.next = aux.next;
                            aux.next = null;
                            return head;
                        }
                        ant = aux;
                        aux = aux.next;
                        cont++;
                    }
                    return head;
               
    }
