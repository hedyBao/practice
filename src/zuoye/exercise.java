package zuoye;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import sun.jvm.hotspot.utilities.ReversePtrs;

import java.util.Arrays;

public class exercise {
    public static int[] readInts(String name){
        In in = new In(name);
        Queue<Integer> queue = new Queue<Integer>();
        while (!queue.isEmpty()){
            queue.enqueue(in.readInt());
        }
        int N= queue.size();
       int[] a = new int[N];
       for(int i=0;i<N;i++){
           a[i]= queue.dequeue();

       }
        return a;

    }

}


