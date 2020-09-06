    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1==null&&head2==null) return true;  //si los dos son nulos verdadero
        if(head1==null||head2==null) return false; //si uno de los dos es nulo, falso
        if(head1.data==head2.data){
         return compareLists(head1.next,head2.next); //funcioncomparadora
        }
         return false;

    }
