class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty
        if (root == null)
        {
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode nodeToInsert = new StackNode(data);
        nodeToInsert.next = root;
        root = nodeToInsert;
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        //its not empty
        int top = root.data;
        root = root.next;
	//Also return the popped element
        return top;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return root.data;
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
