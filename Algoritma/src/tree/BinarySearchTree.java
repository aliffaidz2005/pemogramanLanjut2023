package tree;

class TreeNode{
    int key;
    TreeNode left,right;

    public TreeNode(int item){
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree(){
        root = null;
    }
    void insert (int key ){
        root = insertRac(root,key);
    }

    TreeNode insertRac(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key);
        }

        if(key < root.key)
            root.left = insertRac(root.left,key);
        else if (key > root.key)
            root.right = insertRac(root.right,key);

        return root;
    }

    void inorder(){
        inorderRec(root);
    }

    void inorderRec(TreeNode root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("inoerder traversal : ");
        bst.inorder();
    }
}
