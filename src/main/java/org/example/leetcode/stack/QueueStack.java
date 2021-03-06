package org.example.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int top;

    /** Initialize your data structure here. */
    public QueueStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.offer(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (queue1.size() > 1) {
            top = queue1.poll();
            queue2.offer(top);
        }
        int e = queue1.poll();
        Queue<Integer> tmp = queue1;  // 交换q1 q2 避免复制
        queue1 = queue2;
        queue2 = tmp;
        return e;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}
