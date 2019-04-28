import java.util.Arrays;
import java.util.LinkedList;

public class fiboncciHeap {
    int size;
    Node min;

    public void fiboncciHeap(){
        size = 0;
        min = null;
    }

    public void add(int key){
        Node newNode = new Node(key);
        newNode.degree = 0;
        newNode.mark = false;
        newNode.parent(null);
        newNode.child(null);

        if(size == 0){
            min = newNode;
            min.left(newNode);
            min.right(newNode);
        }
        else{
            Node prevRight = min.getRight();
            min.right(newNode);
            newNode.left(min);
            newNode.right(prevRight);
            prevRight.left(newNode);
            if(newNode.getKey() < min.getKey())
                min = newNode;
        }

        size++;
    }

    public int getMin(){
        return min.getKey();
    }

    public void union(Node first,Node second){              // soedinyaem dve nodi
        Node L = first.getLeft();
        Node R = second.getRight();

        second.right(first);
        first.left(second);
        L.right(R);
        R.left(L);
    }

    public void merge(fiboncciHeap that){                   //sliyanie dvuh kuch
        if (that.size == 0)
            return;

        if(size == 0){
            min = that.min;
            size = that.size;
        }
        else{
            union(min, that.min);
            size += that.size;
        }

        if (that.min.getKey() < min.getKey())
            min = that.min;
    }

    public int deleteMin(){                           //udalyaem minimalnoe znachenie + sobiraem v derev'ya
        Node prevMin = min;
        if(prevMin.getRight() == prevMin){
            min = min.getChild();
            if(min.getRight() != min)
            consolidate();
            size--;
            return prevMin.getKey();
        }

        if(min.getChild() != null) {
            union(min, min.getChild());
        }

        Node L = min.getLeft();
        Node R = min.getRight();
        L.right(R);
        R.left(L);


        min = min.getRight();
        consolidate();
        size--;
        return prevMin.getKey();
    }

    public void consolidate(){              //sobiraem v derev'ya
        Node[] A = new Node[size];
        A[min.degree] = min;
        Node current = min.getRight();

        while(conflict()){
            if(A[current.degree] == null)
            {

                if(min.getKey() > current.getKey())
                    min = current;
                A[current.degree] = current;
                current = current.getRight();
                if(min.getKey() > current.getKey())
                    min = current;
            }
            else{
                if(A[current.degree] == current)
                    return;

                Node conflict = A[current.degree];
                Node addTo,adding;
                if(conflict.getKey() < current.getKey()){
                    addTo = conflict;
                    adding = current;
                }
                else{
                    addTo = current;
                    adding = conflict;
                }


                Node L = adding.getLeft();
                Node R = adding.getRight();
                L.right(R);
                R.left(L);
                adding.left(adding);
                adding.right(adding);


                if(addTo.getChild() == null) {
                    addTo.child(adding);
                }
                else {
                    union(addTo.getChild(), adding);
                }

                adding.parent(addTo);
                A[current.degree] = null;
                addTo.degree++;
                current = addTo;
                if(min.getKey() > addTo.getKey())
                    min = addTo;
            }
        }
        if(min.getKey() > min.getRight().getKey())
            min = min.getRight();
    }

    public boolean search(int key){             //v internete ne bilo(((( napisal svoe podobie dfs
        LinkedList<Node> visited = new LinkedList<>();
        Node findNode = min;
        visited.add(findNode);

        while(visited.size() != size) {
            if(key == findNode.getKey())
                return true;
            if (findNode.hasChild(findNode) && !visited.contains(findNode.getChild())) {
                findNode = findNode.getChild();
                visited.add(findNode);
            }
            else {
                if(!visited.contains(findNode.getLeft())){
                    findNode = findNode.getLeft();
                    visited.add(findNode);
                }
                else{
                    if(!visited.contains(findNode.getRight())){
                        findNode = findNode.getRight();
                        visited.add(findNode);
                    }
                    else
                        findNode = findNode.getParent();
                }
            }
        }
        return false;
    }

    public boolean conflict(){
        Node[] A = new Node[size];
        int chet = 0;
        Node check = min;
        while (chet < size - 1){
            if(A[check.degree] != null)
                return true;
            else
                A[check.degree] = check;

            if(check.degree == 0)
                chet++;
            else
                chet += (int) Math.pow(2,check.degree);
            if(check.getKey() < min.getKey())
                min = check;
            check = check.getRight();
        }
        return false;
    }
}
