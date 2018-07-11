import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Pairs {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pairs(k, arr);
        System.out.println(result);
        in.close();
    }

	private static int pairs(int k, int[] arr) {

		List<Integer> arrList=Arrays.stream(arr).boxed().collect(Collectors.toList());
		int count=0;
		for(int i=0;i<arrList.size();i++)
		{
			
			int val=arrList.get(i);
			int comapreVal=val+k;
			
			if(arrList.contains(comapreVal)) {
				count++;
			}
			
		}
		return count;
	}
}
