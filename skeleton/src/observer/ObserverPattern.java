package observer;

public class ObserverPattern {

	public static void main(String[] args) {

		// 주체(이자 객체)
		Topic topic = new Topic();

		// 옵저버
		Observer a = new TopicSubscriber("a", topic);
		Observer b = new TopicSubscriber("b", topic);
		Observer c = new TopicSubscriber("c", topic);

		// 옵저버는 주체를 구독
		topic.register(a);
		topic.register(b);
		topic.register(c);

		// 주체를 구독하는 옵저버들에게 변화를 알려주고 업데이트
		topic.postMessage("Change detection");

	}

}
