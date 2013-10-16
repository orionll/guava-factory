Guava Factory
=============

A very small wrapper library (just one Java class) for Guava which provides some useful static factory methods.  

Code with Guava Factory is more concise:

Guava | Guava Factory
--- | ---
`Optional.of(5)` | `present(5)` 
`Joiner.on(',')` | `joiner(',')`
`Splitter.on(',')` | `splitter(',')`
`FluentIterable.from(iterable)` | `fluent(iterable)`
`ImmutableList.of(1,2,3)` | `list(1,2,3)`
`ImmutableSet.of(1,2,3)` | `set(1,2,3)`
`ImmutableSortedSet.of(3,1,2)` | `sortedSet(3,1,2)`
`ImmutableMultiset.of(3,1,2,2)` | `multiset(3,1,2,2)`
`ImmutableSortedMultiset.of(3,1,2,2)` | `sortedMultiset(3,1,2,2)`
`ImmutableMap.of(1,"a",2,"b")` | `map(1,"a",2,"b")`
`ImmutableMultimap.of(1,"a",2,"b",2,"c")` | `multimap(1,"a",2,"b",2,"c")`
`ImmutableSetMultimap.of(1,"a",2,"b",2,"b")` | `setMultimap(1,"a",2,"b",2,"b")`
`ImmutableListMultimap.of(1,"a",2,"c",2,"b")` | `listMultimap(1,"a",2,"c",2,"b")`
`ImmutableBiMap.of(1,"a",2,"b")` | `biMap(1,"a",2,"b")`
`ImmutableTable.of(1,1,"a")` | `table(1,1,"a")`
`Sets.immutableEnumSet(TimeUnit.SECONDS, TimeUnit.DAYS)` | `enumSet(TimeUnit.SECONDS, TimeUnit.DAYS)`  

## Iterating
Iterating over integer ranges:
```java
for (int i : fromTo(0, 10)) {
    System.out.println(i); // 0, 1, 2, 3, ... , 10
}

for (int i : fromUntil(0, 10)) {
    System.out.println(i); // 0, 1, 2, 3, ... , 9
}
```
