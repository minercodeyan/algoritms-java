package com.company;

public class LSD {

    public static String[] sort(String[] a) {
        int maxL = getMaxL(a);
        for (int i = 0; i < maxL; i++) {
            a = stepSort(a, maxL, i);
        }
        return a;
    }

    private static int getCode(String t, int maxLength, int position) {
        if (t.length() <= maxLength - position) {
            return -1;
        }
        return t.codePointAt(maxLength - position);
    }

    private static int[] findMinMaxKey(String[] arrays, int maxLength, int position) {
        int minKey = getCode(arrays[0], maxLength, position);
        int maxKey = minKey;
        for (String text : arrays) {
            int codePoint = getCode(text, maxLength, position);
            if (codePoint < minKey) {
                minKey = codePoint;
            }
            if (codePoint > maxKey) {
                maxKey = codePoint;
            }
        }
        return new int[]{minKey, maxKey};
    }

    private static String[] stepSort(String[] arrays, int maxLength, int index) {
        int[] minMaxKey = findMinMaxKey(arrays, maxLength, index);
        int minKey = minMaxKey[0];
        int maxKey = minMaxKey[1];
        int n = maxKey - minKey + 1;
        int[] buffer = new int[n];
        for (String text : arrays) {
            buffer[getCode(text, maxLength, index) - minKey] += 1;
        }
        int size = arrays.length;
        for (int i = buffer.length - 1; i >= 0; i--) {
            size -= buffer[i];
            buffer[i] = size;
        }
        String[] result = new String[arrays.length];
        for (String text : arrays) {
            result[buffer[getCode(text, maxLength, index) - minKey]] = text;
            buffer[getCode(text, maxLength, index) - minKey] += 1;
        }
        return result;
    }

    private static int getMaxL(String[] a) {
        int maxL = 0;
        for (String t : a) {
            if (t.length() > maxL) {
                maxL = t.length();
            }
        }
        return maxL;
    }
}
