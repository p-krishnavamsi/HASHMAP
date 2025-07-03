import java.util.*;
public class MajorityElementnby3{
    public static int majorityelement(int[] nums){
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }}
            //int max=0;
            int ans=-1;
            for(var e: mp.entrySet()){
            if(e.getValue()>(n/3)){
                //max=e.getValue();
                ans=e.getKey();
            }
        }return ans;
        
    }
    public static void main(String[] args){
        int[] arr={1,2,1};
        System.out.println(majorityelement(arr));
    }
}