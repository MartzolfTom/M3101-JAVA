package servers;

public interface Server<K, V> {
	V fetch(K key);
}
