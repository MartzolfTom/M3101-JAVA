package cache;

public abstract class Cache<K,V> {
	
	protected int capacity;
	
	protected Cache(int capacity) {
		this.capacity = capacity;
	}
	
	public V get(K key ) {
		return null;
	}
	
	public void put(K key, V value) {
		
	}
	
	@Override
	public String toString() {
		return null;
		
	}
	
	protected abstract int size();
	protected abstract V getValue(K key);
	protected abstract void removeEntry();
	protected abstract void insertEntry( K key, V value);
	protected abstract void reorder ( K key);
	protected abstract K[] toArray();
	protected abstract void clear(); 
}
