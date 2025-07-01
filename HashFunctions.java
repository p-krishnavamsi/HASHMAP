import java.util.*;
public class HashFunctions{
    public static void hashfunctions(){
        //SYNTAX
        Map<String,Integer> mp=new HashMap<>();
        //ADDING ELEMENTS
        mp.put("krish",21);
        mp.put("tiru",20);
        mp.put("jashu",29);
        mp.put("sandy",19);
        //GETTING VALUE OF A KEY FROM THE HASHMAP
        System.out.println(mp.get("krish"));//-->21
        System.out.println(mp.get("harsh"));//-->null becoz no harsh exists
        //CHANGING VALUE OF A KEY IN THE HASHMAP
        mp.put("krish",20);//krish-->20
        System.out.println(mp.get("krish"));
        // CHECKING IF A KEY IS PRESENT IN THE HASHMAP
        System.out.println(mp.containsKey("krish"));//true
        System.out.println(mp.containsKey("kris"));//false
        // REMOVING A PAIR FROM THE HASHMAP
        mp.remove("krish");//-->returns true
        //ADDING A KEY ONLY IF IT DOES NOT EXIST
        if(!mp.containsKey("yashna")) mp.put("yashna",30);
        //or
        mp.putIfAbsent("yash",25);//will get entried
        mp.putIfAbsent("yashna",25);//will not get entried
        // GET ALL KEYS IN THE HASHMAP
            System.out.println(mp.keySet());
        // GET ALL VALUES IN THE HASHMAP
            System.out.println(mp.values());
        // GET ALL ENTRIES IN HASHMAP
            System.out.println(mp.entrySet());
        // TRAVERSING ALL ENTRIES OF HASHMAP
        for(String key:mp.keySet()){
            System.out.printf("AGE of %s is %d\n",key,mp.get(key));
        }
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
     public static void main(String[] args) {
        hashfunctions();
    }
}