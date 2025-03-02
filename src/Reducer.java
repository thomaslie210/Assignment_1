package no.uio.ifi.task;

public abstract class Reducer<T> {
    protected int current = 0;
    protected int count = 0;
    protected abstract void reduce(T input);
}
