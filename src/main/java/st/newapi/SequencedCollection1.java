package st.newapi;

import java.util.*;

/**
 * 作用:集合API功能统一
 * 适用:集合场景,还有SequencedMap
 * 建议:建议
 */
public class SequencedCollection1 {

    public static void oldMethod() {
        List list = new ArrayList<>();
        Deque deque = new ArrayDeque();
        SortedSet sortedSet = new TreeSet();
        LinkedList linkedList = new LinkedList();

        //获取首个元素
        list.get(0);
        deque.getFirst();
        sortedSet.getFirst();
        linkedList.iterator().next();

        //获取最后一个元素
        list.get(list.size() - 1);
        deque.getLast();
        sortedSet.getLast();
        //missing
    }

    public static void newMethod() {
        List list = new ArrayList<>();
        Deque deque = new ArrayDeque();
        SortedSet sortedSet = new TreeSet();
        LinkedList linkedList = new LinkedList();

        //获取首个元素
        list.getFirst();
        deque.getFirst();
        sortedSet.getFirst();
        linkedList.getFirst();

        //获取最后一个元素
        list.getLast();
        deque.getLast();
        sortedSet.getLast();
        linkedList.getLast();

        //添加首尾元素
        list.addFirst(new Object());
        list.addLast(new Object());

        //删除首尾元素
        list.removeFirst();
        list.removeLast();

    }

}
