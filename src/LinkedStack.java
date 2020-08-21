
public class LinkedStack {
	LinkedNode front;
	int count;

	public LinkedStack() {
		front = null;
		count = 0;
	}

	public void push(int x) {
		LinkedNode temp = new LinkedNode(x);
		temp.next = front;
		front = temp;
		count++;
	}

	public int pop() {
		int a = front.x;
		front = front.next;
		count--;
		return a;
	}

	public int peek() {
		return front.x;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int size() {
		return count;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += front.x;
			front = front.next;
		}

		return s;
	}

	public void removeBottomHalf() {
		int half = count / 2;
		int[] arr = new int[half];
		for (int i = 0; i < half; i++) {
			arr[i] = pop();
		}
		for (int i = 0; i < half; i++) {
			System.out.println(pop());
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			push(arr[i]);
		}

	}

}
