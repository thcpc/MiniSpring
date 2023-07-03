package bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1001","CPC");
        hashMap.put("1001","CJEN");
        hashMap.put("1001","LXY");
    }

    public String queryUserName(String uId){
        return hashMap.get(uId);
    }
}
