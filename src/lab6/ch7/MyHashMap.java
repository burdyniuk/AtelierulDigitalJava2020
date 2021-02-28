package lab6.ch7;

import java.util.Arrays;

public class MyHashMap<K, V> {
    int size;
    public Entry<K, V>[] data;

    public MyHashMap(int size) {
        this.size = size;
        this.data = new Entry[size];
    }

    class Entry<K,V>  {
        private K key;
        private V value;
        Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    public void put (K key, V value) {
        int pos = key.hashCode();
        Entry<K, V> en = data[pos];

        if (en != null) {
            // if duplicate, update value
            if (en.key.equals(key)) {
                en.value = value;
            } else {
                // if not duplicate, add to end
                while (en.next != null) {
                    en = en.next;
                }
                Entry newEn = new Entry(key, value);
                en.next = newEn;
            }
        } else {
            Entry<K, V> newEntry = new Entry(key, value);
            data[pos] = newEntry;
        }
    }

    public Entry get(K key) {
        int pos = key.hashCode();
        Entry<K, V> enIter = data[pos];

        while (enIter != null) {
            if (enIter.key.equals(key)) {
                return enIter;
            }
            enIter = enIter.next;
        }
    return null;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                Arrays.toString(data) +
                '}';
    }
}

