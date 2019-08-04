package com.techknow.algoexpert.easy;

public class Program_4 {

    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            if (head == null) {

                head = node;
                tail = node;
                return;
            }
            insertBefore(head, node);
        }

        public void setTail(Node node) {
            if (tail == null) {
                setHead(node);
            }
            insertAfter(tail, node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.

            if (nodeToInsert == head && nodeToInsert == tail)
                return;

            remove(nodeToInsert);

            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            if (node.prev == null) {
                head = nodeToInsert;
            } else {
                node.prev.next = nodeToInsert;
            }

            node.prev = nodeToInsert;

        }

        public void insertAfter(Node node, Node nodeToInsert) {
            if (nodeToInsert == head && nodeToInsert == tail)
                return;

            remove(nodeToInsert);

            nodeToInsert.prev = node;

            nodeToInsert.next = node.next;

            if (node.next == null) {
                tail = nodeToInsert;
            } else {

                node.next.prev = nodeToInsert;
            }

            node.next = nodeToInsert;

        }

        public void insertAtPosition(int position, Node nodeToInsert) {

            if (position == 1)

                setHead(nodeToInsert);

            Node node = head;

            int initialPosition = 1;

            while (node != null && initialPosition++ != position) {
                node = node.next;

            }
            if (node != null) {
                insertBefore(node, nodeToInsert);
            } else {
                setTail(nodeToInsert);
            }

        }

        public void removeNodesWithValue(int value) {
            Node node = head;
            while (node != null) {

                Node nodeToRemove = node;

                node = node.next;

                if (nodeToRemove.value == value)
                    remove(nodeToRemove);
            }

        }

        public void remove(Node node) {

            if (node == head)
                head = head.next;
            if (node == tail)
                tail = tail.prev;

            removeNodeBindings(node);
        }

        private void removeNodeBindings(Node node) {

            if (node.prev != null) {
                node.prev.next = node.next;

            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }

            node.next = null;
            node.prev = null;
        }

        public boolean containsNodeWithValue(int value) {

            Node node = head;
            while (( node != null ) && ( node.value != value )) {

                node = node.next;

            }
            // Write your code here.
            return node != null;
        }

    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

