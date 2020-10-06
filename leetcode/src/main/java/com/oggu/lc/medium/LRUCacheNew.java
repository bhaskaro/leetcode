package com.oggu.lc.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheNew {

    private static Logger logger = LogManager.getLogger();

    private Map<Integer, Integer> map;

    public LRUCacheNew(int capacity) {
        map = new LinkedHashMap<Integer, Integer>(capacity, 1, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public static void main(String[] args) {

        LRUCacheNew lRUCache = new LRUCacheNew(2);
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

        Integer value = map.get(key);
        return value == null ? -1 : value;
    }

    public void put(int key, int value) {

        map.put(key, value);
    }
}
