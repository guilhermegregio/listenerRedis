package net.gregio.listenerjedis;

import redis.clients.jedis.Jedis;

/**
 * Escutando redis
 * 
 */
public class App {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");

		MyListener l = new MyListener();

		jedis.subscribe(l, "foo");
	}
}
