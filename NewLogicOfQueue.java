package i2.logic;

import java.util.Scanner;

public class NewLogicOfQueue {
	public static final int Num_Dose = 30;

	public static class Node {
		int age;
		long adhar;
		String name;
		long rno;
		Node next; // pointer to the next node

		public Node(int age, long adhar2, String name, long rno) {
			// super();
			this.age = age;
			this.adhar = adhar2;
			this.name = name;
			this.rno = rno;
			this.next = null;
		}
	}

	public static class QueueHead {
		Node front;
		Node rear;
		int count;

		public QueueHead() {
			this.front = null;
			this.count = 0;
			this.rear = null;

		}
	}

	public static boolean IsQueueEmpty(QueueHead queue) {
		boolean b = false;
		if (queue.front == null) {
			b = true;
		}
		return b;
	}

	public static QueueHead Enqueue(QueueHead queue, int age, long adhar, String name, long rno) {
		Scanner input = new Scanner(System.in);
		Node temp = new Node(age, adhar, name, rno);

		if (IsQueueEmpty(queue)) {
			System.out.println("  -----*first in queue*--- ");
			queue.front = temp;
			queue.rear = temp;
		} else {
			queue.rear.next = temp;
			queue.rear = temp;
		}
		System.out.println("You been enqueued into the queue....");
		return queue;
	}

	public static QueueHead Dequeue(QueueHead queue) {
		if (IsQueueEmpty(queue)) {
			System.out.println("Nobody in queue....");
		} else {
			System.out.println("You, " + queue.front.name + " has been dequeued from the queue");
			queue.front = queue.front.next;
		}
		return queue;
	}

	public static void DisplayQueue(QueueHead queue) {

		if (IsQueueEmpty(queue)) {
			queue.count = 0;
			System.out.println("Queue is Empty....");
		} else {
			int count = 0;
			Node curr_node = queue.front;
			System.out.println(
					"------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"REGISTRATION NUMBER                 AGE                AADHAR-CARD NUMBER                NAME");
			while (count < queue.count) {
				System.out.println(
						"-------------------------------------------------------------------------------------------------------");
				System.out.println(curr_node.rno + "                            " + curr_node.age
						+ "                       " + curr_node.adhar + "                       " + curr_node.name);
				curr_node = curr_node.next;
				count++;

				
			}

		}
	}

	public static String GetAgeGroup(int day) {
		String Group = null;
		switch (day) {
		case 1:
			Group = "55+";
			break;
		case 2:
			Group = "55+";
			break;
		case 3:
			Group = "25+";
			break;
		case 4:
			Group = "25+";
			break;
		case 5:
			Group = "18+";
			break;
		case 6:
			Group = "18+";
			break;
		case 7:
			Group = "For Slot Booking";
			break;
		}
		return Group;

	}

//	public static void ViewPosition(QueueHead queue) {
//		
//	}

}
