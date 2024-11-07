import java.util.ArrayList;

public class SubarraySum {
    static int SumOfSubarray(int [] arr, int start, int stop){
        int count = 0;
        for(int i=start;i<=stop;i++){
            count+=arr[i];
        }
        return count;
    }
    static ArrayList<Integer> subarraySum(int[] arr, int s) {
        ArrayList <Integer> res = new ArrayList<>();
        int arrSize = arr.length;
        int start = 0;
        int end = 0;
        int sum = 0;
        for(int i=0;i<arrSize;i++){
            sum += arr[i];
            if(sum >= s){
                end = i;
                while(sum > s&& start < end){
                    sum -= arr[start++];
                }
            }
            if(sum == s){
                res.add(start+1);
                res.add(end+1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,7,5};
        System.out.println(subarraySum(arr,12));
    }
}
