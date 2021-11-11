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


    public T peek(){
        return (T) topNode(root).getValue();//return the value of the top node in the stack casted to a T type
    }



    public int size(){//returns the length counter that is in the class instance data.
        return length;
    } 

    public boolean isEmpty(){
        if(length==1&&root.getValue()==null){//checks if it only has the root node and if the root node is null or if it has a value. 
            return true;
        }
        return false;
    }
     public T pop(){
        topNode(root).getPrev().setNext(null);//sets the child of the top node in the stack to have a parent of null.
        //because the list is traversed top to bottom, this means that when the method to get the nodes parent is called,
        //it will return null, cutting off the last node.
        length--;
        return (T) topNode(root).getValue();//return the value of the top node in the stack casted to a T type

    }

}
