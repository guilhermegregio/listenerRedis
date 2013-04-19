package net.gregio.listenerjedis;

import redis.clients.jedis.JedisPubSub;

class MyListener extends JedisPubSub {
	public void onMessage(String channel, String message) {
		System.out.println("onMessage");
		System.out.println(channel + " : " + message);
		System.out.println("-----------------------");
	}

	public void onSubscribe(String channel, int subscribedChannels) {
		System.out.println("onSubscribe");
		System.out.println(channel + " : " + subscribedChannels);
		System.out.println("-----------------------");
	}

	public void onUnsubscribe(String channel, int subscribedChannels) {
		System.out.println("onUnsubscribe");
		System.out.println(channel + " : " + subscribedChannels);
		System.out.println("-----------------------");
	}

	public void onPSubscribe(String pattern, int subscribedChannels) {
		System.out.println("onPSubscribe");
		System.out.println(pattern + " : " + subscribedChannels);
		System.out.println("-----------------------");
	}

	public void onPUnsubscribe(String pattern, int subscribedChannels) {
		System.out.println("onPUnsubscribe");
		System.out.println(pattern + " : " + subscribedChannels);
		System.out.println("-----------------------");
	}

	public void onPMessage(String pattern, String channel, String message) {
		System.out.println("onPMessage");
		System.out.println(pattern + ":" + channel + " : " + message);
		System.out.println("-----------------------");
	}
}