
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayStack arr = new ArrayStack();
		int[] nums = { 1, 7, 3, 4, 9, 2 };
		for (int i = 0; i < nums.length; i++) {
			arr.push(nums[i]);
		}
		System.out.println("Pop of top number from ArrayStack");
		System.out.println("Size of ArrayStack: " + arr.size());
		for (int i = 0; i < nums.length; i++) {
			System.out.println(arr.pop());
		}

		LinkedStack link = new LinkedStack();
		for (int i = 0; i < nums.length; i++) {
			link.push(nums[i]);
		}
		System.out.println("Pop of top number from LinkedStack");
		System.out.println("Size of LinkedStack: " + link.size());
		for (int i = 0; i < nums.length; i++) {

			System.out.println(link.pop());
		}

		for (int i = 0; i < nums.length; i++) {
			link.push(nums[i]);
		}
		System.out.println("Removing bottom half of LinkedStack");
		link.removeBottomHalf();
		System.out.println("Size of LinkedStack after removingBottomHalf: " + link.size());
		System.out.println("Pop the LinkedStack after removingBottomHalf");
		for (int i = 0; i <= link.count + 1; i++) {

			System.out.println(link.pop());
		}
	}

}
