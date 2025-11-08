package com.example.observer_pattern.observable;

import com.example.observer_pattern.observer.ClientObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements IphoneObservable {
    List<ClientObserver>  observerList=new ArrayList<ClientObserver>();
    int count=0;
    @Override
    public void add(ClientObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(ClientObserver observer) {
    this.observerList.remove(observer);
    }

    @Override
    public void setCount(int count) {
        if(count==0){
            notifyObservers();
        }else{
            this.count=count;
            notifyObservers();
        }
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void notifyObservers() {
        if(this.count==0){
            for(ClientObserver observer:observerList){
                observer.updateIfProductFinished();
            }
        }else{
            for(ClientObserver observer:observerList){
                observer.updateIfProductArrived();
            }
        }
    }
}
