package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    private static final List<String> ALPHABET = Arrays.asList(
            "a", "b", "c", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u",
            "v", "w", "x", "y", "z");

    public StreamMap() {

    }

    public List<Integer> getTriple(List<Integer> numbers) {
        return numbers.stream()
                .map(integer -> integer * 3)
                .collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<String> mapLetter(List<Integer> numbers) {
     return  numbers.stream()
             .map(integer -> ALPHABET.get(integer-1))
             .collect(Collectors.toList());

        //throw new NotImplementedException();
    }

    public List<Integer> mapLength(List<String> words) {
        return words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        //throw new NotImplementedException();
    }
}
