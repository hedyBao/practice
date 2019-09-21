package zuoye.interview;



import edu.princeton.cs.algs4.In;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    public void enMyQueue(int a){



    }

    public void deMyQueue(){

    }




    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);


        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.push(s1.pop());


        while (!s2.empty()){
            System.out.println(s2.pop());

        }
    }

}
