package cn.intmain;

import java.util.Scanner;
class Data {
	Data(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	int num1;
	int num2;
}
class Node {
	Data data;
	Node(int num1, int num2) {
		data = new Data(num1, num2);
	}
	Node next = null;
}
class Linklist {
	Node headNode = null;
	Linklist(Node node) {
		this.headNode = node;
		headNode.next = null;
	}
	void push(Node node) {
		Node tmpNode = headNode;
		while (tmpNode.next != null) {
			tmpNode = tmpNode.next;
		}
		tmpNode.next = node;
		node.next = null;
	}
	Node pop() {
		Node tmpNode = this.headNode;
		while (tmpNode.next != null) {
			tmpNode = tmpNode.next;
		}
		return tmpNode;
	}
	void outPut() {
		Node tmpNode = this.headNode;
		while (tmpNode != null) {
			System.out.println(tmpNode.data.num1 + " " + tmpNode.data.num2);
			tmpNode = tmpNode.next;
		}
	}
}

public class Init {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Linklist my = null;
		int num1, num2;
		System.out.println("有多少项呢？");
		int count = s.nextInt();
		int ss = count;
		while (count-- > 0) {
			System.out.println("输入"+(ss-count)+"组数据");
			num1 = s.nextInt();
			num2 = s.nextInt();
			Node head = new Node(num1, num2);
			if (my == null)
				my = new Linklist(head);
			else {
				my.push(head);
			}
		}
		System.out.println("输入完毕");
		Node tmpNode = my.headNode;
		double sum = 0;
		while (tmpNode != null) {
			double a = (double) tmpNode.data.num1;
			double b = (double) tmpNode.data.num2;
			sum = sum + Math.pow(a, b);
			tmpNode = tmpNode.next;
		}
		System.out.println("Sum = " + sum);
		tmpNode = my.headNode;
		while (tmpNode != null) {
			double a = (double) tmpNode.data.num1;
			double b = (double) tmpNode.data.num2;
			System.out.print(a + "^" + b);
			if (tmpNode.next != null) {
				System.out.print("+");
			}
			tmpNode = tmpNode.next;
		}
		s.close();
	}
}
