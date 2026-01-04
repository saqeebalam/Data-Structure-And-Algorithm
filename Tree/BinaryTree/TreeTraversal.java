import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    
    public static void main(String[] args) {
        
        /*Creating a binary tree 
                    10
                   /  \
                  5    20
                 / \
                3   8
        */
        TreeNode node=new TreeNode(10);
        node.left=new TreeNode(5);
        node.right=new TreeNode(20);
        node.left.left=new TreeNode(3);
        node.left.right=new TreeNode(8);
        //node.right.left=new TreeNode(15);
        //node.right.right=new TreeNode(25);

        TreeNode temp=node;
        System.out.println("PreOrder Traversal");
        new TreeTraversal().preOrderTravers(temp);
        
        System.out.println("\nInOrder Traversal");
        TreeNode tempIn=node;
        new TreeTraversal().inOrderTravers(tempIn);

        System.out.println("\nPostOrder Traversal");
        TreeNode tempPost=node;
        new TreeTraversal().postOrderTravers(tempPost);

        System.out.println("\nLevelOrder Traversal");
        TreeNode tempLevl=node;
        new TreeTraversal().levelOrderTravers(tempLevl);

        TreeNode tempCnt=node;
        System.out.println("\nCount Number of Node in A tree: "+new TreeTraversal().countNodeInTree(tempCnt));

        TreeNode tempLvl=node;
        System.out.println("\nCount Number of Node in A tree using Level order: "+new TreeTraversal().countNodeInTreeIter(tempLvl));

        TreeNode tempLeafCnt=node;
        System.out.println("\nCount Number of Leaf Node in A tree: "+new TreeTraversal().countLeafNode(tempLeafCnt));

        TreeNode tempInternalCnt=node;
        System.out.println("\nCount Number of Internal Node in A tree: "+new TreeTraversal().countInternalNode(tempInternalCnt));

        
    }

    /* PreOrder Traversal= root -> left -> right
       PreOrder Traversal=10 -> 5 -> 3 -> 8 -> 20   
    */
    public void preOrderTravers(TreeNode node){
        if(node==null){
            return;
        }

        System.out.print(node.val+" ");
        preOrderTravers(node.left);
        preOrderTravers(node.right);
    }

    /*InOrder Traversal= left -> root -> right 
      InOrder Traversal= 3 -> 5 -> 8 ->10 ->20
    */
    public void inOrderTravers(TreeNode node){
        if(node==null){
            return;
        }
        inOrderTravers(node.left);
        System.out.print(node.val+" ");
        inOrderTravers(node.right);
    }

    /*PostOrder Traversal= left -> right -> root 
      PostOrder Traversal=3 ->8 ->5 ->20 ->10
    */
    public void postOrderTravers(TreeNode node){
        if(node==null){
            return;
        }

        postOrderTravers(node.left);
        postOrderTravers(node.right);
        System.out.print(node.val+" ");
    }

    /*LevelOrder Traversal= step wise = l1-> l2-> l3 ... 
                    10    <-- L1
                   /  \
                  5    20 <-- L2
                 / \
                3   8     <-- L3
       LevelOrder Traversal = 10 -> 5 -> 20 -> 3 -> 8         
    */
   public void levelOrderTravers(TreeNode node){
        if(node==null){
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.add(node);

        while(!q.isEmpty()){
           TreeNode n=q.poll();

           System.out.print(n.val+" ");

           if(n.left!=null){
            q.add(n.left);
           }

           if(n.right!=null){
            q.add(n.right);
           }
        }
   }

   /* Count total number of nodes in a tree
    T.C=O(n)
    S.C=O(h)
   */

   public int countNodeInTree(TreeNode node ){
     if(node==null){
        return 0;
     }   
     return 1+countNodeInTree(node.left)+countNodeInTree(node.right);
   }

   /* Count using Level order iterative way 
    T.C=O(n)
    S.C=O(n)
   */

   public int countNodeInTreeIter(TreeNode node){
    int count=0;

    Queue<TreeNode>q = new LinkedList<>();

    q.add(node);

    while (!q.isEmpty()) {
        TreeNode n=q.poll();
        count++;

        if(n.left!=null){
            q.add(n.left);
        }
        
        if(n.right!=null){
            q.add(n.right);
        }
    }

    return count;
   }


   /* Count Leave node . Leaf node are those node which did not have any children */
   public int countLeafNode(TreeNode node){
    if(node == null){
        return 0;
    }

    if(node.left == null && node.right == null){
        return 1;
    }
    return countLeafNode(node.left)+countLeafNode(node.right);
   }

    /* Count Internal node . Internal node are those node which have at least one child */
   public int countInternalNode(TreeNode node){
    if(node==null){
        return 0;
    }
    
    if(node.left == null && node.right == null){
        return 0;
    }
    return 1+countInternalNode(node.left)+countInternalNode(node.right);
   }

   //Note one more trick : Internal Nodes = Total Nodes − Leaf Nodes OR Vice Versa
}
