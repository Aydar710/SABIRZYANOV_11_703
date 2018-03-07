import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int[][] mi = {
                {1, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 0, 1, 1},
                {0, 1, 0, 0}};
        GraphCode graph = new GraphCode(mi);
        Iterator<Edge> iterator = graph.iterator();
GraphCode gr = graph.neighbors(3, mi);
for (Edge x: gr)
    System.out.println(x.getVertex1() + " " + x.getVertex2());



        //        System.out.println("Вершина 13 удалена");
//        graph.delete(1, 3);
//        int arr[][] = graph.getMI();
//        System.out.println("Матрица инцидентности");
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        ArrayList<Integer> showVertex;
//        System.out.println("Список вершин, степень инцидентности больше 2");
//        showVertex = graph.show(1);
//        //GraphCode neighboringEdge = graph.neighbors(4, graph.getMI());
//        for (int x : showVertex)
//            System.out.print(x + " ");
//        System.out.println("Вершина 2 удалена");
//        graph.modify(2);
//        GraphCode gr =  graph.neighbors(3, mi);
//        Iterator<Edge> iterator = graph.iterator();
//        while (iterator.hasNext()) {
//            Object ob = iterator.next();
//            System.out.println(ob);
//        }


    }
}
