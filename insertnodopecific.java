
    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode nodo = head, temp = head; //inicia dos nodos nuevo y temporal 
        SinglyLinkedListNode nuevo = new SinglyLinkedListNode(data);
        int count =0; //contador
        if(temp == null){
            nodo = nuevo;
            return nodo;
        }
        while(temp != null){
            if(position-1 == count){
                SinglyLinkedListNode node = temp.next;
                temp.next = nuevo;
                nuevo.next = node;
                break;
            }
            temp = temp.next;
            count++;
        }
        return nodo;


    }
