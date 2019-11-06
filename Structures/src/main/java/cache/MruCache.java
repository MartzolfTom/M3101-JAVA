package cache;

public class MruCache<K, V> extends Cache<K,V>{

	protected MruCache(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected V getValue(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void removeEntry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void insertEntry(K key, V value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void reorder(K key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected K[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void clear() {
		// TODO Auto-generated method stub
		
	}

}
