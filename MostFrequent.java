import java.util.*;
public class MostFrequent{
    public static int Frequent(int[] arr){
        Map<Integer,Integer> freq=new HashMap<>();
        for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el,freq.get(el)+1);
            }
        }
        int max=0;
        int ans=-1;
        for(var e: freq.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                ans=e.getKey();
            }
        }return ans;

    }
    public static void main(String[] args){
        int [] arr={1,2,3,4,1,2,3,1,2,1,1,2,4};
        System.out.println(Frequent(arr));
    }
}