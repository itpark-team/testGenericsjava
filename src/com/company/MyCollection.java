package com.company;

import java.lang.reflect.Array;

public class MyCollection<T extends Unit> {
    private T[] array;
    private Class arrayType;

    public MyCollection(Class arrayType) {
        array = (T[]) Array.newInstance(arrayType, 0);
        this.arrayType = arrayType;
    }

    public void add(T item) {
        T[] tempArray = (T[]) Array.newInstance(arrayType, array.length + 1);

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        tempArray[tempArray.length - 1] = item;

        array = tempArray;
    }

    public T getItem(int index) {
        return array[index];
    }

    public int getLength() {
        return array.length;
    }
}
