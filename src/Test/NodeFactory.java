package Test;

public abstract class NodeFactory{

  public NodeFactory(){
  }

  public GraphNode getNode(String s, String address){
    if(s.equals("GraphNode")){
      return new GraphNode(address);
    }else{
      return this.getNewDGNode();
    }
  }
  public abstract GraphNode getNewDGNode();

}
