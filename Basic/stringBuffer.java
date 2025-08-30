public class stringBuffer {
    public static void main(String[] args) {
        // String str2 = new String("abd");
        // String str1 = new String("abd");
        // System.out.println(str1 == str2);

        StringBuffer sb = new StringBuffer(); // ! it is thread safe but string builder not
        System.out.println(sb.capacity());
        sb.append("abdefghijklmnam");
        System.out.println("length of string " + sb.length());
        System.out.println(sb.capacity());// ! capacity is current capacity how much characters holds if size and
                                          // ! capacity becomes equal then string buffer doubles its capacity
        sb.append("cs");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.deleteCharAt(3));
    }
}
