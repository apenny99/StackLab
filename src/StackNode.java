public class StackNode<E, T> {
    private int length=0;
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


    public T pop(){
        topNode(root).getPrev().setNext(null);//sets the child of the top node in the stack to have a parent of null.
        //because the list is traversed top to bottom, this means that when the method to get the nodes parent is called,
        //it will return null, cutting off the last node.
        length--;
        return (T) topNode(root).getValue();//return the value of the top node in the stack casted to a T type

    }
}
