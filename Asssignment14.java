import java.util.PriorityQueue;
import java.util.Queue;

public class Asssignment14 {

	public static void main(String[] args) {
	
		Queue<String> queue = new PriorityQueue<>();

		queue.add("java");
		queue.add("python");
		queue.add("javascript");
		queue.add("cpp");
		queue.add("c");
		queue.add("html");
		queue.add("css");
		queue.add("react");
		queue.add("next");
		queue.add("node");
		System.out.println(queue);
		
		while(!queue.isEmpty()) {			
			System.out.println(queue.poll()+" : "+queue.size());
		}
		
	}

}
