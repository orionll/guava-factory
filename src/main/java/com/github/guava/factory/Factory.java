package com.github.guava.factory;

import java.util.regex.Pattern;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Splitter;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;

public final class Factory {
	private Factory() {
	}

	public static Joiner joiner(char separator) { return Joiner.on(separator); }
	public static Joiner joiner(String separator) { return Joiner.on(separator); }

	public static Splitter splitter(char separator) { return Splitter.on(separator); }
	public static Splitter splitter(CharMatcher separatorMatcher) { return Splitter.on(separatorMatcher); }
	public static Splitter splitter(String separator) { return Splitter.on(separator); }
	public static Splitter splitter(Pattern separatorPattern) { return Splitter.on(separatorPattern); }

	public static <T> Optional<T> present(T reference) { return Optional.of(reference); }

	public static <E> FluentIterable<E> fluent(Iterable<E> iterable) { return FluentIterable.from(iterable); }
	@Deprecated public static <E> FluentIterable<E> fluent(FluentIterable<E> iterable) { return FluentIterable.from(iterable); }

	public static <E> ImmutableList<E> emptyList() { return ImmutableList.of(); }
	public static <E> ImmutableList<E> list(E element) { return ImmutableList.of(element); }
	public static <E> ImmutableList<E> list(E e1, E e2) { return ImmutableList.of(e1, e2); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3) { return ImmutableList.of(e1, e2, e3); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3, E e4) { return ImmutableList.of(e1, e2, e3, e4); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3, E e4, E e5) { return ImmutableList.of(e1, e2, e3, e4, e5); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3, E e4, E e5, E e6) { return ImmutableList.of(e1, e2, e3, e4, e5, e6); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7) { return ImmutableList.of(e1, e2, e3, e4, e5, e6, e7); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) { return ImmutableList.of(e1, e2, e3, e4, e5, e6, e7, e8); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) { return ImmutableList.of(e1, e2, e3, e4, e5, e6, e7, e8, e9); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) { return ImmutableList.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) { return ImmutableList.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11); }
	public static <E> ImmutableList<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... others) { return ImmutableList.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, others); }

	public static <E> ImmutableSet<E> emptySet() { return ImmutableSet.of(); }
	public static <E> ImmutableSet<E> set(E element) { return ImmutableSet.of(element); }
	public static <E> ImmutableSet<E> set(E e1, E e2) { return ImmutableSet.of(e1, e2); }
	public static <E> ImmutableSet<E> set(E e1, E e2, E e3) { return ImmutableSet.of(e1, e2, e3); }
	public static <E> ImmutableSet<E> set(E e1, E e2, E e3, E e4) { return ImmutableSet.of(e1, e2, e3, e4); }
	public static <E> ImmutableSet<E> set(E e1, E e2, E e3, E e4, E e5) { return ImmutableSet.of(e1, e2, e3, e4, e5); }
	public static <E> ImmutableSet<E> set(E e1, E e2, E e3, E e4, E e5, E e6, E... others) { return ImmutableSet.of(e1, e2, e3, e4, e5, e6, others); }

	public static <E> ImmutableSortedSet<E> emptySortedSet() { return ImmutableSortedSet.of(); }
	public static <E extends Comparable<? super E>> ImmutableSortedSet<E> sortedSet(E element) { return ImmutableSortedSet.of(element); }
	public static <E extends Comparable<? super E>> ImmutableSortedSet<E> sortedSet(E e1, E e2) { return ImmutableSortedSet.of(e1, e2); }
	public static <E extends Comparable<? super E>> ImmutableSortedSet<E> sortedSet(E e1, E e2, E e3) { return ImmutableSortedSet.of(e1, e2, e3); }
	public static <E extends Comparable<? super E>> ImmutableSortedSet<E> sortedSet(E e1, E e2, E e3, E e4) { return ImmutableSortedSet.of(e1, e2, e3, e4); }
	public static <E extends Comparable<? super E>> ImmutableSortedSet<E> sortedSet(E e1, E e2, E e3, E e4, E e5) { return ImmutableSortedSet.of(e1, e2, e3, e4, e5); }
	public static <E extends Comparable<? super E>> ImmutableSortedSet<E> sortedSet(E e1, E e2, E e3, E e4, E e5, E e6, E... others) { return ImmutableSortedSet.of(e1, e2, e3, e4, e5, e6, others); }

	public static <E> ImmutableMultiset<E> emptyMultiset() { return ImmutableMultiset.of(); }
	public static <E> ImmutableMultiset<E> multiset(E element) { return ImmutableMultiset.of(element); }
	public static <E> ImmutableMultiset<E> multiset(E e1, E e2) { return ImmutableMultiset.of(e1, e2); }
	public static <E> ImmutableMultiset<E> multiset(E e1, E e2, E e3) { return ImmutableMultiset.of(e1, e2, e3); }
	public static <E> ImmutableMultiset<E> multiset(E e1, E e2, E e3, E e4) { return ImmutableMultiset.of(e1, e2, e3, e4); }
	public static <E> ImmutableMultiset<E> multiset(E e1, E e2, E e3, E e4, E e5) { return ImmutableMultiset.of(e1, e2, e3, e4, e5); }
	public static <E> ImmutableMultiset<E> multiset(E e1, E e2, E e3, E e4, E e5, E e6, E... others) { return ImmutableMultiset.of(e1, e2, e3, e4, e5, e6, others); }

	public static <E> ImmutableSortedMultiset<E> emptySortedMultiset() { return ImmutableSortedMultiset.of(); }
	public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> sortedMultiset(E element) { return ImmutableSortedMultiset.of(element); }
	public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> sortedMultiset(E e1, E e2) { return ImmutableSortedMultiset.of(e1, e2); }
	public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> sortedMultiset(E e1, E e2, E e3) { return ImmutableSortedMultiset.of(e1, e2, e3); }
	public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> sortedMultiset(E e1, E e2, E e3, E e4) { return ImmutableSortedMultiset.of(e1, e2, e3, e4); }
	public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> sortedMultiset(E e1, E e2, E e3, E e4, E e5) { return ImmutableSortedMultiset.of(e1, e2, e3, e4, e5); }
	public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> sortedMultiset(E e1, E e2, E e3, E e4, E e5, E e6, E... others) { return ImmutableSortedMultiset.of(e1, e2, e3, e4, e5, e6, others); }

	public static <K, V> ImmutableMap<K, V> emptyMap() { return ImmutableMap.of(); }
	public static <K, V> ImmutableMap<K, V> map(K k1, V v1) { return ImmutableMap.of(k1, v1); }
	public static <K, V> ImmutableMap<K, V> map(K k1, V v1, K k2, V v2) { return ImmutableMap.of(k1, v1, k2, v2); }
	public static <K, V> ImmutableMap<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3) { return ImmutableMap.of(k1, v1, k2, v2, k3, v3); }
	public static <K, V> ImmutableMap<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) { return ImmutableMap.of(k1, v1, k2, v2, k3, v3, k4, v4); }
	public static <K, V> ImmutableMap<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) { return ImmutableMap.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5); }

	public static <K, V> ImmutableMultimap<K, V> emptyMultimap() { return ImmutableMultimap.of(); }
	public static <K, V> ImmutableMultimap<K, V> multimap(K k1, V v1) { return ImmutableMultimap.of(k1, v1); }
	public static <K, V> ImmutableMultimap<K, V> multimap(K k1, V v1, K k2, V v2) { return ImmutableMultimap.of(k1, v1, k2, v2); }
	public static <K, V> ImmutableMultimap<K, V> multimap(K k1, V v1, K k2, V v2, K k3, V v3) { return ImmutableMultimap.of(k1, v1, k2, v2, k3, v3); }
	public static <K, V> ImmutableMultimap<K, V> multimap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) { return ImmutableMultimap.of(k1, v1, k2, v2, k3, v3, k4, v4); }
	public static <K, V> ImmutableMultimap<K, V> multimap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) { return ImmutableMultimap.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5); }

	public static <K, V> ImmutableSetMultimap<K, V> emptySetMultimap() { return ImmutableSetMultimap.of(); }
	public static <K, V> ImmutableSetMultimap<K, V> setMultimap(K k1, V v1) { return ImmutableSetMultimap.of(k1, v1); }
	public static <K, V> ImmutableSetMultimap<K, V> setMultimap(K k1, V v1, K k2, V v2) { return ImmutableSetMultimap.of(k1, v1, k2, v2); }
	public static <K, V> ImmutableSetMultimap<K, V> setMultimap(K k1, V v1, K k2, V v2, K k3, V v3) { return ImmutableSetMultimap.of(k1, v1, k2, v2, k3, v3); }
	public static <K, V> ImmutableSetMultimap<K, V> setMultimap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) { return ImmutableSetMultimap.of(k1, v1, k2, v2, k3, v3, k4, v4); }
	public static <K, V> ImmutableSetMultimap<K, V> setMultimap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) { return ImmutableSetMultimap.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5); }

	public static <K, V> ImmutableListMultimap<K, V> emptyListMultimap() { return ImmutableListMultimap.of(); }
	public static <K, V> ImmutableListMultimap<K, V> listMultimap(K k1, V v1) { return ImmutableListMultimap.of(k1, v1); }
	public static <K, V> ImmutableListMultimap<K, V> listMultimap(K k1, V v1, K k2, V v2) { return ImmutableListMultimap.of(k1, v1, k2, v2); }
	public static <K, V> ImmutableListMultimap<K, V> listMultimap(K k1, V v1, K k2, V v2, K k3, V v3) { return ImmutableListMultimap.of(k1, v1, k2, v2, k3, v3); }
	public static <K, V> ImmutableListMultimap<K, V> listMultimap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) { return ImmutableListMultimap.of(k1, v1, k2, v2, k3, v3, k4, v4); }
	public static <K, V> ImmutableListMultimap<K, V> listMultimap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) { return ImmutableListMultimap.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5); }

	public static <K, V> ImmutableBiMap<K, V> emptyBiMap() { return ImmutableBiMap.of(); }
	public static <K, V> ImmutableBiMap<K, V> biMap(K k1, V v1) { return ImmutableBiMap.of(k1, v1); }
	public static <K, V> ImmutableBiMap<K, V> biMap(K k1, V v1, K k2, V v2) { return ImmutableBiMap.of(k1, v1, k2, v2); }
	public static <K, V> ImmutableBiMap<K, V> biMap(K k1, V v1, K k2, V v2, K k3, V v3) { return ImmutableBiMap.of(k1, v1, k2, v2, k3, v3); }
	public static <K, V> ImmutableBiMap<K, V> biMap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) { return ImmutableBiMap.of(k1, v1, k2, v2, k3, v3, k4, v4); }
	public static <K, V> ImmutableBiMap<K, V> biMap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) { return ImmutableBiMap.of(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5); }

	public static <E extends Enum<E>> ImmutableSet<E> enumSet(E element, E... otherElements) { return Sets.immutableEnumSet(element, otherElements); }

	public static final <R, C, V> ImmutableTable<R, C, V> table(R rowKey, C columnKey, V value) { return ImmutableTable.of(rowKey, columnKey, value); }

	public static final ContiguousSet<Integer> fromTo(int from, int to) {
		return ContiguousSet.create(Range.closed(from, to), DiscreteDomain.integers());
	}

	public static final ContiguousSet<Integer> fromUntil(int from, int until) {
		return ContiguousSet.create(Range.closedOpen(from, until), DiscreteDomain.integers());
	}
}
