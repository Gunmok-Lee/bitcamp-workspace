package com.eomcs.corelib.ex03;

import java.util.Arrays;

public class MyArrayLista {

  private static final int DEFAULT_CAPACITY = 5;
  private Object[] elementData;
  private int size;

  public MyArrayLista() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayLista(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      elementData = new Object[DEFAULT_CAPACITY];
    } else {
      elementData = new Object[initialCapacity];
    }
  }

  public boolean add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }

  private void grow() {
    System.out.println("배열 늘리기!!!");
    int newCapacity = elementData.length + (elementData.length >> 1);
    elementData = Arrays.copyOf(elementData, newCapacity);
    /*
    Object[] newArray = new Object[elementData.length + (elementData.length >> 1 )];
    for (int i = 0; i < elementData.length; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray;
    */
  }

  public void add(int index, Object element) {
    if (size == elementData.length) {
      grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스 유효하지 않습니다.");
    }
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유요하지 않습니다.");
    }
    return elementData[index];

  }
  public Object set(int index, Object element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementData[index];
    elementData[index] = element;
    return old;
  }

  public Object remove(int index) {
    Object old = elementData[index];

    System.arraycopy(
        elementData,
        index + 1,
        elementData,
        index,
        this.size - (index +1));

    /*
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
    */
    size--;
    elementData[size] = null;
    return old;
  }

  public int size() {
    return this.size;
  }

  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementData, this.size);

    return arr;
    /*
    Object[] arr = new Object[this.size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = elementData[i];
    }
    return arr;
    */
  }
}
