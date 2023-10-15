import java.util.HashMap;
public class ImplementationOfHashMap{
    public static void main(String[] args){
        //Creating a HashMap with a name "map"
        HashMap<Integer,String> map = new HashMap<>();

        //Inserting the values into the hashmap
        map.put(1,"Red");
        map.put(2,"Blue");
        map.put(3,"Green");
        map.put(4,"Yellow");
        map.put(5,"Black");

        System.out.println(map);    //{1=Red, 2=Blue, 3=Green, 4=Yellow, 5=Black}

        //Removing the values using their keys from the hashmap
        map.remove(4);

        System.out.println(map);    //{1=Red, 2=Blue, 3=Green, 4=Yellow, 5=Black}
                                    // {1=Red, 2=Blue, 3=Green, 5=Black}


        //Let's use some other functions in HashMap such as containsKey(), containsValue(), isEmpty() , size()
        System.out.println(map.containsKey(3));                //true
        System.out.println(map.containsValue("Black"));     // true
        System.out.println(map.isEmpty());                       // false
        System.out.println(map.size());                         //4                     

    }
}