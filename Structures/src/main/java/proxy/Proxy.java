package proxy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

import cache.Cache;
import servers.Server;

public class Proxy<K, V>{
	
	private Cache<K,V> cache;
	private Server<K, V> server;
	private boolean succes;

	public Proxy(Cache<K, V> cache, Server<K,V> server) {
		this.cache=cache;
		this.server=server;
		this.succes=true;
	}
	
	public V get(K key) {
		if(cache.get(key) == null) {
			cache.put(key, server.fetch(key));
			this.succes=false;
			return server.fetch(key);
		}
		return cache.get(key);
	}

	public void printCache(Writer writer) throws IOException{
		try {
			BufferedWriter scribe = new BufferedWriter(writer);
			scribe.write(cache.toString());
			
			if(this.succes) {
				scribe.write("*");
			}
			
			scribe.close();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void printResult(Writer writer) throws IOException{
		
	}
}
