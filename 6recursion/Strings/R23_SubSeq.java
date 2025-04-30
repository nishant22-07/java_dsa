package Strings;

import java.util.ArrayList;

public class R23_SubSeq {
    public static void main(String[] args) {
        subSeq("","abc");
        System.out.println(list);
    }
//    public static void subSeq(String p,String up){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        subSeq(p+ch,up.substring(1));
//        subSeq(p,up.substring(1));
//    }
    static ArrayList<String> list = new ArrayList<>();
    public static void subSeq(String p,String up){
        if (up.isEmpty()){
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));

    }

}
