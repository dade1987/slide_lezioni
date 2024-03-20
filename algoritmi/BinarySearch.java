package algoritmi;

public class BinarySearch {
	// Metodo per la ricerca binaria
	// Restituisce l'indice dell'elemento se presente nell'array, altrimenti
	// restituisce -1
	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Se l'elemento è presente al centro dell'array
			if (array[mid] == target)
				return mid;

			// Se l'elemento è maggiore del valore centrale, cerca nella metà destra
			// dell'array
			if (array[mid] < target)
				left = mid + 1;
			// Altrimenti, cerca nella metà sinistra dell'array
			else
				right = mid - 1;
		}

		// Se l'elemento non è presente nell'array
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		int target = 23;

		int result = binarySearch(array, target);

		if (result != -1)
			System.out.println("Elemento " + target + " trovato all'indice " + result);
		else
			System.out.println("Elemento " + target + " non trovato nell'array.");
	}
}