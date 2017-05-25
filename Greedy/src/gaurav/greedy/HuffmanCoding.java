package gaurav.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanCoding {

	public static void main(String[] args) {

		Comparator<TextPart> comparator = new Comparator<TextPart>() {

			@Override
			public int compare(TextPart o1, TextPart o2) {
				if (o1.freq > o2.freq) {

					return 1;

				}

				if (o1.freq < o2.freq) {
					return -1;

				}

				return 0;
			}
		};
		PriorityQueue<TextPart> pq = new PriorityQueue<>(comparator);
		TextPart part1 = new TextPart("f", 5);
		TextPart part2 = new TextPart("e", 9);
		TextPart part3 = new TextPart("c", 12);
		TextPart part4 = new TextPart("b", 13);
		TextPart part5 = new TextPart("d", 16);
		TextPart part6 = new TextPart("a", 45);

		pq.add(part1);
		pq.add(part2);
		pq.add(part3);
		pq.add(part4);
		pq.add(part5);
		pq.add(part6);

		for (TextPart part : pq) {
			System.out.println(part.part + " " + part.freq);
		}
		System.out.println("END\n");
		int n = pq.size();
		for (int i = 0; i < n - 1; i++) {
			TextPart newNode = new TextPart("", 0);
			newNode.left = pq.poll();
			newNode.right = pq.poll();
			newNode.freq = newNode.left.freq + newNode.right.freq;
			pq.add(newNode);

		}

		printTree(pq.peek());

	}

	static void printTree(TextPart textPart) {
		if (textPart != null) {
			System.out.println(textPart.part + " " + textPart.freq);
			printTree(textPart.left);
			printTree(textPart.right);
		}

	}

}

class TextPart {
	String part;
	int freq;
	TextPart left = null;
	TextPart right = null;

	public TextPart(String partVal, int freqVal) {
		part = partVal;
		freq = freqVal;
	}

}
