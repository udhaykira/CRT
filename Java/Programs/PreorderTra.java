import java.util.*;
public class PreorderTra {
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

    public static void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }
    //level order
    public static void Bfs(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftnodes = count(root.left);
        int rightnodes = count(root.right);
        return leftnodes+rightnodes+1;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftnodes = sum(root.left);
        int rightnodes = sum(root.right);
        return leftnodes+rightnodes+root.data;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int height = Math.max(left,right)+1;
        return height;
    }
    //O(n2)
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3=height(root.left)+height(root.right)+1;
        return  Math.max(dia3,Math.max(dia1,dia2));
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BiTree tree = new BiTree();
        Node root = tree.BuildTree(nodes);
        Preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        Postorder(root);
        System.out.println();
        Bfs(root);
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
    }
    
}
