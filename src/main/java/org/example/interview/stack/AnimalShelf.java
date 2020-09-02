package org.example.interview.stack;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelf {
    /*
    面试题 03.06. 动物收容所
    动物收容所。有家动物收容所只收容狗与猫，且严格遵守“先进先出”的原则。
    在收养该收容所的动物时，收养人只能收养所有动物中“最老”（由其进入收容所的时间长短而定）的动物，
    或者可以挑选猫或狗（同时必须收养此类动物中“最老”的）。
    换言之，收养人不能自由挑选想收养的对象。
    请创建适用于这个系统的数据结构，实现各种操作方法，
    比如enqueue、dequeueAny、dequeueDog和dequeueCat。
    允许使用Java内置的LinkedList数据结构。
    enqueue方法有一个animal参数，animal[0]代表动物编号，animal[1]代表动物种类，其中 0 代表猫，1 代表狗。
    dequeue*方法返回一个列表[动物编号, 动物种类]，若没有可以收养的动物，则返回[-1,-1]。
     */
    Queue<int[]> queue;

    public AnimalShelf() {
        queue = new LinkedList<>();
    }

    public void enqueue(int[] animal) {
        queue.offer(animal);
    }

    public int[] dequeueAny() {
        if (queue.isEmpty()) {
            return new int[]{-1, -1};
        }
        return queue.poll();
    }

    public int[] dequeueDog() {
        for (int[] animal : queue) {
            if (animal[1] == 1) {
                queue.remove(animal);
                return animal;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] dequeueCat() {
        for (int[] animal : queue) {
            if (animal[1] == 0) {
                queue.remove(animal);
                return animal;
            }
        }
        return new int[]{-1, -1};
    }
}
