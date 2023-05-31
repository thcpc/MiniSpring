package bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String,String> hashMap = new HashMap<>();

    static {
        hashMap.put("1001","xxx");
        hashMap.put("1002","yyy");
        hashMap.put("1003","zzz");
    }

    public String queryUserName(String id){
        return hashMap.get(id);
    }
}
