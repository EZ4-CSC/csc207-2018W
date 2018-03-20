package Test;

public class DirectedGraphNode extends GraphNode {
  public String address;
  private String previous;
  private String next;
  public static int numNodes;


  public DirectedGraphNode(String address, String p, String n){
    super(address);
    previous = p;
    next = n;
  }

  public String getAddress(){
    return address;
  }
  public static int getNumNodes(){
    return numNodes;
  }
  public String toString(){
    return "This directed graph node is at: " + address;
  }
  public void printDirectedGN(){
    System.out.println("This is a directed graph node between " + previous + " and " + next);
  }
  public boolean equals(Object o){
    if(((GraphNode)o).address!=null){
      return (o instanceof DirectedGraphNode) && (((GraphNode)o).getAddress() == this.address);
    }else{
      return false;
    }
  }

  public static void main(String[] args) {
    GraphNode n1 = new GraphNode("Addr 1");
    GraphNode n2 = new DirectedGraphNode("Addr 2", "p1", "2");
    DirectedGraphNode n3 = new DirectedGraphNode("Addr 3", "p1", "2");
    GraphNode n4 = (GraphNode) n3;
    DirectedGraphNode n5 = new DirectedGraphNode("Addr 2", "p1", "2");

    System.out.println(DirectedGraphNode.getNumNodes());
    System.out.println(GraphNode.getNumNodes());

    System.out.println(n3.getAddress());
    System.out.println(n4.getAddress());

    System.out.println(n3.address.equals(n4.address));

    System.out.println(n3.toString());
    System.out.println(n4.toString());

    System.out.println(n2.equals(n5));
    System.out.println(n2 == n5);
    System.out.println(n4.equals(n3));

    System.out.println(n3.printGraphNode());
    System.out.println(n4.printGraphNode());



  }

  public static void main(String[] args) {
      
  }

}
