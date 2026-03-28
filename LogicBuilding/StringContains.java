package LogicBuilding;

public class StringContains {
    public static void main(String[] args){
        String mainString="this is your best time";
        String subString="your";

        for(int i=0;i< mainString.length();i++){
            int j=0;
            while(j<subString.length()&&mainString.charAt(i+j)==subString.charAt(j)){
                j++;

            }
            if(j==subString.length()){
                System.out.println(i);

            }

        }
       // System.out.println(subString);
    }
}
