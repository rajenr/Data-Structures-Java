package coursework.datastructures;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayListHeap implements Heap {

    private ArrayList table;
    private Node parent;
    private Node child;
    private Node rightChild;

    public ArrayListHeap() {
        this.table = new ArrayList();
    }

    /**
     * Inserts item to where it belongs in the heap.
     *
     * @param item
     * @return true if item is inserted, false if it is not inserted and already in heap.
     */
    @Override
    public boolean insert(Object item) {
        if (!contains(item)) {
            this.table.add(item);

            if (this.table.size() == 0) {
                this.parent = (Node) item;
            } else {
                this.child = (Node) table.get(table.size() - 1);
                this.parent = (Node) table.get((this.table.size() - 2)/2);
            }
            return true;
        }
        return false;
    }

    /**
     * Returns true if target is found in heap.
     *
     * @param target
     * @return true if target is found, false if target is not found.
     */
    @Override
    public boolean contains(Object target) {
        return false;
    }

    /**
     * Removes target (if found) from heap and returns true; otherwise, returns false.
     *
     * @param target
     * @return
     */
    @Override
    public boolean remove(Object target) {
        return false;
    }

    public Node getParent() {
        return this.parent;
    }

    public Node getChild() {
        return this.child;
    }

    public Node getRightChild() {
        return this.rightChild;
    }


    protected static class Node<E> implements Serializable {

        /** Generic data type */
        protected E data;
        /** Left node of given root */
        protected Node<E> left;
        /** Right node of given root */
        protected Node<E> right;

        /**
         * Node constructor
         * @param data Generic param
         */
        public Node(E data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        /**
         * Converts Node data to a String object
         * @return String containing data
         */
        public String toString() {
            return data.toString();
        }
    }



}
