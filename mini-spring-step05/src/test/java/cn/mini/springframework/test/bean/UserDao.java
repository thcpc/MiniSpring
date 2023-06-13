package cn.mini.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String,String> hashMap = new HashMap<>();

    static {
        hashMap.put("1001","cpc");
        hashMap.put("1002","lxy");
        hashMap.put("1003","cjen");
    }

    public String queryUserName(String uid){
        return hashMap.get(uid);
    }


}
