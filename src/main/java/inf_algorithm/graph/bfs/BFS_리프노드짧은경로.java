package inf_algorithm.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data=val;
        lt=rt=null;
    }
}

public class BFS_리프노드짧은경로 {

    Node root;
    public int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        int level = 0;
        q.add(root);

        while (!q.isEmpty()) {
            int length = q.size();

            for (int i = 0; i < length; i++) {
                Node node = q.poll();

                if (node.lt == null && node.rt == null) {
                    return level;
                }
                q.add(node.lt);
                q.add(node.rt);
            }
            level++;
        }


        return level;
    }

    public static void main(String args[]) {
        BFS_리프노드짧은경로 tree = new BFS_리프노드짧은경로();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
