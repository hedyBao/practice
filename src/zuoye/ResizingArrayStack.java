package zuoye;
import java.util.Iterator;
public class ResizingArrayStack<Item> implements Iterable<Item> {




    private Item[] a= (Item[]) new Object[1];
    private int N=0;
    private boolean isEmpty(){
        return N==0;
    }
    private int size(){
        return N;
    }
    private void resize(int max){
//        /temp是的数组；a是开头就声明的旧数组
        Item[] item= (Item[])new Object[max];
        for(int i =0;i<N;i++)
            item [i]=a [i];
            a=item;
    }
    private Item pop(){
        Item item =a[--N];
//        避免对象游离
        a[N]=null;
        if(N>0 && N<a.length/4) resize(a.length/2);
        return item;
    }
    private void push(Item item){
        if(N == a.length) resize(2*a.length);
        a[N++]=item;
    }


    private class ReverArrayIterator implements Iterator<Item>{
        private int i=N;
        public boolean hasNext(){
            return i>0;
        }
        public Item next(){
            return a[--i];
        }
        public void remove(){

        }
    }


    @Override
    public Iterator<Item> iterator() {
        return new ReverArrayIterator();
    }


    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack();
        //stack.push();

    }
}
