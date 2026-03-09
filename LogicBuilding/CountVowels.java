package LogicBuilding;
//Count Vowels
public class CountVowels {
    public static void main(String[] args) {
        String str = "sumitkumarsingh";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(i);
            char ch =str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||ch =='o'||ch=='u') {
                //System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}