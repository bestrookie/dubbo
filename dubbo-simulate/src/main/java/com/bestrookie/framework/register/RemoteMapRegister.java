package com.bestrookie.framework.register;

import com.bestrookie.framework.URL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 20:51
 */
public class RemoteMapRegister {
    private static Map<String, List<URL>> REGISTER = new HashMap<>();

    public static void regist(String interfaceName, URL url) throws Exception {
        List<URL> list = REGISTER.get(interfaceName);
        if (list == null){
            list = new ArrayList<URL>();
        }
        list.add(url);
        REGISTER.put(interfaceName, list);

        saveFile();
    }

    public static List<URL> get(String interfaceName) throws Exception {
        REGISTER = getFile();
        return REGISTER.get(interfaceName);
    }

    private static void saveFile() throws Exception{
            FileOutputStream fileOutputStream = new FileOutputStream("/temp.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(REGISTER);
    }

    private static Map<String,List<URL>> getFile() throws Exception{
        FileInputStream fileInputStream = new FileInputStream("/temp.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Map<String,List<URL>> o = (Map<String, List<URL>>) objectInputStream.readObject();
        return o;

    }
}
