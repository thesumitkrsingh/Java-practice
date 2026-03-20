package ExceptionHandling;

public class UsingThrows {
    public static void main(String[] args) {
        try{
            level3();
        }catch(Exception e){
            System.out.println("Get Exception Massage"+e.getMessage());

        }
    }
        static void level3() throws Exception{
            level2();
        }
        static void level2() throws Exception{
           level1();
        }
       static void level1() throws Exception{
            throw new Exception("Idhar Exception handle hor raha hai ");
        }
    }

