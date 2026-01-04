import java.util.ArrayList;
import java.util.List;

public class PrintPathTillLeave {
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

        PrintPathTillLeave ptl=new PrintPathTillLeave();
        TreeNode temp=node;
        ptl.printAllPath(temp, new ArrayList<Integer>());
    }

    /* Print All Path of a Tree */
    public void printAllPath(TreeNode node,List<Integer>path){

        if(node==null){
            return;
        }

        path.add(node.val);

        if(node.left==null && node.right==null){
            System.out.println(path.toString());
        }else{
            printAllPath(node.left, path);
            printAllPath(node.right, path);
        }

        path.remove(path.size()-1);
    }
}
