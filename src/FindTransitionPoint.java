public class FindTransitionPoint {
   static int transitionPoint(int arr[]) {
        int arrSize = arr.length;
        if(arrSize == 1){
            return arr[0] == 1 ? 0 : -1;
        }
        // boolean flag = false;
        int foundIndex = -1;
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0;i<arrSize;i++)
        {
            if(arr[i] == 0){
                zeroCount +=1;
            }
            else{
                oneCount+= 1;
            }
        }
        if(zeroCount == arrSize){
            return -1;
        }
        if(oneCount == arrSize){
            return 0;
        }
        for(int i=1;i<arrSize;i++){
            if(arr[i] == 1 && arr[i-1] == 0){
                foundIndex = i;
            }
        }
        return foundIndex;

    }

    public static void main(String[] args) {
        int []arr = {0};
        System.out.println(transitionPoint(arr));
    }
}
