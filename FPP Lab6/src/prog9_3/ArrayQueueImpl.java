package prog9_3;

import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return this.size;
	}
	public void enqueue(int value) {
		if(front < 0) front = 0;
		if(arr.length == rear) resize();
		arr[rear++] = value;
		size++;
	}
	public int peek() {
		return arr[front];
	}
	public int dequeue() {
		int temp = peek();
		front++;
		return temp;
	}
	
	private void resize() {
		int size = arr.length *2;
		int[] newArray = new int[size];
		System.arraycopy(newArray, 0, arr, 0, arr.length);
		arr = newArray;
		arr = Arrays.copyOfRange(newArray, 0, size);
	}
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
//		uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
		
	}
}

