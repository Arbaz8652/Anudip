package com.synchronisation_objectProducerConsumer;

public class ProduceConsumer {

	public static void main(String[] args) {
		Q q=new Q();
		new Consumer(q);
		new Producer(q);

	}

}
