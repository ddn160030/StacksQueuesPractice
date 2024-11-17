public class GenericQueue<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<E>();

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        if (list.isEmpty())
            return null;
        else
            return list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public E peek()
    {
        if (list.isEmpty())
            return null;
        else
            return list.getFirst();
    }
    @Override
    public String toString() {
        if (list.isEmpty())
            return "Queue is empty";
        else
        {
            String output = list.toString();
            output = output.replace('[', ' ');
            output = output.replace(']', ' ');
            return "GENERIC QUEUE: " + output;
        }

    }
}