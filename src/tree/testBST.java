package tree;

public class testBST {
    public static void main(String[] args){
        bsTree bst= new bsTree();
        bst.insert(3);
        bst.insert(5);
        bst.insert(6);
        System.out.println(bst.findMax().data);
    }
}
