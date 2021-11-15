
public class StackTest {
    public static void main(String[] args) {
        StackNode s = new StackNode();
        System.out.println(s.isEmpty());
        System.out.println("Peek and pop when empty");
        System.out.println(s.peek());
        System.out.println(s.pop());
        for(int i=0;i<10;i++){
            s.push("Value");
            s.push(i);
        }

        for(int b=0;b<10;b++){
        }
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());

    }
}
