package day06;

public class stud_marks {
	public static void main(String[] args) {
		int[] marks= {85,70,30,40,50};
		int target= 80;
		int left=0;
		int right= marks.length-1;
		while(left<right) {
			int sum = marks[left] + marks[right];
			if(sum==target) {
				System.out.println("Numbers found:"+marks[left]+ "and" +marks[right]);
				break;
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
	}
		
	}

