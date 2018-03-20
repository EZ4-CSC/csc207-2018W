package Test;

public class GraphNode {
  public String address;
  public static int numNodes;
  public GraphNode(String address){
    this.address = address;
    numNodes++;
  }
  public String getAddress(){
    return address;
  }
  public static int getNumNodes(){
    return numNodes;
  }
  public String toString(){
    return "This graph node is at: " + address;
  }
  public void printGraphNode(){
    System.out.println("This is a node.");
  }


}
