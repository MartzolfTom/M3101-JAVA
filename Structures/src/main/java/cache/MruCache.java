package cache;

import java.util.ArrayDeque;
import java.util.HashMap;

public class MruCache<K, V> extends Cache<K, V> {

	protected ArrayDeque<K> file;
	protected HashMap<K, V> cache;

	protected MruCache(int capacity) {
		super(capacity);
		file = new ArrayDeque<>();
		cache = new HashMap<>();
	}

	@Override
	protected int size() {
		return cache.size();
	}

	@Override
	protected V getValue(K key) {
		if (!cache.containsKey(key))
			return null;
		return cache.get(key);
	}

	@Override
	protected void removeEntry() {
		cache.remove(file.getFirst());
		file.removeFirst();
	}

	@Override
	protected void insertEntry(K key, V value) {
		cache.put(key, value);
		file.add(key);
	}

	@Override
	protected void reorder(K key) {
		file.removeLast();
		file.addLast(key);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected K[] toArray() {
		return (K[]) file.toArray();
	}

	@Override
	protected void clear() {
		cache.clear();
	}

}
