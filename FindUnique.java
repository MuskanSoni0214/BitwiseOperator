public class FindUnique {
    public static void main(String[] args) {
        int arr[]={6,4,25,6,4,25,7};
        int unique=0;
        for(int i: arr)
            unique^=i;
        System.out.println(unique);
    }
}
