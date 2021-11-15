package linear;

public class LLApp {


	public static IntNode addFront(int item, IntNode front) {
		return new IntNode(item, front);
	}

	public static IntNode deleteFront(IntNode front) {
		if (front == null) {
			System.out.println("Empty list, nothing to delete");
			return null;
		}
		return front.next;
	}

	public static boolean search(IntNode front, int target) {
		for (IntNode ptr=front; ptr != null; ptr=ptr.next) {
			if (target == ptr.data) {
				return true;
			}
		}
		return false;
	}

	
	// while loop version, stylized single-line output
	public static void traverse(IntNode front) {
		if (front == null) {
			System.out.println("Empty list");
			return;
		}
		System.out.print(front.data);  // first item
		IntNode ptr=front.next;    // prepare to loop starting with second item
		while (ptr != null) {
			System.out.print("->" + ptr.data);
			ptr = ptr.next;
		}
		System.out.println();
	}
	
	public static void addAfter(IntNode front, int oldItem, int newItem) {
		// find oldItem
		for (IntNode ptr=front; ptr != null; ptr=ptr.next) {
			if (oldItem == ptr.data) {
				IntNode tmp = new IntNode(newItem,null);
				tmp.next = ptr.next;
				ptr.next = tmp;
				break;   // add only after first occurrence of old item
			}
		}
		
	}
	
	public static IntNode delete(IntNode front, int item) {
		if (front == null) {
			return null;
		}
		
		
		IntNode ptr=front,prev=null;
		while (ptr != null && ptr.data != item) {
			prev = ptr;
			ptr = ptr.next;
		}
		// check if first item is being deleted
		if (prev == null) {  // same as if (ptr == front)
			return front.next;
		}
		
		if (ptr == null) { // item not in list
			return front;
		}
		prev.next = ptr.next;
		return front;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntNode front = null;
        traverse(front);  // test traverse on empty list
        System.out.println("\nadding 4 to front");
        front = addFront(4,front);
        traverse(front);
        System.out.println("\nadding 6 to front");
        front = addFront(6,front);
        traverse(front);
        System.out.println("\nadding 8 to front");
        front = addFront(8,front);
        traverse(front);
        
        
        System.out.println("\ndeleting front");
        front = deleteFront(front);
        traverse(front);
        System.out.println("\ndeleting front");
        front = deleteFront(front);
        traverse(front);
        System.out.println("\ndeleting front");
        front = deleteFront(front);
        traverse(front);
        System.out.println("\ndeleting front");
        front = deleteFront(front);
        
       
	}

}

