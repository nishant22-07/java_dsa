public class S20_revision {
    public static boolean isTargetPresent( String word ,char target){
        if(word.length()==0){
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
           if(word.charAt(i)==target){
               System.out.println(i);
               return true;
           }

        }
        return false;

    }
    public static void main(String[] args) {
        String word = "Nishant";

        char target = 'a';
        System.out.println(isTargetPresent(word,target));


    }
}
