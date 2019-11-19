package proxy;

import java.io.IOException;
import java.io.Writer;

import cache.Cache;
import servers.Server;

public class Proxy<K,V>{
	
	private Cache<K,V> cache;
	private Server<K, V> server;
	private boolean succes;
	private int compteur;
	private int echec;

	public Proxy(Cache<K, V> cache, Server<K,V> server) {
		this.cache=cache;
		this.server=server;
		this.succes=true;
		this.compteur=0;
		this.echec=0;
	}
	
	public V get(K key) {
		compteur+=1;
		if(cache.get(key) == null) {
			cache.put(key, server.fetch(key));
			this.succes=false;
			this.echec+=1;
			return server.fetch(key);
		}
		return cache.get(key);
	}

	public void printCache(Writer writer) throws IOException{
		try {
			writer.write(cache.toString());
			
			if(this.succes) {
				writer.write("*");
			}			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void printResult(Writer writer) throws IOException{
		try {
			writer.write(cache.toString());
			int succes = this.compteur-this.echec;	
			writer.write("succes :" + succes + " echec : " + this.echec);

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
