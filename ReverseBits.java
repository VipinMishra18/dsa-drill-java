// Full reversal of a 32-bit integer's bits.
// 43261596  00000010100101000001111010011100
// 964176192 00111001011110000010100101000000
class ReverseBits {
    static int reverseBits(int n) {
        int ans = 0;
        for (int i = 31; i > -1; i--) {
            ans |= (n & 1) << i;
            n >>>= 1; // unsigned right shift
        }
        return ans;
    }
}
