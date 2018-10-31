/**
 * The <code>QueueInterface</code> interface specifies the basic operations
 * of a first-in-first-out (FIFO) containers.
 */
package queue;

public interface QueueInterface {
    /**
     * Adds the specified element to the back of this queue.
     * @param object the element to be added to this queue.
     */
    public void add(Object object);
    /**
     * Returns the element at the front of this queue.
     * @return the element at the front of this queue.
     * @throw IllegalStateException if this queue is empty
     */
    public Object first();
    /**
     * Removes and returns the element at the front of this queue.
     *@return the elements at the front of this queue.
     *@throws IllegalStateException if this queue is empty
     */
    public Object remove();
    /**
     * Returns the number of elements in this queue.
     * @return the number of elements in this queue.
     */
    public int size();
    /**
     * Returns true or false according to the whether or not queue is empty
     * @return true or false according to the whether or not queue is empty
     */
    public boolean isEmpty();
}
