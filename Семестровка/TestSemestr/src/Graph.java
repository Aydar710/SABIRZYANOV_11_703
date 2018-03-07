import java.util.ArrayList;

public class Graph {
    private int count;

    private static class Node {
        int first;
        int second;
        Node next;

        Node(int i, int j) {
            this.first = i;
            this.second = j;
        }
    }

    private Node head;
    private Node tail;

    public int[][] matrix;

    public Graph() {
        this.count = 0;
    }

    public void insert(int i, int j) {
        Node newNode = new Node(i, j);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public void delete(int i, int j) {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.first == i && head.second == j) {
            head = head.next;
            return;
        }
        Node del = head;
        while (del != null) {
            if (del.next.first == i && del.next.second == j) {
                if (tail == del.next) {
                    tail = del;
                }
                del.next = del.next.next;
                return;
            }
            del = del.next;
        }
    }

    public void GraphCode(int[][] mi) {
        matrix = mi;
        int n = mi.length;
        int m = mi[0].length;

        int one;
        int two;
        for (int i = 0; i < m; i++) {
            one = 0;
            two = 0;
            for (int j = 0; j < n; j++) {
                if (mi[j][i] == 1 && one == 0) {
                    one = j + 1;
                }
                if (mi[j][i] == 1 && one != 0) {
                    two = j + 1;
                }
            }
            insert(one, two);
        }
    }

    public void GraphCode(int i) {
        Node iTop = head;
        int k = 0;
        while (k < count) {
            if (iTop.first == i || iTop.second == i) {
                System.out.println("(" + iTop.first + "," + iTop.second + ")");
            }
            k++;
            iTop = iTop.next;
        }
    }

    int[][] getMI() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return null;
    }

    ArrayList<Integer> show(int m) {
        int k;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < matrix.length; i++) {
            k = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    k++;
                }
            }
            if (k > m) {
                arrayList.add(i + 1);
            }
        }
        return arrayList;
    }

    void modify(int i) {
        int steps = 0;
        Node mod = head;
        while (steps < count + 1) {
            if (mod.second == i || mod.first == i) {
                delete(mod.first, mod.second);
            }
            mod = mod.next;
            steps++;
        }
    }
}
