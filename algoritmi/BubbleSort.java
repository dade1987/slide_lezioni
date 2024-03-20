package algoritmi;

import java.util.LinkedList;

public class BubbleSort {

	public static void main(String[] args) {
		// Creazione di una LinkedList di interi
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Aggiunta di alcuni elementi disordinati
		linkedList.add(50);
		linkedList.add(20);
		linkedList.add(40);
		linkedList.add(10);
		linkedList.add(30);

		// Stampa la LinkedList prima dell'ordinamento
		System.out.println("LinkedList prima dell'ordinamento: " + linkedList);

		// Bubble Sort
		bubbleSort(linkedList);

		// Stampa la LinkedList dopo l'ordinamento
		System.out.println("LinkedList dopo l'ordinamento: " + linkedList);
	}

	public static void bubbleSort(LinkedList<Integer> list) {
		int n = list.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// Se l'elemento corrente è maggiore del successivo, scambiali
				if (list.get(j) > list.get(j + 1)) {
					// Scambio degli elementi
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}

}
