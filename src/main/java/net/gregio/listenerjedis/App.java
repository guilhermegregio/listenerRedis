package net.gregio.listenerjedis;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import redis.clients.jedis.Jedis;

/**
 * Escutando redis
 * 
 */
public class App {

	public static void main(String[] args) throws IOException {
		Properties redisProperty = new Properties();
		redisProperty.load(App.class.getClassLoader().getResourceAsStream(
				"Redis.properties"));

		Jedis jedis = new Jedis(redisProperty.getProperty("ip"));

		MyListener l = new MyListener();

		jedis.subscribe(l, "foo");
	}
}
