//package zuoye;
//
//import edu.princeton.cs.algs4.Queue;
//
//public class BreadthFirstPaths {
//    private boolean[] marked;
//    private int[] edgeTo;
//    private final int s;
//    public BreadthFirstPaths(GraphDemo G,int s){
//        marked= new boolean[G.V()];
//        edgeTo= new int[G.V()];
//        this.s=s;
//        bfs(G,s);
//    }
//    private void bfs(GraphDemo G,int s){
//        Queue<Integer> queue= new Queue<Integer>();
//        marked[s]=true;
//        queue.enqueue(s);
//        while(!queue.isEmpty()){
//            int v=queue.dequeue();
//            for (int w:G.adj(v)){
//                if(!marked[w]){
//                    edgeTo[w]=v;
//                    marked[w]=true;
//                    queue.enqueue(w);
//                }
//            }
//        }
//    }
//
//    public boolean hasPathTo(){
//        return marked[v];
//    }
//
//}
