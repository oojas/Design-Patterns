package com.example.observer_pattern.observable;

import com.example.observer_pattern.observer.ClientObserver;

public interface IphoneObservable {
    public void add(ClientObserver observer);
    public void remove(ClientObserver observer);
    public void setCount(int count);
    public int getCount();
    public void notifyObservers();
}
