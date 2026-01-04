import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public static void main(String[] args) {
        int arr[]={20,10,5,30,25,15,4,6,14,16};
        //int arr[]={5,20,10,30,15,25};
        //int arr[]={1,2,3,5};

        System.out.println("Insert data in BST");
        TreeNode node=null;
        BinarySearchTree bst=new BinarySearchTree();
        for (int i : arr) {
            node=bst.insertBst(node, i);
        }

        // TreeNode temp=node;

        // System.out.println(bst.searchBST(temp, -35));
        TreeNode tempHight=node;
        System.out.println(bst.heightBst(tempHight));
        //System.out.println(node);
        TreeNode tempDepthRec=node;
        System.out.println(bst.minDepth(tempDepthRec));
        TreeNode tempDepthIter=node;
        System.out.println(bst.minDepth(tempDepthIter));
    }


    /* Insert a data or create a BST  */
    public TreeNode insertBst(TreeNode node,int val){

        if(node==null){
            return new TreeNode(val);
        }

        if(val<node.val){
            node.left=insertBst(node.left, val);
        }

        if(val>node.val){
            node.right=insertBst(node.right, val);
        }

        return node;
    }


    /* Searching in BST */

    public boolean searchBST(TreeNode node ,int val){
        
        if(node==null){
            return false;
        }
        
        if(node.val==val){
            return true;
        }

        if(val<node.val){
             return searchBST(node.left, val);
        }

        if(val>node.val){
            return searchBST(node.right, val);
        }

        return false;
    }

    /* Height of BST
     */

    public int heightBst(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+ Math.max(heightBst(node.left), heightBst(node.right));
    }

    /**
     * Find Minimum depth of BST. It is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     */
    //Using recursive
    //T.C=O(n)
    //S.C=O(h)due to stack
    public int minDepth(TreeNode node){
        if(node == null){
            return 0;
        }
        if(node.left==null){
            return 1 + minDepth(node.right);
        }
        if(node.right==null){
            return 1 +minDepth(node.left);
        }
        return 1 + Math.min(minDepth(node.left), minDepth(node.right));
        
    }

    //Use iterative approach
    //T.C=O(n)
    //S.C=O(1)
    public int minDepthIter(TreeNode node){
        int depth=0;

        Queue<TreeNode>q=new LinkedList<>();
        q.add(node);
        depth++;

        while (!q.isEmpty()) {
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();

                if(n.left==null && n.right==null){
                    return depth;
                }

                if(n.left!=null){
                    q.add(n.left);
                }

                if(n.right!=null){
                    q.add(n.right);
                }
            }
            depth++;
        }

        return depth;
    }
}
