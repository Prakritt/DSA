package SortedArrayToBST;

import SortedArrayToBST.TreeNode;;

public class Main{
    public static void main(String[] args){
        int arr[] = {111,13,15,17,19};
        createBSTfromArray(arr);
        
    }
    
    public static void createBSTfromArray(int arr[]){
        TreeNode root = createBSTfromArray(arr,0,arr.length - 1 );
        traverseTree(root);
    }
    
    public static TreeNode createBSTfromArray(int arr[], int left, int right){
        if(left > right){
            return null;
        }
        
        int mid = left + (right-left)/2;
        TreeNode treeNode = new TreeNode(arr[mid]);
        treeNode.left = createBSTfromArray(arr,left,mid-1);
        treeNode.right = createBSTfromArray(arr,mid+1, right);
        
        return treeNode;
    }
    
    public static void traverseTree(TreeNode root){
        if(root == null){
            return;
        }
        traverseTree(root.left);
        System.out.print(root.val + " ");
        traverseTree(root.right);
    }
    
}