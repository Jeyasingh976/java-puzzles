import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchMinimunLoss {

	static long minimumLoss(long[] price) {
		
		long [] SortedArr=Arrays.copyOf(price, price.length);
		List<Long> priceList=Arrays.stream(price).boxed().collect(Collectors.toList());
		Arrays.sort(SortedArr);
		long minCost=Long.MAX_VALUE;
		for(int i=1;i<price.length;i++) {
			
			
			if(priceList.indexOf(SortedArr[i])<priceList.indexOf(SortedArr[i-1]) && SortedArr[i]-SortedArr[i-1] <minCost ) {
				minCost=SortedArr[i]-SortedArr[i-1];
			}
			
			
			
		}
		return minCost;
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] price = new long[n];
        for(int price_i = 0; price_i < n; price_i++){
            price[price_i] = in.nextLong();
        }
        long result = minimumLoss(price);
        System.out.println(result);
        in.close();
    }

}
