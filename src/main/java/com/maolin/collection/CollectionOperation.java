package com.maolin.collection;

import org.apache.commons.lang3.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author limaolin
 * @Version 1.0
 **/
public class CollectionOperation {
    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1,2,3,4,5,6);

        convertList2Str(testList);
        convertList2Str_usingCollectors(testList);
        convertList2Str_usingLib(testList);
    }

    public static void convertList2Str(Collection<?> testList) {
        System.out.println(testList);
    }

    public static void convertList2Str_usingCollectors(Collection<?> testList) {
        String str = testList.stream().map(item -> ((Object) item).toString()).collect(Collectors.joining(","));
        System.out.println(str);
    }

    public static void convertList2Str_usingLib(Collection<?> testList) {
        String str = StringUtils.join(testList, ",");
        System.out.println(str);
    }

}
