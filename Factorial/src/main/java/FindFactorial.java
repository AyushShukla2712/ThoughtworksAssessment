public class FindFactorial {
    private final int number;

    public FindFactorial(int number) {

        this.number = number;
    }

    public static long Calculate(int n) {
        if(n<0){
            return -1;
        }

        else if(n==0 || n==1){
            return 1;
        }
        else{
            long result=1;
            for (int i = 2; i <=n; i++) {
                result*=i;
            }
            return result;
        }
    }
}
