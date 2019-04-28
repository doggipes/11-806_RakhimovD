public class Node {
    private int key;
    private Node parent;
    private Node child;
    private Node left;
    private Node right;
    int degree;
    boolean mark;

    public Node(int key){
        this.key = key;
        right = null;
        degree = 0;
    }

    public int getKey(){
        return key;
    }

    public void key(int key){
        this.key = key;
    }


    public Node getParent(){
        return parent;
    }

    public void parent(Node parent){
        this.parent = parent;
    }


    public Node getChild(){
        return child;
    }

    public void child(Node child){
        this.child = child;
    }

    public boolean hasChild(Node child){
        return child.getChild() != null ? true : false;
    }


    public Node getLeft(){
        return left;
    }

    public void left(Node left){
        this.left = left;
    }


    public Node getRight(){
        return right;
    }

    public void right(Node right){
        this.right = right;
    }
}
