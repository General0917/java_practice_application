public class list3 {
    public static void main(String[] args) {
        String s1 = "Java programming";
        System.out.println("s1に含まれている1文字目は" + s1.charAt(1));
        System.out.println("文字列s1の3文字目以降は" + s1.substring(3));
        System.out.println("文字列21の3~8文字目は" + s1.substring(3, 8));
    }
}