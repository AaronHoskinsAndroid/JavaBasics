package examples.aaronhoskins.com.javabasics;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {


    public static HashMap<String, String> demoHashMap() {
        HashMap<String,String> returnMap = new HashMap<>();
        returnMap.put("name", "Aaron");
        returnMap.put("tech", "Android");
        returnMap.put("position", "SME");
        return returnMap;
    }

    public static ArrayList<String> demoArrayList() {
        ArrayList<String> returnList = new ArrayList<>();
        returnList.add("String 1");
        returnList.add("String 2");
        returnList.add("String 3");
        returnList.add("String 4");
        returnList.add("String 5");
        return returnList;
    }
}
