public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BiTree{
        static int idx=-1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left=BuildTree(nodes);
            newnode.right=BuildTree(nodes);
            return newnode;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BiTree tree = new BiTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);
    }
    
}
