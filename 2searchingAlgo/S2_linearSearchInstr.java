public class S2_linearSearchInstr {
    public static void main(String[] args) {
        String str = "Nishant";
        char target = 'a';
        System.out.println(linear_search2(str, target));
        System.out.println(linear_search(str, target));
    }


    static boolean linear_search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                System.out.println(i);
                return true;
            }
        }
        return false;
    }


//Using inhancd for loop
        static boolean linear_search2 (String str ,char target ){
            if (str.length() == 0) {
                return false;
            }
            for (char ch : str.toCharArray()) {
                if (ch == target) {
                    return true;
                }
            }
            return false;
        }
}


