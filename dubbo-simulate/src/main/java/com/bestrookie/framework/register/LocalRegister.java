package com.bestrookie.framework.register;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 13:36
 */
public class LocalRegister {
    private static Map<String,Class> map = new HashMap<>();

    public static void regist(String interfaceName,Class implClass){
        map.put(interfaceName,implClass);
    }

    public static Class get(String interfaceName){
        return map.get(interfaceName);
    }

}
