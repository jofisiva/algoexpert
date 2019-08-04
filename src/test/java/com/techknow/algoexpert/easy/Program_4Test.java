package com.techknow.algoexpert.easy;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Program_4Test {

    private void expectEmpty(Program_4.DoublyLinkedList linkedList) {
        Assertions.assertTrue(linkedList.head == null);
        Assertions.assertTrue(linkedList.tail == null);
    }

    private void expectHeadTail(Program_4.DoublyLinkedList linkedList, Program_4.Node head, Program_4.Node tail) {
        Assertions.assertTrue(linkedList.head == head);
        Assertions.assertTrue(linkedList.tail == tail);
    }

    private void expectSingleNode(Program_4.DoublyLinkedList linkedList, Program_4.Node node) {
        Assertions.assertTrue(linkedList.head == node);
        Assertions.assertTrue(linkedList.tail == node);
    }

    private ArrayList<Integer> getNodeValuesHeadToTail(Program_4.DoublyLinkedList linkedList) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        Program_4.Node node = linkedList.head;
        while (node != null) {
            values.add(node.value);
            node = node.next;
        }
        return values;
    }

    private ArrayList<Integer> getNodeValuesTailToHead(Program_4.DoublyLinkedList linkedList) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        Program_4.Node node = linkedList.tail;
        while (node != null) {
            values.add(node.value);
            node = node.prev;
        }
        return values;
    }

    private void removeNodes(Program_4.DoublyLinkedList linkedList, ArrayList<Program_4.Node> nodes) {
        for (Program_4.Node node : nodes) {
            linkedList.remove(node);
        }
    }

    private boolean compare(ArrayList<Integer> array1, int[] array2) {
        if (array1.size() != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) != array2[i]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void TestCase1() {
        Program_4.DoublyLinkedList linkedList = new Program_4.DoublyLinkedList();
        Program_4.Node node = new Program_4.Node(1);

        linkedList.setHead(node);
        expectSingleNode(linkedList, node);
        linkedList.remove(node);
        expectEmpty(linkedList);
        linkedList.setTail(node);
        expectSingleNode(linkedList, node);
        linkedList.removeNodesWithValue(1);
        expectEmpty(linkedList);
        linkedList.insertAtPosition(1, node);
        expectSingleNode(linkedList, node);
    }

    @Test
    public void TestCase2() {
        Program_4.DoublyLinkedList linkedList = new Program_4.DoublyLinkedList();
        Program_4.Node first = new Program_4.Node(1);
        Program_4.Node second = new Program_4.Node(2);
        ArrayList<Program_4.Node> nodes = new ArrayList<Program_4.Node>();
        nodes.add(first);
        nodes.add(second);

        linkedList.setHead(first);
        linkedList.setTail(second);
        expectHeadTail(linkedList, first, second);
        removeNodes(linkedList, nodes);
        expectEmpty(linkedList);
        linkedList.setHead(first);
        linkedList.insertAfter(first, second);
        expectHeadTail(linkedList, first, second);
        removeNodes(linkedList, nodes);
        linkedList.setHead(first);
        linkedList.insertBefore(first, second);
        expectHeadTail(linkedList, second, first);
        removeNodes(linkedList, nodes);
        linkedList.insertAtPosition(1, first);
        linkedList.insertAtPosition(2, second);
        expectHeadTail(linkedList, first, second);
        removeNodes(linkedList, nodes);
        linkedList.insertAtPosition(2, first);
        linkedList.insertAtPosition(1, second);
        expectHeadTail(linkedList, second, first);
    }

    @Test
    public void TestCase3() {
        Program_4.DoublyLinkedList linkedList = new Program_4.DoublyLinkedList();
        Program_4.Node first = new Program_4.Node(1);
        Program_4.Node second = new Program_4.Node(2);
        Program_4.Node third = new Program_4.Node(3);
        Program_4.Node fourth = new Program_4.Node(4);


        linkedList.setHead(first);
        Assertions.assertTrue(linkedList.containsNodeWithValue(1) == true);
         linkedList.insertAfter(first, second);
        Assertions.assertTrue(linkedList.containsNodeWithValue(2) == true);
        linkedList.insertAfter(second, third);
        Assertions.assertTrue(linkedList.containsNodeWithValue(3) == true);
        linkedList.insertAfter(third, fourth);
        Assertions.assertTrue(linkedList.containsNodeWithValue(4) == true);
        linkedList.removeNodesWithValue(3);
        Assertions.assertTrue(linkedList.containsNodeWithValue(3) == false);
        linkedList.remove(first);
        Assertions.assertTrue(linkedList.containsNodeWithValue(1) == false);
        linkedList.removeNodesWithValue(4);
        Assertions.assertTrue(linkedList.containsNodeWithValue(4) == false);
        linkedList.remove(second);
        Assertions.assertTrue(linkedList.containsNodeWithValue(2) == false);
    }

    @Test
    public void TestCase4() {
        Program_4.DoublyLinkedList linkedList = new Program_4.DoublyLinkedList();
        Program_4.Node first = new Program_4.Node(1);
        Program_4.Node second = new Program_4.Node(2);
        Program_4.Node third = new Program_4.Node(3);
        Program_4.Node fourth = new Program_4.Node(3);
        Program_4.Node fifth = new Program_4.Node(3);
        Program_4.Node sixth = new Program_4.Node(6);
        Program_4.Node seventh = new Program_4.Node(7);

        linkedList.setHead(first);
        linkedList.insertAfter(first, second);
        linkedList.insertAfter(second, third);
        linkedList.insertAfter(third, fourth);
        linkedList.insertAfter(fourth, fifth);
        linkedList.insertAfter(fifth, sixth);
        linkedList.insertAfter(sixth, seventh);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 3, 3, 6, 7}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {7, 6, 3, 3, 3, 2, 1}));
        expectHeadTail(linkedList, first, seventh);
        linkedList.remove(second);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 3, 3, 6, 7}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {7, 6, 3, 3, 3, 1}));
        expectHeadTail(linkedList, first, seventh);
        linkedList.removeNodesWithValue(1);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 3, 3, 6, 7}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {7, 6, 3, 3, 3}));
        expectHeadTail(linkedList, third, seventh);
        linkedList.removeNodesWithValue(3);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 7}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {7, 6}));
        expectHeadTail(linkedList, sixth, seventh);
        linkedList.removeNodesWithValue(7);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6}));
        expectHeadTail(linkedList, sixth, sixth);
    }

    @Test
    public void TestCase5() {
        Program_4.DoublyLinkedList linkedList = new Program_4.DoublyLinkedList();
        Program_4.Node first = new Program_4.Node(1);
        Program_4.Node second = new Program_4.Node(2);
        Program_4.Node third = new Program_4.Node(3);
        Program_4.Node fourth = new Program_4.Node(4);
        Program_4.Node fifth = new Program_4.Node(5);
        Program_4.Node sixth = new Program_4.Node(6);
        Program_4.Node seventh = new Program_4.Node(7);

        linkedList.setHead(first);
        linkedList.insertAfter(first, second);
        linkedList.insertAfter(second, third);
        linkedList.insertAfter(third, fourth);
        linkedList.insertAfter(fourth, fifth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 4, 5}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 2, 1}));
        expectHeadTail(linkedList, first, fifth);
        linkedList.insertAfter(third, fifth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 5, 4}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 5, 3, 2, 1}));
        expectHeadTail(linkedList, first, fourth);
        linkedList.insertAfter(third, first);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 3, 1, 5, 4}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 5, 1, 3, 2}));
        expectHeadTail(linkedList, second, fourth);
        linkedList.insertAfter(fifth, second);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 1, 5, 2, 4}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 2, 5, 1, 3}));
        expectHeadTail(linkedList, third, fourth);
        linkedList.insertAfter(second, first);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 5, 2, 1, 4}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 1, 2, 5, 3}));
        expectHeadTail(linkedList, third, fourth);
        linkedList.insertAfter(fourth, sixth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 5, 2, 1, 4, 6}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 4, 1, 2, 5, 3}));
        expectHeadTail(linkedList, third, sixth);
        linkedList.insertAfter(second, seventh);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 5, 2, 7, 1, 4, 6}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 4, 1, 7, 2, 5, 3}));
        expectHeadTail(linkedList, third, sixth);
    }

    @Test
    public void TestCase6() {
        Program_4.DoublyLinkedList linkedList = new Program_4.DoublyLinkedList();
        Program_4.Node first = new Program_4.Node(1);
        Program_4.Node second = new Program_4.Node(2);
        Program_4.Node third = new Program_4.Node(3);
        Program_4.Node fourth = new Program_4.Node(4);
        Program_4.Node fifth = new Program_4.Node(5);
        Program_4.Node sixth = new Program_4.Node(6);
        Program_4.Node seventh = new Program_4.Node(7);

        linkedList.setHead(first);
        linkedList.insertBefore(first, second);
        linkedList.insertBefore(second, third);
        linkedList.insertBefore(third, fourth);
        linkedList.insertBefore(fourth, fifth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {5, 4, 3, 2, 1}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {1, 2, 3, 4, 5}));
        expectHeadTail(linkedList, fifth, first);
        linkedList.insertBefore(third, first);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {5, 4, 1, 3, 2}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {2, 3, 1, 4, 5}));
        expectHeadTail(linkedList, fifth, second);
        linkedList.insertBefore(fifth, second);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 5, 4, 1, 3}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 4, 5, 2}));
        expectHeadTail(linkedList, second, third);
        linkedList.insertBefore(fifth, fourth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 4, 5, 1, 3}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 5, 4, 2}));
        expectHeadTail(linkedList, second, third);
        linkedList.insertBefore(second, sixth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 4, 5, 1, 3}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 5, 4, 2, 6}));
        expectHeadTail(linkedList, sixth, third);
        linkedList.insertBefore(first, seventh);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 4, 5, 7, 1, 3}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 7, 5, 4, 2, 6}));
        expectHeadTail(linkedList, sixth, third);
    }

    @Test
    public void TestCase7() {
        Program_4.DoublyLinkedList linkedList = new Program_4.DoublyLinkedList();
        Program_4.Node first = new Program_4.Node(1);
        Program_4.Node second = new Program_4.Node(2);
        Program_4.Node third = new Program_4.Node(3);
        Program_4.Node fourth = new Program_4.Node(4);
        Program_4.Node fifth = new Program_4.Node(5);
        Program_4.Node sixth = new Program_4.Node(6);
        Program_4.Node seventh = new Program_4.Node(7);

        linkedList.setHead(first);
        linkedList.insertAtPosition(1, second);
        linkedList.insertAtPosition(1, third);
        linkedList.insertAtPosition(1, fourth);
        linkedList.insertAtPosition(1, fifth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {5, 4, 3, 2, 1}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {1, 2, 3, 4, 5}));
        expectHeadTail(linkedList, fifth, first);
        linkedList.insertAtPosition(2, first);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {5, 1, 4, 3, 2}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {2, 3, 4, 1, 5}));
        expectHeadTail(linkedList, fifth, second);
        linkedList.insertAtPosition(1, second);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 5, 1, 4, 3}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 4, 1, 5, 2}));
        expectHeadTail(linkedList, second, third);
        linkedList.insertAtPosition(2, fourth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 4, 5, 1, 3}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 5, 4, 2}));
        expectHeadTail(linkedList, second, third);
        linkedList.insertAtPosition(1, sixth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 4, 5, 1, 3}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 5, 4, 2, 6}));
        expectHeadTail(linkedList, sixth, third);
        linkedList.insertAtPosition(5, seventh);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 4, 5, 7, 1, 3}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 7, 5, 4, 2, 6}));
        expectHeadTail(linkedList, sixth, third);
        linkedList.insertAtPosition(8, fourth);
        Assertions.assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 5, 7, 1, 3, 4}));
        Assertions.assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 3, 1, 7, 5, 2, 6}));
        expectHeadTail(linkedList, sixth, fourth);
    }
}

