package problem4.main;

import problem4.binarySearchTree.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        MyBinarySearchTree mbst = new MyBinarySearchTree(mq);
        mbst.insert(12);
        mbst.insert(118);
        mbst.insert(123);
        mbst.insert(5);
        mbst.insert(543);
        mbst.preOrder(mbst.getRoot());
        mq.show();

    }
}