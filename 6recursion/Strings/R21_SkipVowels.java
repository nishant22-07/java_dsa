package Strings;

public class R21_SkipVowels {
    public static void main(String[] args) {
        skip(" " ,"NishantKudale");

    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            skip(p+'_',up.substring(1));

        }else {
            skip(p+ch,up.substring(1));
        }
    }
}
