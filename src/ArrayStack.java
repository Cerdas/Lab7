import java.util.Arrays;

public class ArrayStack {
	static int DEFAULTCAPACITY = 100;
	int top;
	int[] stack;

	public ArrayStack() {
		this(DEFAULTCAPACITY);
	}

	public ArrayStack(int a) {
		top = 0;
		stack = new int[a];
	}

	public void push(int a) {
		if (size() == stack.length) {
			expandCapacity();
		}
		stack[top] = a;
		top++;
	}

	public void expandCapacity() {
		stack = Arrays.copyOf(stack, stack.length * 2);
	}

	public int pop() {
		top--;
		int a = stack[top];
		return a;
	}

	public int peek() {
		return stack[top - 1];
	}

	public boolean isEmpty() {
		return false;
	}

	public int size() {
		return top;
	}

	public String toString() {
		return null;
	}
}
