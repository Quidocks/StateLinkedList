// StateLinkedList.java
import java.util.List;

public class StateLinkedList {
    private Node head;  // head of the linked list

    public StateLinkedList() {
        head = null;  // initially empty list
    }

    // Method to add a new state and its neighbors at the end of the list
    public void addState(String stateName, List<String> neighbors) {
        Node newNode = new Node(stateName, neighbors);
        if (head == null) {
            // List is empty, so new node becomes the head
            head = newNode;
        } else {
            // Traverse to the end of the list and add the new node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to delete a state by its name
    public void deleteState(String stateName) {
        if (head == null) {
            return; // List is empty, nothing to delete
        }

        if (head.stateName.equals(stateName)) {
            // The head is the node to delete
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.stateName.equals(stateName)) {
                // Remove the node by linking to the next of next node
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Method to print all states and their neighbors
    public void printStates() {
        Node current = head;
        while (current != null) {
            System.out.println("State: " + current.stateName + ", Neighbors: " + current.neighbors);
            current = current.next;
        }
    }
}
