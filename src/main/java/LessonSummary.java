import java.util.*;
import java.util.stream.Collectors;

public class LessonSummary {
    public static void main(String[] args) {
        //1
        List<String> strings = Arrays.asList("foo", "bar", "baz", "foo", "qux", "bar");
        int uniqueStringsCount = UniqueStringsCounter.countUniqueStrings(strings);
        System.out.println("1There are " + uniqueStringsCount + " unique strings in the list.");

        //2
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 3, 5, 6, 7, 5, 3);
        int mostFrequentNumber = MostFrequentNumber.getMostFrequentNumber(numbers);
        System.out.println("2The most frequent number in the list is: " + mostFrequentNumber);

        //3
        List<String> strings3 = Arrays.asList("foo", "bar", "baz", "foo", "qux", "bar");
        List<String> uniqueStrings = UniqueStrings.removeDuplicates(strings3);
        System.out.println("3The list with duplicates removed: " + uniqueStrings);

        //4
        //List<MyObject> objects = Arrays.asList(new MyObject(4), new MyObject(1), new MyObject(3), new MyObject(2));
        //List<MyObject> sortedObjects = SortedObjects.sortByValue(objects);
        //System.out.println("The sorted list of objects: " + sortedObjects);

        //5
        List<String> strings5 = Arrays.asList("aaa", "bb", "cccc", "d");
        List<String> sortedStrings = SortedStrings.sortByLengthDescending(strings5);
        System.out.println("5The sorted list of strings: " + sortedStrings);

        // 6
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> oddNumbers = OddNumbers.getSortedOddNumbers(numbers1);
        System.out.println("6The sorted list of odd numbers: " + oddNumbers);

        // 7
        List<String> strings6 = Arrays.asList("Apple", "banana", "Abacus", "Aardvark", "cat");
        List<String> aStrings = StringsStartingWithA.getStringsStartingWithA(strings6);
        System.out.println("7Strings starting with 'A': " + aStrings);

        //8
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> commonIntegers = CommonIntegers.getCommonIntegers(list1, list2);
        System.out.println("8Common integers: " + commonIntegers);

        // 9
        List<String> list = Arrays.asList("hello", "world", "java");
        List<String> repeatedStrings = RepeatStrings.repeatStrings(list);
        System.out.println("9Repeated strings: " + repeatedStrings);

        //10
        List<String> input = Arrays.asList("hello", "world", "java");
        List<String> result = ReverseStrings.reverse(input);
        System.out.println("10" + result);


    }

    //1- Напишите метод, который принимает на вход список строк и возвращает количество уникальных строк в списке.
    public class UniqueStringsCounter {
        public static int countUniqueStrings(List<String> strings) {
            Set<String> uniqueStrings = new HashSet<>(strings);
            return uniqueStrings.size();
        }
}

    // 2 Напишите метод, который принимает на вход список целых чисел и возвращает наиболее часто встречающееся число в списке.
    public class MostFrequentNumber {
        public static int getMostFrequentNumber(List<Integer> numbers) {
            // Создаем словарь, где ключ - число из списка, а значение - количество его повторений
            Map<Integer, Long> frequencyMap = numbers.stream()
                    .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

            // Находим максимальное значение частоты и возвращаем соответствующий ему ключ
            return Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        }
    }
    //------
    public static int findMostFrequent(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Map.Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        return maxEntry.getKey();
    }
    //----

    public static int findMostFrequent1(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int mostFrequent = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequent;
    }

    //3 Напишите метод, который принимает на вход список строк и возвращает новый список строк,
    // в котором удалены все повторяющиеся элементы.

    public class UniqueStrings {
        public static List<String> removeDuplicates(List<String> strings) {
            Set<String> uniqueStrings = new HashSet<>(strings); // создаем множество из списка, чтобы удалить дубликаты
            return new ArrayList<>(uniqueStrings); // создаем новый список из множества уникальных строк
        }
    }
    //--
    public static List<String> removeDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    // 4 Напишите метод, который принимает на вход список объектов и возвращает новый список объектов,
    // отсортированный в порядке возрастания значений поля "value".
    public class SortedObjects {
        public static List<MyObject> sortByValue(List<MyObject> objects) {
            return objects.stream()
                    .sorted(Comparator.comparing(MyObject::getValue))
                    .collect(Collectors.toList());
        }
    }

    class MyObject {
        private int value;

        public MyObject(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyObject{" +
                    "value=" + value +
                    '}';
        }
    }

    // 5 Напишите метод, который принимает на вход список строк и возвращает новый список строк,
    // отсортированный в порядке убывания длины строк.
    public class SortedStrings {
        public static List<String> sortByLengthDescending(List<String> strings) {
            Collections.sort(strings, Comparator.comparingInt(String::length).reversed());
            return strings;
        }
    }

    //6 Напишите метод, который принимает на вход список целых чисел и возвращает новый список,
    // содержащий только нечетные числа из исходного списка, отсортированные в порядке возрастания.
    public class OddNumbers {
        public static List<Integer> getSortedOddNumbers(List<Integer> numbers) {
            List<Integer> oddNumbers = new ArrayList<>();
            for (int number : numbers) {
                if (number % 2 != 0) {
                    oddNumbers.add(number);
                }
            }
            Collections.sort(oddNumbers);
            return oddNumbers;
        }
    }

    //7 Напишите метод, который принимает на вход список строк и возвращает новый список строк,
    // содержащий только те строки, которые начинаются на букву "A" или "a".

    public class StringsStartingWithA {
        public static List<String> getStringsStartingWithA(List<String> strings) {
            List<String> result = new ArrayList<>();
            for (String str : strings) {
                if (str.startsWith("A") || str.startsWith("a")) {
                    result.add(str);
                }
            }
            return result;
        }
    }

    //8 Напишите метод, который принимает на вход два списка целых чисел и возвращает новый список,
    // содержащий только те числа, которые есть и в первом списке, и во втором списке.
    public class CommonIntegers {
        public static List<Integer> getCommonIntegers(List<Integer> list1, List<Integer> list2) {
            List<Integer> result = new ArrayList<>();
            for (Integer num : list1) {
                if (list2.contains(num)) {
                    result.add(num);
                }
            }
            return result;
        }
    }

    //9 Напишите метод, который принимает на вход список строк и возвращает новый список строк,
    // в котором каждая строка повторяется столько раз, сколько символов в ней содержится.
    public class RepeatStrings {
        public static List<String> repeatStrings(List<String> list) {
            List<String> result = new ArrayList<>();
            for (String str : list) {
                for (int i = 0; i < str.length(); i++) {
                    result.add(str);
                }
            }
            return result;
        }
    }

    // 10 Напишите метод, который принимает на вход список строк и возвращает новый список строк,
    // в котором каждая строка записана задом наперед.
    public class ReverseStrings {
        public static List<String> reverse(List<String> input) {
            List<String> result = new ArrayList<>();

            for (String str : input) {
                StringBuilder builder = new StringBuilder(str);
                builder.reverse();
                result.add(builder.toString());
            }

            return result;
        }
    }
    }





