package coursework.datastructures;

/**
 * Heap.java
 * Implementation of the Heap interface.
 *
 * @version 1.0
 * @author Reesha Rajen
 */
public interface Heap<E> {

    /**
     * Inserts item to where it belongs in the heap.
     * @param item
     * @return true if item is inserted, false if it is not inserted and already in heap.
     */
    boolean insert(E item);

    /**
     * Returns true if target is found in heap.
     * @param target
     * @return true if target is found, false if target is not found.
     */
    boolean contains(E target);

    /**
     * Removes target (if found) from heap and returns true; otherwise, returns false.
     * @param target
     * @return
     */
    boolean remove(E target);
}
