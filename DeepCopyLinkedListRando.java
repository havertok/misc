/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

//Mostly for my own safekeeping.  Obviously this won't run, no test driver
import java.util.Hashtable;

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        
        Hashtable<Node, Node> nodeTable = new Hashtable<Node, Node>();
        
        Node running = head;
        
        while(running != null){
            Node temp = new Node(running.val);

            nodeTable.put(running, temp);
            
            running = running.next;
        }
        
        Node running2 = head;
        
        while(running2 != null){
            if(running2.random != null){
                Node tempRandom = nodeTable.get(running2.random);
                Node randCurrent = nodeTable.get(running2);
                randCurrent.random = tempRandom;
            }
            if(running2.next != null){
                Node tempNext = nodeTable.get(running2.next);
                Node current = nodeTable.get(running2);
                current.next = tempNext;
            }

            running2 = running2.next;
        }
        
        return nodeTable.get(head);
    }

    
}