package ExceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args){
        MultiCatch cat=new MultiCatch();
        cat.divide();
    }

}
class MultiCatch{
    int a=4;
    int b=0;
    int divide(){
        try{
            return a/b;
        }catch(ArithmeticException e){
           System.out.println(e.getMessage());
        } catch (RuntimeException e) {
           System.out.println(e.getMessage());
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
        return -1;
    }
}

