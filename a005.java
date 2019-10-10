import java.util.Scanner;

public class zerojudge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			boolean is_EqRatio = true;
			boolean is_EqDiff = true;
			
			int[] arr = new int[4];
			for(int j = 0; j < 4; j++) {
				arr[j] = scanner.nextInt();
			}
			
			
			int common_ratio = 0, common_diff = 0;
			for(int j = 0; j < 3; j++) {
				//判斷是否等比
				common_ratio = arr[j+1] / arr[j];
				if(arr[j+1] % arr[j] != 0) {
					is_EqRatio = false;
				}
				
				//判斷是否等差
				common_diff = arr[j+1] - arr[j];
				if(arr[j+1] - arr[j] != common_diff) {
					is_EqDiff = false;
				}
			}
			
			
			for(int j: arr) {
				System.out.print(j + " ");
			}
			
			if(is_EqRatio) {
				System.out.print(arr[3] * common_ratio);
			}else if(is_EqDiff) {
				System.out.print(arr[3] + common_diff);
			}else {
				System.out.print("非等比或等差級數");
			}
			
			System.out.println();
		}
	}

}
