package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRUCache {

    private static Logger logger = LogManager.getLogger();

    private Map<Integer, Integer> map = new HashMap<>();
    private List<Integer> list;
    private int capacity;

    public LRUCache(int capacity) {
        list = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public static void main(String[] args) {

        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        logger.info("get 1 " + lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        logger.info("get 2 " + lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        logger.info("get 1 " + lRUCache.get(1));    // return -1 (not found)
        logger.info("get 3 " + lRUCache.get(3));    // return 3
        logger.info("get 4 " + lRUCache.get(4));    // return 4
    }

    public int get(int key) {

        if (map.containsKey(key)) {
            list.remove(Integer.valueOf(key));
            list.add(key);//move it to 0
            return map.get(key);
        }

        return -1;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) list.remove(Integer.valueOf(key));
        else if (list.size() >= capacity) map.remove(list.remove(0));

        list.add(key);
        map.put(key, value);
    }
}
