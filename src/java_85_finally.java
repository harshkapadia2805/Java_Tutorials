public class java_85_finally {
    public static int greet(){
        try {
            int a=50;
            int b=0;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("End function");
        }
        return -1;
    }
    public static void main(String[] args) {
        //int a = greet();
        //System.out.println(a);
        int a=7;
        int b=9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finnaly for value of b = "+ b);
            }
            b--;
        }
    }
}
