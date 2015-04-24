/**
 * Created by annikamagnusson on 24/04/15.
 */
public class Node {
    private  int x;
    private int y;
    private boolean visited;

    public Node(int x, int y, boolean visited){
        this.x = x;
        this.y = y;
        this.visited = visited;

    }

    public int getX(){
        return  this.x;
    }

    public int getY(){
        return this.y;
    }

    public boolean getVisited(){
        return this.visited;
    }

    public void setVisited(boolean visisted){
        this.visited = visisted;
    }
}
