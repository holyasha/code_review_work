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
        //x^2 + 3 * x - 11, для x = 4, должно получится 16 + 12 - 11 = 17
        int x = 4;
        int first = times(x,x);
        int second = times(3,x);
        int summ = add(first, second);
        int result = dif(summ, 11);
        return result;
    }
}