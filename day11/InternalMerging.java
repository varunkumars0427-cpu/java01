package day11;

public class InternalMerging {

    static class Meeting {

        char name;
        String start;
        String end;

        Meeting(char name, String start, String end) {
            this.name = name;
            this.start = start;
            this.end = end;
        }
    }

    // Convert time into minutes for comparison
    static int toMinutes(String time) {

        String[] parts = time.split(":");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        return hour * 60 + minute;
    }

    static void merge(Meeting[] a, int left, int mid, int right) {

        Meeting[] temp = new Meeting[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (toMinutes(a[i].end) <= toMinutes(a[j].end)) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= right) {
            temp[k++] = a[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            a[i] = temp[k];
        }
    }

    static void mergeSort(Meeting[] a, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(a, left, mid);

            mergeSort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }

    public static void main(String[] args) {

        Meeting[] meetings = {

            new Meeting('A', "9:00", "10:00"),

            new Meeting('B', "10:00", "11:00"),

            new Meeting('C', "11:00", "12:00"),

            new Meeting('D', "12:00", "12:30"),

            new Meeting('E', "12:30", "01:00")
        };

        mergeSort(meetings, 0, meetings.length - 1);

        System.out.println("--------------------------------");
        System.out.printf("| %-7s | %-7s | %-7s |%n",
                "Meeting", "Start", "End");
        System.out.println("---------------------------------");

        for (Meeting m : meetings) {

            System.out.printf("| %-7s | %-7s | %-7s |%n",
                    m.name, m.start, m.end);
        }

        System.out.println("----------------------------------");
    }
}