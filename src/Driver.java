import chap12.jsjf.ArrayStack;
import chap13.jsjf.LinkedStack;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayStack<Integer> arr = new ArrayStack<Integer>();
		int [] nums= {1,7,3,4,9,2};
		for (int i = 0; i < nums.length;i++) {
			arr.push(nums[i]);
		}
		System.out.println("Pop of top number from ArrayStack");
		System.out.println("Size of ArrayStack: " + arr.size());
		for (int i = 0; i < nums.length;i++) {
			System.out.println(arr.pop());
		}
		
		LinkedStack<Integer> link = new LinkedStack<Integer>();
		for(int i = 0; i< nums.length;i++) {
			link.push(nums[i]);
		}
		System.out.println("Pop of top number from LinkedStack");
		link.removeBottomHalf();
		System.out.println("Size of LinkedStack: " + link.size());
		link.removeBottomHalf();
		for(int i = 0; i<3 ;i++) {
			
			System.out.println(link.pop());
		}
	}

}
