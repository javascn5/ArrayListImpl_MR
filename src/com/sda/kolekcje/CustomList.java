package com.sda.kolekcje;

import java.util.Arrays;

//implementacja wlasnej arraylist
public class CustomList<E> {

    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if(size == elements.length){
            resize();
        }
        elements[size++] = e;
    }

    public void resize(){
        int newSize = elements.length *2;
        Object tab[] = new Object[newSize];
        for (int i=0; i<elements.length; i++){
            tab[i]=elements[i];
        }
        elements = tab;

        //inne rozwiazanie
        //elements = Arrays.copyOf(elements,newSize);
    }

    public E get(int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException("Nie ma takiego elementu");
        }
        return (E) elements[i];
    }

    public int getSize() {
        return size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void remove(int index){
        Object tmp[]=new Object[size-1];
        for (int i=0; i<size; i++){
            if(i<index){
                tmp[i]=elements[i];
            }
            if(i>index){
                tmp[i-1]=elements[i];
            }
        }
        elements=tmp;
        size--;
    }
}
