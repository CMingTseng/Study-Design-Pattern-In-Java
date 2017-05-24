package c06.observer.association;

import java.util.ArrayList;
import java.util.List;

/**
 * 被觀察者介面
 */
public abstract class Subject {
    protected List<Adventurer> list = new ArrayList<>();

    /**
     * 觀察者想被通知
     */
    public void add(Adventurer observer) {
        list.add(observer);
    }

    ;

    /**
     * 觀察者不想接到通知
     */
    public void remove(Adventurer observer) {
        list.remove(observer);
    }

    /**
     * 貼出任務公告
     */
    public abstract void sendQuestions(String questions);
}
