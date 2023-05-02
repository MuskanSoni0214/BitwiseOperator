public class NoOfDigits {
    public static void main(String[] args) {
        int n=453;
        int base=10;// it also will be binary number of base 2
        int ans=(int)((Math.log(n)/Math.log(base))+1);
        System.out.println(ans);
    }
}
