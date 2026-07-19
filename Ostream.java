// Ostream — Java has no operator<< overloading; the equivalent is a formatting helper.
// Formats an int[] as {a,b,c} (mirrors the C++ operator<< for vector<int>).
class Ostream {
    static String format(int[] v) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < v.length; i++) {
            sb.append(v[i]);
            if (i < v.length - 1) sb.append(',');
        }
        sb.append('}');
        return sb.toString();
    }
}
