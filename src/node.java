/**
 * myNode
 * A class to make nodes that connect to one another and store data
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: Date the program is handed in: 9/29/21
 **/

public class node<T> {

    private T val; //data stored
    private node N; //node it is connected to


    public node(){//default constructor
        val=null;
        N = null;
    }
    public node(T t, node n){//constructor with refrence node and value
        this.val=t;
        this.N=n;


    }
    public T getValue(){//retuens value
        return val;
    }
    public node getConnectedNode(){//returns connected node
        return N;
    }

    public void setConnectedNode(node n) {//sets connected node
        N = n;
    }
    public void setDataType(T t){//sets value
        this.val=t;
    }
    public String toString(){ //returns the nodes data in the tostring with prefix "Node :"
        return "Node: " + val.toString();
    }
    public boolean equals(node n){
        if (n.getValue().equals(this.getValue())){
            return true;
        }
        return false;
    }


}
