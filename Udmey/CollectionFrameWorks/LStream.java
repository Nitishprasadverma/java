package CollectionFrameWorks;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LStream {
    public static void main(String[] args) {
        
        // Diff ways to create a stream


       // =====================================================
        // PART 1: CREATING STREAMS
        // =====================================================

        // 1. From Collection
        // stream() creates a sequential stream from a collection.
        System.out.println("1. Stream from Collection:");

        List<Integer> salaryList =
                Arrays.asList(3000, 4100, 9000, 3500);

        salaryList.stream().forEach(System.out::println);
        // Output: 3000, 4100, 9000, 3500


        // 2. From Array
        // Arrays.stream() converts an array into a stream.
        System.out.println("\n2. Stream from Array:");

        Integer[] salaryArray = {3000, 4100, 9000, 3500};

        Arrays.stream(salaryArray).forEach(System.out::println);
        // Output: 3000, 4100, 9000, 3500


        // 3. From Static Method
        // Stream.of() creates a stream from the supplied values.
        System.out.println("\n3. Stream.of():");

        Stream.of(1000, 2300, 4343, 9000)
                .forEach(System.out::println);
        // Output: 1000, 2300, 4343, 9000


        // 4. From Stream Builder
        // Builder allows elements to be added before build().
        System.out.println("\n4. Stream Builder:");

        Stream.Builder<Integer> streamBuilder = Stream.builder();

        streamBuilder.add(1000)
                .add(4589)
                .add(9000)
                .add(4543);

        streamBuilder.build().forEach(System.out::println);
        // Output: 1000, 4589, 9000, 4543


        // 5. From Stream.iterate()
        // Generates elements repeatedly using the given function.
        // limit(5) restricts the stream to five elements.
        System.out.println("\n5. Stream.iterate():");

        Stream.iterate(1000, (Integer n) -> n + 5000)
                .limit(5)
                .forEach(System.out::println);
        // Output: 1000, 6000, 11000, 16000, 21000


        // =====================================================
        // PART 2: INTERMEDIATE OPERATIONS
        // Intermediate operations transform or filter a stream.
        // They are lazy and return another stream.
        // =====================================================

        // 1. filter(Predicate<T>)
        // Keeps only the elements that satisfy the condition.
        System.out.println("\n1. filter():");

        List<String> names = Arrays.asList(
                "Hello", "Everyone", "How", "Are", "You", "Doing"
        );

        List<String> filteredNames = names.stream()
                .filter((String name) -> name.length() <= 3)
                .collect(Collectors.toList());

        System.out.println(filteredNames);
        // Output: [How, Are, You]


        // 2. map(Function<T, R>)
        // Transforms each element into another value.
        System.out.println("\n2. map():");

        List<String> namesForMapping = Arrays.asList(
                "Hello", "Everybody", "How", "Are", "You"
        );

        List<String> lowercaseNames = namesForMapping.stream()
                .map((String name) -> name.toLowerCase())
                .collect(Collectors.toList());

        System.out.println(lowercaseNames);
        // Output: [hello, everybody, how, are, you]


        // 3. flatMap(Function<T, Stream<R>>)
        // Converts nested streams into one flattened stream.
        System.out.println("\n3. flatMap():");

        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I", "Love", "Java"),
                Arrays.asList("Concepts", "Are", "Clean"),
                Arrays.asList("ITS", "Very", "Easy")
        );

        List<String> flattenedWords = sentenceList.stream()
                .flatMap((List<String> sentence) -> sentence.stream())
                .collect(Collectors.toList());

        System.out.println(flattenedWords);
        // Output: [I, Love, Java, Concepts, Are, Clean, ITS, Very, Easy]


        // flatMap() with map() to convert words to lowercase.
        List<String> lowercaseWords = sentenceList.stream()
                .flatMap((List<String> sentence) ->
                        sentence.stream()
                                .map((String value) -> value.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println(lowercaseWords);
        // Output: [i, love, java, concepts, are, clean, its, very, easy]


        // 4. distinct()
        // Removes duplicate elements while preserving encounter order
        // for an ordered stream.
        System.out.println("\n4. distinct():");

        Integer[] arr = {1, 5, 2, 7, 4, 4, 2, 0, 9};

        Arrays.stream(arr)
                .distinct()
                .forEach(System.out::println);
        // Output: 1, 5, 2, 7, 4, 0, 9


        // 5. sorted()
        // Sorts elements according to their natural order.
        System.out.println("\n5. sorted() - Ascending:");

        Integer[] arrAscending = {1, 5, 2, 7, 4, 4, 2, 0, 9};

        Arrays.stream(arrAscending)
                .sorted()
                .forEach(System.out::println);
        // Output: 0, 1, 2, 2, 4, 4, 5, 7, 9


        // sorted(Comparator<T>)
        // A custom comparator can sort elements in descending order.
        System.out.println("\n6. sorted() - Descending:");

        Integer[] arrDescending = {1, 5, 2, 7, 4, 4, 2, 0, 9};

        Arrays.stream(arrDescending)
                .sorted((Integer val1, Integer val2) ->
                        Integer.compare(val2, val1))
                .forEach(System.out::println);
        // Output: 9, 7, 5, 4, 4, 2, 2, 1, 0


        // 7. peek(Consumer<T>)
        // Performs an action on elements as they pass through the stream.
        // Primarily useful for debugging.
        System.out.println("\n7. peek():");

        List<Integer> numbersForPeek = Arrays.asList(2, 1, 3, 4, 6);

        List<Integer> peekResult = numbersForPeek.stream()
                .filter((Integer val) -> val > 2)
                .peek((Integer val) -> System.out.println("Before map: " + val))
                .map((Integer val) -> -1 * val)
                .collect(Collectors.toList());

        System.out.println("Result: " + peekResult);
        // peek prints: 3, 4, 6
        // Output: Result: [-3, -4, -6]


        // 8. limit(long maxSize)
        // Keeps at most the first maxSize elements.
        System.out.println("\n8. limit():");

        List<Integer> numbersForLimit = Arrays.asList(2, 1, 3, 4, 6);

        List<Integer> limitedNumbers = numbersForLimit.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(limitedNumbers);
        // Output: [2, 1, 3]


        // 9. skip(long n)
        // Skips the first n elements and processes the remaining elements.
        System.out.println("\n9. skip():");

        List<Integer> numbersForSkip = Arrays.asList(2, 1, 3, 4, 6);

        List<Integer> skippedNumbers = numbersForSkip.stream()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println(skippedNumbers);
        // Output: [4, 6]


        // 10. mapToInt(ToIntFunction<T>)
        // Converts a Stream<T> into an IntStream of primitive ints.
        System.out.println("\n10. mapToInt():");

        List<String> stringNumbers = Arrays.asList("2", "1", "4", "7");

        int[] numberArray = stringNumbers.stream()
                .mapToInt((String val) -> Integer.parseInt(val))
                .toArray();

        System.out.println(Arrays.toString(numberArray));
        // Output: [2, 1, 4, 7]


        // Filtering an IntStream and converting it to an array.
        // Each pipeline is consumed only once.
        int[] originalNumbers = {2, 1, 4, 7};

        int[] filteredArray = Arrays.stream(originalNumbers)
                .filter((int val) -> val > 2)
                .toArray();

        System.out.println(Arrays.toString(filteredArray));
        // Output: [4, 7]


        // =====================================================
        // PART 3: TERMINAL OPERATIONS
        // Terminal operations produce a result or side effect.
        // They consume the stream and end that pipeline.
        // A consumed stream cannot be reused.
        // =====================================================

        List<Integer> numbers = Arrays.asList(2, 1, 4, 7, 10);


        // 1. forEach(Consumer<T>)
        // Performs an action for each element; returns no result.
        System.out.println("\n1. forEach():");

        numbers.stream()
                .filter((Integer val) -> val >= 3)
                .forEach((Integer val) -> System.out.println(val));
        // Output: 4, 7, 10


        // 2. toArray()
        // Collects stream elements into an array.
        System.out.println("\n2. toArray():");

        Object[] filteredArrayObjects = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .toArray();

        System.out.println(Arrays.toString(filteredArrayObjects));
        // Output: [4, 7, 10]

        // Typed array using an array generator.
        Integer[] filteredIntegerArray = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .toArray((int size) -> new Integer[size]);

        System.out.println(Arrays.toString(filteredIntegerArray));
        // Output: [4, 7, 10]


        // 3. reduce(BinaryOperator<T>)
        // Combines elements into one result using an accumulator.
        // Without an identity value, reduce() returns an Optional.
        System.out.println("\n3. reduce():");

        Optional<Integer> reducedValue = numbers.stream()
                .reduce((Integer val1, Integer val2) -> val1 + val2);

        System.out.println(reducedValue.get());
        // Output: 24


        // 4. collect(Collector<T, A, R>)
        // Accumulates stream elements into a collection or another result.
        System.out.println("\n4. collect():");

        List<Integer> collectedNumbers = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .collect(Collectors.toList());

        System.out.println(collectedNumbers);
        // Output: [4, 7, 10]


        // 5. min(Comparator<T>)
        // Returns the minimum element according to the comparator.
        System.out.println("\n5. min():");

        Optional<Integer> minimumAscending = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .min((Integer val1, Integer val2) ->
                        Integer.compare(val1, val2));

        System.out.println(minimumAscending.get());
        // Output: 4

        // Reversed comparator: the minimum according to this comparator
        // is the numerically largest value.
        Optional<Integer> minimumReversed = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .min((Integer val1, Integer val2) ->
                        Integer.compare(val2, val1));

        System.out.println(minimumReversed.get());
        // Output: 10


        // 6. max(Comparator<T>)
        // Returns the maximum element according to the comparator.
        System.out.println("\n6. max():");

        Optional<Integer> maximumAscending = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .max((Integer val1, Integer val2) ->
                        Integer.compare(val1, val2));

        System.out.println(maximumAscending.get());
        // Output: 10

        // Reversed comparator: the maximum according to this comparator
        // is the numerically smallest value.
        Optional<Integer> maximumReversed = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .max((Integer val1, Integer val2) ->
                        Integer.compare(val2, val1));

        System.out.println(maximumReversed.get());
        // Output: 4


        // 7. count()
        // Returns the number of elements remaining after intermediate operations.
        System.out.println("\n7. count():");

        long numberOfValues = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .count();

        System.out.println(numberOfValues);
        // Output: 3


        // 8. anyMatch(Predicate<T>)
        // Returns true if at least one element satisfies the condition.
        System.out.println("\n8. anyMatch():");

        boolean hasValueGreaterThanThree = numbers.stream()
                .anyMatch((Integer val) -> val > 3);

        System.out.println(hasValueGreaterThanThree);
        // Output: true


        // 9. allMatch(Predicate<T>)
        // Returns true only if every element satisfies the condition.
        System.out.println("\n9. allMatch():");

        boolean allValuesPositive = numbers.stream()
                .allMatch((Integer val) -> val > 0);

        System.out.println(allValuesPositive);
        // Output: true

        boolean allValuesGreaterThanThree = numbers.stream()
                .allMatch((Integer val) -> val > 3);

        System.out.println(allValuesGreaterThanThree);
        // Output: false


        // 10. noneMatch(Predicate<T>)
        // Returns true if no element satisfies the condition.
        System.out.println("\n10. noneMatch():");

        boolean noNegativeValues = numbers.stream()
                .noneMatch((Integer val) -> val < 0);

        System.out.println(noNegativeValues);
        // Output: true

        boolean noValuesGreaterThanThree = numbers.stream()
                .noneMatch((Integer val) -> val > 3);

        System.out.println(noValuesGreaterThanThree);
        // Output: false


        // 11. findFirst()
        // Returns an Optional containing the first element in encounter order.
        System.out.println("\n11. findFirst():");

        Optional<Integer> firstMatchingValue = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .findFirst();

        System.out.println(firstMatchingValue.get());
        // Output: 4


        // 12. findAny()
        // Returns an Optional containing some element from the stream.
        // In a sequential stream, it commonly returns the first matching
        // element, but that is not guaranteed by the method contract.
        System.out.println("\n12. findAny():");

        Optional<Integer> anyMatchingValue = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .findAny();

        System.out.println(anyMatchingValue.get());
        // Output: commonly 4 for this sequential stream
    }
}
