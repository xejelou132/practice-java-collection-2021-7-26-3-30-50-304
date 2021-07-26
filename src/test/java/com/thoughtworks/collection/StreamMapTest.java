package com.thoughtworks.collection;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamMapTest {
    @Test
    public void should_map_to_triple() {
        //triple ever number in the list
        List<Integer> numbers = Arrays.asList(1, 3, 5, 4, 9);
        List<Integer> expectedNumbers = Arrays.asList(3, 9, 15, 12, 27);

        List<Integer> actualNumbers = new StreamMap().getTriple(numbers);

        assertThat(actualNumbers).isEqualTo(expectedNumbers);
    }

    @Test
    public void should_map_to_letter() {
        //mapping number to the letter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> expectedLetters = Arrays.asList("a", "b", "c", "d", "e");

        List<String> actualLetters = new StreamMap().mapLetter(numbers);

        assertThat(actualLetters).isEqualTo(expectedLetters);
    }

    @Test
    public void should_map_to_length() {
        //mapping word to its length
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<Integer> expectedLengths = Arrays.asList(5, 6, 6);

        List<Integer> actualLengths = new StreamMap().mapLength(words);

        assertThat(actualLengths).isEqualTo(expectedLengths);
    }
}
