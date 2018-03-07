import java.util.*;

public class GraphCode implements List<Edge> {
    private Node head;
    private Node tail;

    GraphCode(int[][] mi) {
        for (int i = 0; i < mi[0].length; i++) {
            Node node = new Node();
            for (int j = 0; j < mi.length; j++) {
                if (mi[j][i] == 1 && node.edge.getVertex1() == 0) node.edge.setVertex1(j + 1);
                else if (mi[j][i] == 1 && node.edge.getVertex1() != 0) node.edge.setVertex2(j + 1);
            }

            if (i == 0) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
    }


    @Override
    public Iterator<Edge> iterator() {
        return new GraphCodeIterator();
    }

    private class GraphCodeIterator implements Iterator<Edge> {
        private Node current;

        public GraphCodeIterator() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Edge next() {
            Node node = new Node(current.edge.getVertex1(), current.edge.getVertex2()); // (current.vetrex1, current.vetrex2)
            current = current.next;
            return node.edge;
        }
    }


    private static class Node {
        private Edge edge;
        Node next;

        public Node() {
            edge = new Edge();
        }

        public Node(int vetrex1, int vetrex2) {
            edge = new Edge();
            this.edge.setVertex1(vetrex1);
            this.edge.setVertex2(vetrex2);

        }
    }

    void insert(int i, int j) {
        Node node = new Node(i, j);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void delete(int i, int j) {
        Node node = new Node(i, j);
        if (head == null)
            return;
        else if (head.edge.getVertex1() == node.edge.getVertex1() && head.edge.getVertex2() == node.edge.getVertex2()) {
            head = head.next;
        } else if (tail.edge.getVertex1() == node.edge.getVertex1() && tail.edge.getVertex2() == node.edge.getVertex2()) {
            Node temp = null;
            for (Node itr = head; itr != tail.next; itr = itr.next) {
                if (itr == tail) {
                    temp.next = null;
                    tail = temp;
                    return;
                }
                temp = itr;
            }
        } else {
            Node temp2;
            Node temp = null;
            for (Node itr = head; itr != tail.next; itr = itr.next) {
                temp2 = itr;
                if (itr.edge.getVertex1() == node.edge.getVertex1() || itr.edge.getVertex2() == node.edge.getVertex2()) {
                    temp.next = itr.next;
                }
                temp = temp2;
            }
        }
    }

    int[][] getMI() {
        int count = 0;
        int maxVertex = 0;
        for (Node itr = head; itr != tail.next; itr = itr.next) {
            if (itr.edge.getVertex1() > maxVertex) {
                maxVertex = itr.edge.getVertex1();
            } else if (itr.edge.getVertex2() > maxVertex) {
                maxVertex = itr.edge.getVertex2();
            }
            count++;
        }
        int[][] arr = new int[maxVertex][count];
        count = 0;
        for (Node itr = head; itr != tail.next; itr = itr.next) {
            arr[itr.edge.getVertex1() - 1][count] = 1;
            arr[itr.edge.getVertex2() - 1][count] = 1;
            count++;
        }
        return arr;
    }

    GraphCode neighbors(int i, int[][] mi) {
        i--;
        GraphCode graph = new GraphCode();
        int arr[];
        for (int j = 0; j < mi[i].length; j++) {
            if (mi[i][j] == 1) {
                if (graph.head == null) {
                    arr = getEdge(mi, j);
                    Node node = new Node(arr[0], arr[1]);
                    graph.head = node;
                    graph.tail = node;
                } else {
                    arr = getEdge(mi, j);
                    Node node = new Node(arr[0], arr[1]);
                    graph.tail.next = node;
                    graph.tail = node;
                }
            }
        }
        return graph;
    }

    int[] getEdge(int arr[][], int column) {
        int mat[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][column] == 1) {
                if (mat[0] == 0)
                    mat[0] = i + 1;
                else
                    mat[1] = i + 1;
            }
        }
        return mat;
    }

    public GraphCode() {
    }


    ArrayList<Integer> show(int m) {
        int[][] mi = getMI();
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < mi.length; i++) {
            for (int j = 0; j < mi[i].length; j++) {
                if (mi[i][j] == 1) count++;
            }
            if (count > m)
                arr.add(i, i + 1);
            count = 0;
        }
        return arr;
    }

    void modify(int i) {
        i--;
        for (Node itr = head; itr != tail.next; itr = itr.next) {
            if (itr.edge.getVertex1() == i + 1 || itr.edge.getVertex2() == i + 1) {
                delete(itr.edge.getVertex1(), itr.edge.getVertex2());
            }
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(Edge t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Edge> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Edge> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Edge get(int index) {
        return null;
    }

    @Override
    public Edge set(int index, Edge element) {
        return null;
    }

    @Override
    public void add(int index, Edge element) {

    }

    @Override
    public Edge remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Edge> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Edge> listIterator(int index) {
        return null;
    }

    @Override
    public List<Edge> subList(int fromIndex, int toIndex) {
        return null;
    }
}






