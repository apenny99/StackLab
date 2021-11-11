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
    public T peek(){
        return (T) topNode(root).getValue();//return the value of the top node in the stack casted to a T type

    }
}
