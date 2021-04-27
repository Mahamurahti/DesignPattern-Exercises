package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorThread extends Thread{
    private final String threadName;
    private final List<String> list;
    private Iterator<String> itr = null;
    private volatile boolean running;
    private boolean shouldRemove = false;

    public IteratorThread(String name){
        threadName = name;
        list = new ArrayList<>();
    }

    public void add(String data){
        list.add(data);
    }

    public void remove(int index){
        list.remove(index);
    }

    public void replace(int index, String data){
        list.add(index, data);
    }

    @Override
    public void run(){
        running = true;
        if(itr != null){
            while (running)
                iterateThroughListWithIterator();
        }
        if(itr == null){
            while (running)
                iterateThroughList();
        }
    }

    public void iterateThroughList(){
        Iterator<String> iterator = list.iterator();
        int count = 1;
        while (iterator.hasNext()){
            count++;
            System.out.println(threadName + " " + iterator.next());
            if(shouldRemove && count % 22 == 0)
                removeIterator();
        }
        running = false;
    }

    public void iterateThroughListWithIterator(){
        while (this.itr.hasNext())
            System.out.println(threadName + " " + this.itr.next());
        running = false;
    }

    public void removeIterator(){
        System.out.println("Removing with iterator");
        itr.remove();
    }

    public Iterator<String> getIterator(){
        return list.iterator();
    }

    public void setIterator(Iterator<String> itr){
        this.itr = itr;
    }

    public void setShouldRemove(boolean shouldRemove){
        this.shouldRemove = shouldRemove;
    }
}
