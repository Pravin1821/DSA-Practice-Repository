import java.util.*;

public class BST {
    private class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    private class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd)
        {
            this.node = node;
            this.hd=hd;
        }
    }
    private Node root;
    BST(){
       root = null;
    }
    private Node insertNode(Node root,int val) {
        if(root==null)
        {
            return new Node(val);
        }
        if(val>root.data)
            root.right = insertNode(root.right,val);
        else if(val<root.data)
            root.left = insertNode(root.left, val);
        return root;
    }
    private void inOrderT(Node root)
    {
        if(root!=null)
        {
            inOrderT(root.left);
            System.out.print(root.data+" ");
            inOrderT(root.right);
        }
    }
    private void preOrderT(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preOrderT(root.left);
            preOrderT(root.right);
        }
    }
    private void postOrderT(Node root)
    {
        if(root!=null)
        {
            postOrderT(root.left);
            postOrderT(root.right);
            System.out.print(root.data+" ");
        }
    }
    private void levelOrderT(Node root)
    {
        if(root!=null) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty())
            {
                Node cur = q.poll();
                System.out.print(cur.data+" ");
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
        }
    }
    private void spiralTraversalT(Node root)
    {
        if(root!=null)
        {
            Deque<Node> dq=new ArrayDeque<>();
            dq.addFirst(root);
            boolean t = true;
            while(!dq.isEmpty()) {
                int size = dq.size();
                while (size-- > 0) {
                    if (!t) {
                        Node temp = dq.pollFirst();
                        System.out.print(temp.data + " ");
                        if (temp.left != null)
                            dq.addLast(temp.left);
                        if (temp.right != null)
                            dq.addLast(temp.right);
                    } else {
                        Node temp = dq.pollLast();
                        System.out.print(temp.data + " ");
                        if (temp.right != null)
                            dq.addFirst(temp.right);
                        if (temp.left != null)
                            dq.addFirst(temp.left);
                    }
                }
                t = !t;
            }
        }
    }
    private void verticalOrderT(Node root)
    {
        if(root!=null)
        {
            Queue<Pair> q=new LinkedList<>();
            Map<Integer,List<Integer>> map = new TreeMap<>();
            q.add(new Pair(root,0));
            while(!q.isEmpty())
            {
                Pair cur = q.poll();
                if(!map.containsKey(cur.hd))
                    map.put(cur.hd,new ArrayList<>());
                map.get(cur.hd).add(cur.node.data);
                if(cur.node.left!=null)
                    q.add(new Pair(cur.node.left,cur.hd-1));
                if(cur.node.right!=null)
                    q.add(new Pair(cur.node.right,cur.hd+1));
            }
            for(Map.Entry<Integer,List<Integer>> en:map.entrySet())
            {
                int key = en.getKey();
                List<Integer> cur = en.getValue();
                System.out.print(key+" : ");
                for(int j:cur)
                    System.out.print(j+" ");
                System.out.println();
            }
        }
    }
    private void TopViewT(Node root)
    {
        if(root!=null)
        {
            Queue<Pair> q=new LinkedList<>();
            Map<Integer,List<Integer>> map = new TreeMap<>();
            q.add(new Pair(root,0));
            while(!q.isEmpty())
            {
                Pair cur = q.poll();
                if(!map.containsKey(cur.hd))
                    map.put(cur.hd,new ArrayList<>());
                map.get(cur.hd).add(cur.node.data);
                if(cur.node.left!=null)
                    q.add(new Pair(cur.node.left,cur.hd-1));
                if(cur.node.right!=null)
                    q.add(new Pair(cur.node.right,cur.hd+1));
            }
            for(List<Integer> list:map.values())
                System.out.print(list.getFirst()+" ");
        }
    }
    private void bottomT(Node root)
    {
        if(root!=null)
        {
            Queue<Node> q =new LinkedList<>();
            Stack<Integer> st = new Stack<>();
            q.add(root);
            while(!q.isEmpty())
            {
                Node cur = q.poll();
                st.push(cur.data);
                if(cur.right!=null)
                    q.add(cur.right);
                if(cur.left!=null)
                    q.add(cur.left);
            }
            while(!st.isEmpty())
                System.out.print(st.pop()+" ");
        }
    }
    private void rightT(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            rightT(root.right);
            rightT(root.left);
        }
    }
    private Node deleteNode(Node root, int val)
    {
        if(root == null)
            return null;
        if(val>root.data)
            root.right = deleteNode(root.right, val);
        else if(val<root.data)
            root.left = deleteNode(root.left, val);
        else{
            if(root.left == null && root.right==null)
                return null;
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            Node succ = getMin(root.right);
            root.data = succ.data;
            root.right = deleteNode(root.right,succ.data);
        }
        return root;
    }
    private Node getMin(Node root)
    {
        while(root.left!=null)
            root=root.left;
        return root;
    }
    public void add(int val) {
        root = insertNode(root,val);
    }
    public void inOrder()
    {
        inOrderT(root);
        System.out.println();
    }
    public void preOrder()
    {
        preOrderT(root);
        System.out.println();
    }
    public void postOrder()
    {
        postOrderT(root);
        System.out.println();
    }
    public void levelOrder()
    {
        levelOrderT(root);
        System.out.println();
    }
    public void delete(int val)
    {
        root = deleteNode(root,val);
    }
    public void spiralOrder()
    {
        spiralTraversalT(root);
        System.out.println();
    }
    public void verticalOrder()
    {
        verticalOrderT(root);
        System.out.println();
    }
    public void rightView()
    {
        rightT(root);
        System.out.println();
    }
    public void bottomView()
    {
        bottomT(root);
        System.out.println();
    }
    public void topView()
    {
        TopViewT(root);
        System.out.println();
    }
}
