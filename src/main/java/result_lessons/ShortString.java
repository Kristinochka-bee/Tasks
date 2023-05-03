package result_lessons;

public class ShortString {

    public static void main(String[] args) {
        //Написать алгоритм, который сокращает строку, объединяя повторяющиеся символы в один и ставя рядом с ним число = количеству их повторений.
        //
        //Пример aaabbbcc => a3b3c2
        //
        //Если размер изменённой строки >= размеру изначальной строки , то тогда возвращаем изначальную
        //
        //Пример abc  => abc

        String s = "aaabbbcc";
        String s1 = "aabbbccc";
        System.out.println(compressString(s));
        System.out.println(compressString2(s1));

        //----

    }

    //StringBuilder используется  для построения сокращенной строки
    //char charAt(int index) возвращает значение char по указанному индексу. Индекс колеблется от 0 до length()-1

    public static String compressString(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char prevChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == prevChar) {
                count++;
            } else {
                compressed.append(prevChar);
                compressed.append(count);
                prevChar = currChar;
                count = 1;
            }
        }
        compressed.append(prevChar);
        compressed.append(count);

        if (compressed.length() >= s.length()) {
            return s;
        } else {
            return compressed.toString();
        }
    }


    public static String compressString2(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        char prevChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);
            count++;
            if (currChar != prevChar) {
                compressed.append(prevChar);
                compressed.append(count);
                prevChar = currChar;
                count = 1;
            }
        }
        compressed.append(prevChar);
        compressed.append(count);

        if (compressed.length() >= s.length()) {
            return s;
        } else {
            return compressed.toString();
        }
    }



}

