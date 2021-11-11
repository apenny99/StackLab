public class StackNode {
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

    public int size(){//returns the length counter that is in the class instance data.
        return length;
    }
}
