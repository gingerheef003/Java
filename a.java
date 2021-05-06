public class a{
    public void fun(int x){
        if(x>0){
            fun(--x);
            System.out.print(x+" ");
            fun(--x);
        }
    }
}