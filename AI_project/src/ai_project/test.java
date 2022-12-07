package ai_project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class test {

    static class graph {

        int v;
        LinkedList<node> adj[];

        static class node implements Comparator<node> {

            int val;
            int dist;

            public node(int val, int dist) {
                this.val = val;
                this.dist = dist;
            }

            private node() {
            }

            public int getVal() {
                return val;
            }

            public int getDist() {
                return dist;
            }

            @Override
            public int compare(node node1, node node2) {

                if (node1.dist < node2.dist) {
                    return -1;
                }

                if (node1.dist > node2.dist) {
                    return 1;
                }

                return 0;
            }

            @Override
            public String toString() {
                return "val:" + val + "  dis :" + dist;
            }

        }

        public graph(int v) {

            this.v = v;
            adj = new LinkedList[v];

            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList<>();
            }
        }

        public void add(int v, int val, int dis) {
            node n1 = new node(val, dis);
            adj[v].add(n1);
            System.out.println(v + " : " + n1.getVal() + " dist --> " + n1.dist);

        }

        public void show() {

            PriorityQueue<node> p = new PriorityQueue<>(v, new node());
            p.add(new node(1, 50));
            p.add(new node(2, 30));
            p.add(new node(3, 20));
            p.add(new node(4, 10));
            while (!p.isEmpty()) {
                System.out.println(p.remove());
            }

        }
        ArrayList<Integer> arr = new ArrayList<>();

        public int[] ucs(int v, graph g, int src, int goal) {
     

            int distant[] = new int[v];
            for (int i = 0; i < v; i++) {
                distant[i] = Integer.MAX_VALUE;
            }
            distant[src] = 0;
            PriorityQueue<node> p = new PriorityQueue<>(v, new node());
            p.add(new node(src, 0));

            while (p.size() > 0) {
                node temp = p.poll();
                int n = temp.getVal();
   if (!arr.contains(temp.getVal())) {
                            arr.add(temp.getVal());
                        }
                if (temp.getVal() == goal) {

                    break;
                }

                for (int i = 0; i < adj[n].size(); i++) {
                    node a = adj[n].get(i);
                    if (distant[temp.getVal()] + a.getDist() < distant[a.getVal()]) {
                        distant[a.getVal()] = distant[temp.getVal()] + a.getDist();
                        p.add(new node(a.getVal(), distant[a.getVal()]));
                     
                    }
                }
            }
            return distant;
        }

        public static void main(String[] args) {

            graph g = new graph(8);
//            g.add(0, 1, 4);
//            g.add(0, 7, 8);
//            g.add(1, 2, 8);
//            g.add(1, 0, 4);
//            g.add(1, 7, 11);
//            g.add(2, 1, 8);
//            g.add(2, 3, 7);
//            g.add(2, 8, 2);
//            g.add(2, 5, 4);
//            g.add(3, 2, 7);
//            g.add(3, 5, 14);
//            g.add(3, 4, 9);
//            g.add(4, 3, 9);
//            g.add(4, 5, 10);
//            g.add(5, 4, 10);
//            g.add(5, 3, 14);
//            g.add(5, 2, 4);
//            g.add(5, 6, 2);
//            g.add(6, 5, 2);
//            g.add(6, 8, 6);
//            g.add(6, 7, 1);
//            g.add(7, 6, 1);
//            g.add(7, 8, 7);
//            g.add(7, 1, 11);
//            g.add(7, 0, 8);
//            g.add(8, 2, 2);
//            g.add(8, 6, 6);
//            g.add(8, 7, 7);
            g.add(1,2,1);
            g.add(1,3,5);
            g.add(1,4,8);
            g.add(2,1,1);
            g.add(2, 5, 3);
            g.add(2, 6, 7);
            g.add(2, 7, 9);
            g.add(3, 1, 5);
            g.add(3, 7, 4);
            g.add(4,1,8);
             g.add(4,7,5);
            g.add(5,2,3);
            g.add(6,2,7);
            g.add(7,2,9);
            g.add(7,3,4);
            g.add(7,4,5);
            
            
            
            
            

            int[] distance = g.ucs(9, g, 1, 7);
            // Printing the Output
            System.out.println("Vertex  "
                    + "  Distance from Source");
            for (int i = 0; i < 8; i++) {
                System.out.println(i + "             "
                        + distance[i]);

            }
            System.out.println(g.arr.toString()+distance[7]);
        }

    }
}
