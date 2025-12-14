public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b != 0) {
            return a / b;
        }
        return 0;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        int x = dif(10, 5);
        int y = add(20, 5);
        int z = times(x, y);
        int solve = add(x, z);
        return solve;
    }
}