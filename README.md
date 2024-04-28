## Java Streams

Java Streams provide a clean and concise way to perform operations on collections or arrays. Streams enable functional-style operations on sequences of elements, allowing for easy parallelism and efficient processing.

## Basic Concepts

## 1. Stream
A stream represents a sequence of elements and supports various operations to perform computations upon those elements.

## 2. Intermediate Operations
Intermediate operations are operations that produce a new stream as a result. These operations are lazy, meaning they do not perform any processing until a terminal operation is invoked.

Common intermediate operations include:

• filter(Predicate<T> predicate): Filters elements based on the given predicate.

• map(Function<T, R> mapper): Transforms elements using the provided function.

• flatMap(Function<T, Stream<R>> mapper): Transforms each element into a stream of elements and then flattens the resulting streams into a single stream.

• distinct(): Removes duplicate elements.

• sorted(): Sorts the elements.

• limit(long maxSize): Limits the number of elements in the stream.

• skip(long n): Skips the first n elements of the stream.

## 3. Terminal Operations

Terminal operations produce a result or a side-effect and terminate the stream. Once a terminal operation is invoked, the stream cannot be reused.

Common terminal operations include:

• forEach(Consumer<T> action): Performs an action for each element in the stream.

• collect(Collector<T, A, R> collector): Collects the elements of the stream into a container.

• reduce(T identity, BinaryOperator<T> accumulator): Reduces the stream to a single value.

• count(): Returns the count of elements in the stream.

• anyMatch(Predicate<T> predicate), allMatch(Predicate<T> predicate), noneMatch(Predicate<T> predicate): Check if any, all, or none of the elements match the given predicate.

• findFirst(), findAny(): Returns an optional containing the first or any element of the stream, respectively.
