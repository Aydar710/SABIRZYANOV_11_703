import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphCodeTest {
    private GraphCode graph;

    @Before
    public void setUp() {
        int[][] mi = {
                {1, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 0, 1, 1},
                {0, 1, 0, 0}};
        graph = new GraphCode(mi);
    }

    @Test
    public void delete() {
        int i = 2;
        int j = 3;
        graph.delete(i, j);
        for (Edge edge : graph) {
            assertFalse(edge.getVertex1() == i && edge.getVertex2() == j);
        }
    }

    @Test
    public void insert() {
        int i = 4;
        int j = 5;
        graph.insert(i, j);
        boolean f = false;
        for (Edge edge : graph) {
            if (edge.getVertex1() == i && edge.getVertex2() == j)
                f = true;
        }
        assertTrue(f);
    }


    @Test
    public void getMI() {
        GraphCode gr = new GraphCode();
        gr.insert(1, 2);
        gr.insert(1, 4);
        gr.insert(2, 3);
        gr.insert(1, 3);
        int[][] mi = {
                {1, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 0, 1, 1},
                {0, 1, 0, 0}};
        assertArrayEquals(mi, gr.getMI());
    }

    @Test
    public void neighbors() {
        GraphCode gr = graph.neighbors(1, graph.getMI());
        for (Edge x : gr) {
            if (x.toString().equals("12"))
                continue;
            else if (x.toString().equals("14"))
                continue;
            else if (x.toString().equals("13"))
                continue;
            fail();
        }


    }

    @Test
    public void show() {
        ArrayList<Integer> arr = graph.show(1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        assertTrue(arr.equals(arr2));

    }

    @Test
    public void modify() {
        GraphCode gr = graph;
        int i = 3;
        i--;
        int k = 0;
        while (k > graph.getMI()[i].length){
            if (graph.getMI()[i][k] == 1)
                gr.delete(i, k);
            k++;
        }
        graph.modify(i + 1);
        assertArrayEquals(gr.getMI(), graph.getMI());
    }
}