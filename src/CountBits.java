public class CountBits{
    // method 1
    static int countBits(int n) {
        int count = 0;
        while( n > 0) {
            count += n & 1;
            n >>=1;
        }

 return count;

    }
    // method 2:
    static int countSetBits(int n) {
        int count = 0;
        while( n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
      int i =9;
        System.out.println(countBits(i));
    }
}
