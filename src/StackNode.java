/**
 * StackNode.java
 * Makes a stack using the Node class
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: Date the program is handed in 11/11/21
 **/
public class StackNode<E, T> {
    private int length;

    private node root;


    public StackNode(){
        root=new node();
        length=0;
    }

    //private methods to make the public ones work.

    private node topNode(node n2){//recursive method to return the current top of the stack
        if(n2.getPrev()==null){
            return n2;
        }
        return topNode(n2.getPrev());
    }

    public boolean isEmpty(){
        if(length==1&&root.getValue()==null){//checks if it only has the root node and if the root node is null or if it has a value. 
            return true;
        }
        return false;
    }
}
