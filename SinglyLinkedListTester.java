class Node{
    int elem;
    Node next;

    Node(int val){
        this.elem=val;
        this.next=null;

    }

}
class SinglyLinkedList{
    Node head;



public void arrayToListBuilder(int []arr){
    if(arr==null || arr.length==0){
return;
    }
    this.head=new Node (arr[0]);
    Node tail=this.head;
    for(int i=1;i<arr.length;i++){
Node newNode=new Node(arr[i]);
tail.next=newNode;
tail=tail.next;
    }

}
    public void arrayToListBuilderWithoutTail(int[] arr) {
        if(arr==null || arr.length==0){
            return;
        }
        this.head=new Node(arr[0]);
        for(int i =1;i<arr.length;i++){
append(arr[i]);
        }
    }
public void append(int val){
Node newNode= new Node(val);
if(this.head==null){
    this.head=newNode;
}
Node temp=this.head;
while(temp.next!=null){
    temp=temp.next;
}
temp.next=newNode;
}
 public void prepend(int val) {
    Node newNode= new Node(val);

newNode.next=this.head;
this.head=newNode;

}
public int listSize(){
    Node temp=this.head;
    int count=0;
    while(temp!=null){
        temp=temp.next;
        count++;
    }
    return count;
}
public Node nodeAt(int indx){
    if(indx<0 || this.head==null){
        return null;
    }
    else{
        Node temp=this.head;
        int count=0;
        while(temp!=null){
            if(count==indx){
                return temp;
            }
            count++;
            temp=temp.next;
        }
      return null;
    }

}
public String insert(int indx,int val){
    if(indx<0 || indx>listSize()){
        return "Invalid";
    }
    if(indx==0){
        Node newNode=new Node(val);
        newNode.next=this.head;
        this.head=newNode;
    }else{
    Node prev= nodeAt(indx-1);
    if (prev == null) {
                return "Invalid";
            }
    Node nextnode=new Node(val);
    nextnode.next=prev.next;
    prev.next=nextnode;}
    return "ok";
}
 public String remove(int indx){
     if(indx<0 ){
        return "Invalid";
    }
if(indx==0){
    this.head=this.head.next;
}
else{
    Node prev= nodeAt(indx-1);
    if (prev == null) {
                return "Invalid";
            }
            prev.next=prev.next.next;

}
return "ok";
 }

public void printList(){
    if(head==null){
        System.out.println(head.elem);
    }
    Node temp=this.head;
    while(temp!=null){
        System.out.println(temp.elem);
        temp=temp.next;

    }

}
public void reverseList(){
    if(head==null ||head.next==null){
        return ;
    }
    else{
        Node prev=null;
        Node curr=this.head;
    
        while(curr!=null){
            Node newnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnode;

        }
        
       this.head=prev;
    }
}

}















public class SinglyLinkedListTester {
    public static void main(String[] args) {
        // Test Case 1: Build list from array
        // Test Case 1: Build list from array without tail
        int[] arr1 = { 1, 2, 3, 4, 5 };
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.arrayToListBuilderWithoutTail(arr1);
        System.out.println("Test Case 1: Build list from array without tail");
        list1.printList(); // Output: Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> null

        // Test Case 2: Build list from array
        int[] arr = { 1, 2, 3, 4, 5 };
        SinglyLinkedList list = new SinglyLinkedList();
        list.arrayToListBuilder(arr);
        System.out.println("Test Case 1: Build list from array");
        System.out.println("Test Case 2: Build list from array");
        list.printList(); // Output: Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> null

        // Test Case 2: Append an element
        // Test Case 3: Append an element
        list.append(6);
        System.out.println("\nTest Case 2: Append an element");
        System.out.println("\nTest Case 3: Append an element");
        list.printList(); // Output: Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

        // Test Case 3: Prepend an element
        // Test Case 4: Prepend an element
        list.prepend(0);
        System.out.println("\nTest Case 3: Prepend an element");
        System.out.println("\nTest Case 4: Prepend an element");
        list.printList(); // Output: Linked List: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

        // Test Case 4: Insert an element at index 3
        // Test Case 5: Insert an element at index 3
        list.insert(3, 99);
        System.out.println("\nTest Case 4: Insert an element at index 3");
        System.out.println("\nTest Case 5: Insert an element at index 3");
        list.printList(); // Output: Linked List: 0 -> 1 -> 2 -> 99 -> 3 -> 4 -> 5 -> 6 -> null

        // Test Case 5: Remove an element at index 2
        // Test Case 6: Remove an element at index 2
        list.remove(2);
        System.out.println("\nTest Case 5: Remove an element at index 2");
        System.out.println("\nTest Case 6: Remove an element at index 2");
        list.printList(); // Output: Linked List: 0 -> 1 -> 99 -> 3 -> 4 -> 5 -> 6 -> null

        // Test Case 6: Get size of the list
        System.out.println("\nTest Case 6: Get size of the list");
        // Test Case 7: Get size of the list
        System.out.println("\nTest Case 7: Get size of the list");
        System.out.println("Size of the list: " + list.listSize()); // Output: Size of the list: 7

        // Test Case 7: Get node at index 4
        // Test Case 8: Get node at index 4
        Node node = list.nodeAt(4);
        if (node != null) {
            System.out.println("\nTest Case 7: Get node at index 4");
            System.out.println("\nTest Case 8: Get node at index 4");
            System.out.println("Element at index 4: " + node.elem); // Output: Element at index 4: 4
        }

        // Test Case 8: Reverse a linked list
        // Test Case 9: Reverse a linked list
        int[] arr2 = { 1, 2, 3, 4, 5 };
        SinglyLinkedList list8 = new SinglyLinkedList();
        list8.arrayToListBuilder(arr2);
        System.out.println("\nTest Case 8: Reverse a linked list");
        System.out.println("\nTest Case 9: Reverse a linked list");
        list8.reverseList();
        list8.printList(); // Output: Linked List: 5 -> 4 -> 3 -> 2 -> 1 -> null
    }}

