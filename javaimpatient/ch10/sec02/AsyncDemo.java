package ch10.sec02;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import jdk.incubator.http.HttpResponse.BodyHandler;

public class AsyncDemo {
    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        String urlString = "http://horstmann.com";
        ExecutorService executor = Executors.newCachedThreadPool();
        HttpClient client = HttpClient.newBuilder()
                .executor(executor)
                .build();
        HttpRequest request
            = HttpRequest.newBuilder(new URI(urlString)).GET().build();
        client.sendAsync(request, BodyHandler.asString())
            .thenApply(HttpResponse::body)
            .whenComplete((s, t) -> {
                if (t == null) System.out.println(s);
                else t.printStackTrace();
                executor.shutdown();
            });
        executor.awaitTermination(10, TimeUnit.MINUTES);
    }
}
