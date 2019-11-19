package caches;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import cache.FifoCache;
import cache.LruCache;
import cache.MruCache;
import proxy.Proxy;
import servers.LowerCaseServer;


public class CachesTest {

	public static void main(String[] args) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            MruCache<String,String> MruCache = new MruCache<>(3);
            LowerCaseServer server = new LowerCaseServer();     
            Proxy<String,String> proxy = new Proxy<>(MruCache,server);

            proxy.get("A");
            proxy.get("B");
            proxy.get("D");
            proxy.get("A");
            proxy.get("C");
            proxy.get("A");
            proxy.get("B");
            proxy.get("D");
            proxy.get("C");
            proxy.get("E");
            proxy.get("D");
            proxy.get("C");

            proxy.printResult(writer);
        }
    }
}
