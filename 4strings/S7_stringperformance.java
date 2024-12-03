// this method is not good because while adding new element new object is created everytime
// due to this time complexity increases
public class S7_stringperformance {
    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series+= ch;
        }
        System.out.println(series);
    }
}
