package selectionSort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] RandomNum = new int[500000];
		int i, j;
		
		
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		for (i = 0; i < RandomNum.length; i++) {
			RandomNum[i] = random.nextInt(1000000)+1;
			for(j=0; j < i; j++) {
				if(RandomNum[i] == RandomNum[j])
					i--;
			}
		}
		for (i = 0; i < RandomNum.length; i++) {
			System.out.print("[" + RandomNum[i] + "] ");
		}
		long start = System.currentTimeMillis();
		selection_sort(RandomNum);
		long endTime = System.currentTimeMillis();
		System.out.println("\n선택정렬 끝. 수행시간 : " + (endTime - start) / 1000.0f + "초");
	}


	public static void selection_sort(int arg []) {
		for(int i = 0; i < arg.length-1; i ++) {
			int temp = i;
			for(int j= i + 1; j< arg.length; j++) {
				if(arg[j] < arg[temp])
					temp = j;
			}
				swap(arg ,i,temp);
		}
		System.out.print("\n=====선택 정렬된 번호=====\n");
		for (int w = 0; w < arg.length; w++) {
			System.out.print("[" + arg[w] + "] ");
		}
	}
	private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
	}
}

