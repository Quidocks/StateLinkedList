// Node.java
import java.util.List;

public class Node {
    String stateName;
    List<String> neighbors;
    Node next;

    // Constructor to initialize the node
    public Node(String stateName, List<String> neighbors) {
        this.stateName = stateName;
        this.neighbors = neighbors;
        this.next = null;  // next is null when creating a new node
    }
}
