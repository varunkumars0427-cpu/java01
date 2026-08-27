package day_8;

public class mergesort {

	    static void mergeSort(int[] a, int l, int r) {
	        if (l >= r) return;

	        int m = (l + r) / 2;

	        mergeSort(a, l, m);
	        mergeSort(a, m + 1, r);

	        int[] temp = new int[r - l + 1];
	        int i = l, j = m + 1, k = 0;

	        while (i <= m && j <= r)
	            temp[k++] = a[i] < a[j] ? a[i++] : a[j++];

	        while (i <= m) temp[k++] = a[i++];
	        while (j <= r) temp[k++] = a[j++];

	        for (i = l, k = 0; i <= r; i++)
	            a[i] = temp[k++];
	    }

	    public static void main(String[] args) {
	        int[] a = {5, 2, 8, 1, 3, 0, 4, 7, 6, 10, 9};

	        mergeSort(a, 0, a.length - 1);

	        for (int x : a)
	            System.out.print(x + " ");
	    }
	}

