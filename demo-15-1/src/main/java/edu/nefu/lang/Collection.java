package edu.nefu.lang;

public interface Collection<E, L> extends Iterator<E> {
    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    Iterator<E> iterator();
}

