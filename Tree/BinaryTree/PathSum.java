import java.util.ArrayList;
import java.util.List;

public class PathSum {

    static int pathCount=0;
    static List<List<Integer>> ans;
    public static void main(String[] args) {
       int[] arr = {20, 10, 30, 5, 15, 25, 5, 5, 10, 20};
        //int arr[]={5,20,10,30,15,25};
        //int arr[]={1,2,3,5};

        System.out.println("Insert data in BST");
        TreeNode node=null;
        BinarySearchTree bst=new BinarySearchTree();
        for (int i : arr) {
            node=bst.insertBst(node, i);
        }

        PathSum ps=new PathSum();
        TreeNode temp=node;
        System.out.println(ps.checkPathSum(temp, 45));
        
        TreeNode tempPathSum=node;
        ps.getPathExistCount(tempPathSum, 45);
        System.out.println(pathCount);

        TreeNode tempPathSumList=node;
        System.out.println(ps.getPathList(tempPathSumList, 45));
    }
    
    // Check if there is a root-to-leaf path with given sum exists.
    public boolean checkPathSum(TreeNode root,int target){
        if(root == null) return false;

        // If leaf node, check sum
        if(root.left == null && root.right == null)
            return target == root.val;

        int rem = target - root.val;

        return checkPathSum(root.left, rem) ||
            checkPathSum(root.right, rem);
    }

    //give me a count of path exist in a given tree.
    public void getPathExistCount(TreeNode node,int target){
        if(node==null){
            return;
        }

        if(node.left==null && node.right==null){
            if(target==node.val){
                pathCount++;
                return;
            }
             
            
        }

        int rem=target-node.val;
        getPathExistCount(node.left, rem);
        getPathExistCount(node.right, rem);
    }

    //Suporting function for list of path
    public List<List<Integer>> getPathList(TreeNode node,int target){
        ans=new ArrayList<>();
        PathSum ps =new PathSum();
        ps.getPathExistList(node, target, new ArrayList<>());
        return ans;
    }  

    //give me all path exist in a given tree. (You can return List<List<Integer>>)
    public void getPathExistList(TreeNode node,int target,List<Integer>path){
        if(node==null){
            return;
        }
        path.add(node.val);

        if(node.left==null && node.right==null){
            if(target==node.val){
                pathCount++;
                ans.add(new ArrayList<>(path));
                return; // This return is important to avoid further processing or go deeper. Because we have reached leaf node. and after leaf node there is null nodes.
            }
             
        }

        int rem=target-node.val;
        getPathExistList(node.left, rem,path);
        getPathExistList(node.right, rem,path);
        path.remove(path.size()-1);
    }
}
