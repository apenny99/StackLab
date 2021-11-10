public class StackNode<E> {
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



    public void push(E element){//method to make a node with inputted value and add it on to the top of the chain
        node n2=new node(element,null,null);
        if(length==0){//if the first value, sets the value of the root node to the input value
            root.setDataType(element);
        }
        if(length==1){//if second value to be added, directly interacts with the root.
            n2.setNext(root);
            root.setPrev(n2);
        }
        if(length>1){//if more than second value to be added, uses recursive method.
            n2.setNext(topNode(root));
            topNode(root).setPrev(n2);

        }
        length++;
    }

}
