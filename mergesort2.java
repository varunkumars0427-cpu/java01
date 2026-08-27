package day_8;

public class mergesort2 {

	    static void mergeSort(String[] a, int l, int r) {

	        if (l >= r) return;

	        int m = (l + r) / 2;

	        mergeSort(a, l, m);
	        mergeSort(a, m + 1, r);

	        String[] temp = new String[r - l + 1];

	        int i = l, j = m + 1, k = 0;

	        while (i <= m && j <= r) {
	            temp[k++] = a[i].compareTo(a[j]) < 0 ? a[i++] : a[j++];
	        }

	        while (i <= m)
	            temp[k++] = a[i++];

	        while (j <= r)
	            temp[k++] = a[j++];

	        for (i = l, k = 0; i <= r; i++)
	            a[i] = temp[k++];
	    }

	    public static void main(String[] args) {

	        String[] a = {
	            "Varun",
	            "Sita",
	            "Ram",
	            "Arjun",
	            "Meera",
	            "Kiran",
	            "Anu",
	            "Rahul",
	            "Priya",
	            "Vijay",
	            "Rohan"
	        };

	        mergeSort(a, 0, a.length - 1);

	        for (String x : a)
	            System.out.print(x + " ");
	    }
	}

