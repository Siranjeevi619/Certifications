import java.util.ArrayList;

public class SubarraySum {
    static int SumOfSubarray(int [] arr, int start, int stop){
        int count = 0;
        for(int i=start;i<=stop;i++){
            count+=arr[i];
        }
        return count;
    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int arrSize = arr.length;
        for(int i=0;i<arrSize;i++){
            for(int j=i;j<arrSize;j++){
                int ans = SumOfSubarray(arr,i,j);
                if(ans == target){
                    System.out.println(i+" "+arr[i]);
                    System.out.println(j+" "+arr[j]);
                    res.add(i);
                    res.add(j);
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,7,5};
        System.out.println(subarraySum(arr,12));
    }
}
