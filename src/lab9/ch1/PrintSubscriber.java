package lab9.ch1;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class PrintSubscriber<String> implements Subscriber<String> {
    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(String string) {
        System.out.println(string);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("Done!");
    }
}
