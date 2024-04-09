package view;

import br.edu.fateczl.queue.Queue;
import br.edu.fateczl.stack.IntStack;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Queue<Integer> queue = new Queue<>();
		IntStack stack = new IntStack();
		
		queue.insert(3);
		queue.insert(10);
		queue.insert(1);
		queue.insert(20);
		queue.insert(18);
		queue.insert(7);
		queue.insert(4);
		queue.insert(16);
		queue.insert(2);
		queue.insert(9);
		queue.insert(12);
		queue.insert(14);

		System.out.println(queue.remove());
		stack.push(queue.remove());
		stack.push(queue.remove());
		queue.insert(stack.pop());
		queue.insert(stack.pop());
		System.out.println(queue.remove());
		stack.push(queue.remove());
		stack.push(queue.remove());
		stack.push(queue.remove());
		stack.push(queue.remove());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		queue.insert(queue.remove());
		queue.insert(queue.remove());
		queue.insert(stack.pop());
		stack.push(queue.remove());
		stack.push(queue.remove());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println();
		System.out.println(queue);
	}

}
