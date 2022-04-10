package com.pty4j.util;

import java.util.ArrayList;
import java.util.Collections;

public class AdaptJDK8Util {
    private AdaptJDK8Util() {
    }

    public static <T> ArrayList<T> arrayToList(T[] array) {
        ArrayList<T> list = new ArrayList<>(array.length);
        Collections.addAll(list, array);
        return list;
    }
}
