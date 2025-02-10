package Strings;

public class R22_SkipString {
    public static void main(String[] args) {
        System.out.println(skipapple("banana,app,apple,chikoo,strawberry"));
        System.out.println(skipappNotapple("banana,app,apple,chikoo,strawberry,app"));
    }


    static String skipapple(String up){
        if(up.isEmpty()){

            return " ";
        }


        if (up.startsWith(",apple")){
            return skipapple(up.substring(6));

        }else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }

    static String skipappNotapple(String up){
        if(up.isEmpty()){

            return " ";
        }


        if (up.startsWith(",app") && !up.startsWith(",apple") ){
            return skipappNotapple(up.substring(4));

        }else {
            return up.charAt(0) + skipappNotapple(up.substring(1));
        }
    }
}
