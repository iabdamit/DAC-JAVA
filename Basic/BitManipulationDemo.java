public class BitManipulationDemo {
    public static void main(String[] args) {

        // ! XOR (^) is a exclusive OR
        // todo : left and right shift
        // int n = 3; //* 2 in binary = 010
        // int x = n << 2; //* left shift
        // System.out.println(x);
        // int y = n >> 1; //* right shift
        // System.out.println(y);

        // todo : Bit Manipulation (Finding 0 and 1 at certain position)
        // int n = 5; // * binary of 5 is 101
        // int pos = 2;
        // int bitMask = 1 << pos; // * bitmask= 100 ( binary of 1 is 001)
        // if ((bitMask & n) == 0) {
        // System.out.println("bit was zero");
        // } else {
        // System.out.println("bit was one");
        // }

        // todo : Set Bit
        // int n = 5; // * 101
        // int pos = 1;
        // int bitMask = 1 << pos; // * 010
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // todo : Clear Bit
        // int n = 5; // * 101
        // int pos = 2;
        // int bitMask = 1 << pos; // * 100
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);
        // * n=5 that is 101 => so we have to clear bit position 2 (postion starts from
        // * 0) creating bitMask 1 left shift position times than do ~bitMask(not of
        // * bitmask) than and of not of bitMask and n

        // todo : Update Bit
        int n = 5; // 101
        int pos = 1;
        int bitMask = 1 << pos;
        int bitAtPos = n & bitMask;
        System.out.println(bitAtPos);
        if (bitAtPos == 0) {
            // !set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // ! clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
