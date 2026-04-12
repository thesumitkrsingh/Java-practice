package String;

public class ExctractDigit {
    public static void main(String[] args){
        String str="abc34sumit";
        for(int i=0;i<str.length();i++){
            char result=str.charAt(i);
            if(Character.isDigit(result)){
                System.out.println(result);
            }

        }


    }
    
}
