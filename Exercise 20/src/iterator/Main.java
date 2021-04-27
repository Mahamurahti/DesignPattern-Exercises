package iterator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        // a) Two threads at the same time with own iterators
        IteratorThread[] iterators = new IteratorThread[2];

        populateThreads(iterators, "Non-joined thread");

        System.out.println("Non-joined iterators:");

        for(IteratorThread itr : iterators){
            itr.start();
        }
        for(IteratorThread itr : iterators){
            try{ itr.join(); }
            catch (Exception e){ e.printStackTrace(); }
        }
        // Answer: The two threads iterate through their own lists at their own pace.

        // b) Two threads with the same iterator
        IteratorThread[] joinedIterators = new IteratorThread[2];

        populateThreads(joinedIterators, "Joined thread");

        System.out.println("Joined iterators:");

        Iterator<String> sameIterator = joinedIterators[0].getIterator();
        for(IteratorThread itr : joinedIterators){
            itr.setIterator(sameIterator);
            itr.start();
        }
        for(IteratorThread itr : joinedIterators){
            try{ itr.join(); }
            catch (Exception e){ e.printStackTrace(); }
        }
        // Answer: The two threads iterate through the one list and compete with who is the one iterating.

        // c) What if changes are made during iteration?
        IteratorThread[] changedIterators = new IteratorThread[2];

        populateThreads(changedIterators, "Changed thread");

        System.out.println("Changed iterators:");

        for(IteratorThread itr : changedIterators){
            itr.start();
        }
        for(IteratorThread itr : changedIterators){
            itr.replace(45, "CHANGE");
        }
        for(IteratorThread itr : changedIterators){
            try{ itr.join(); }
            catch (Exception e){ e.printStackTrace(); }
        }
        // Answer: The changed element will be printed as is if the change is made before the iterators have reached
        // the changed element.

        // d) What if we remove with iterator?
        IteratorThread[] removeIterator = new IteratorThread[2];

        populateThreads(removeIterator, "Remove thread");

        System.out.println("Remove iterators:");

        for(IteratorThread itr : removeIterator){
            itr.start();
            itr.setShouldRemove(true);
        }
        for(IteratorThread itr : removeIterator){
            try{ itr.join(); }
            catch (Exception e){ e.printStackTrace(); }
        }
        // Answer: Both threads will throw a NullPointerException, since they are trying to
        // print something that no long exists
    }

    private static void populateThreads(IteratorThread[] iterators, String name){
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("Exercise 20/src/iterator/names"));

            iterators[0] = new IteratorThread(name + " " + 1);
            iterators[1] = new IteratorThread(name + " " + 2);

            String nameFromFile = bufferedReader.readLine();
            while (nameFromFile != null){
                iterators[0].add(nameFromFile);
                iterators[1].add(nameFromFile);
                nameFromFile = bufferedReader.readLine();
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
