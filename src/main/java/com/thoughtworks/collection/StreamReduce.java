package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Comparator;
import java.util.List;

public class StreamReduce {

    public StreamReduce() {
    }

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (max, current) -> current % 2 != 0 ? current : max);
     //   throw new NotImplementedException();
    }

    public String getLongest(List<String> words) {
        return words.stream().
                reduce((s, s2) -> (s.length() > s2.length() ? s : s2))
                .get();
       // throw new NotImplementedException();
    }

    public int getTotalLength(List<String> words) {
      
      throw new NotImplementedException();
    }



}
