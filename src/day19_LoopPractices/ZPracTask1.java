package day19;

public class ZPracTask1 {
    public static void main(String[] args) {

        String str = "aabbbbbbbbbbccccccccccccsssssssddddddddeeeeeeeeeeeee";

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);

//                System.out.println(each);

                if (ch == each) {
                    count++;
                }
            }

            if(result.contains(""+ch)){

                continue;
            }

            result +="\n" + ch;
            result += count;
        }
        System.out.println(result);
    }
}
