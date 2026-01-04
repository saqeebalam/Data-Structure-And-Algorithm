import java.util.ArrayList;
import java.util.List;

public class PrintPathOfXNode {
    public static void main(String[] args) {
        int arr[]={20,10,5,30,25,15,22};
        //int arr[]={5,20,10,30,15,25};
        //int arr[]={1,2,3,5};

        System.out.println("Insert data in BST");
        TreeNode node=null;
        BinarySearchTree bst=new BinarySearchTree();
        for (int i : arr) {
            node=bst.insertBst(node, i);
        }

        PrintPathOfXNode pxn=new PrintPathOfXNode();
        TreeNode temp=node;
        pxn.printPathOfX(temp, new ArrayList<Integer>(), 22);
    }

    public void printPathOfX(TreeNode node,List<Integer> path,int x){
        if(node==null){
            return;
        }
        path.add(node.val);

        if(node.val==x){
            System.out.println(path.toString());
        }

        printPathOfX(node.left, path, x);
        printPathOfX(node.right, path, x);

        path.remove(path.size()-1);
    }
}
