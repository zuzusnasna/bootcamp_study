package chap12._02_collection._03_hashset1;

import java.util.HashSet; //중복을 허용하지 않음

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("asd"));
        hashSet.add(new String("zxc"));
        hashSet.add(new String("qwe"));
        hashSet.add(new String("rty"));
        hashSet.add(new String("asd"));

        System.out.println(hashSet);
    }
}
