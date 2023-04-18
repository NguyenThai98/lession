package bigo.nguyenthai.algorithm.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Date: 4/7/2023<br/>
 * Time: 11:28 AM<br/>
 */
public class CompletableFuture9 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // A list of 100 web page links
        List<String> webPageLinks = Arrays.asList( //
                "https://www.google.com.vn/", "https://vnexpress.net/", "http://gpcoder.com/");

        // Download contents of all the web pages asynchronously
        List<CompletableFuture<String>> pageContentFutures = webPageLinks.stream()
                .map(webPageLink -> downloadWebPage(webPageLink)).collect(Collectors.toList());

        // Create a combined Future using allOf()
        CompletableFuture<Void> allFutures = CompletableFuture
                .allOf(pageContentFutures.toArray(new CompletableFuture[pageContentFutures.size()]));

        // When all the Futures are completed, call `future.join()` to get their results
        // and collect the results in a list
        CompletableFuture<List<String>> allPageContentsFuture = allFutures.thenApply(v -> {
            return pageContentFutures.stream().map(pageContentFuture -> pageContentFuture.join())
                    .collect(Collectors.toList());
        });

        // Count the number of web pages having the "CompletableFuture" keyword.
        CompletableFuture<List<String>> countFuture = allPageContentsFuture.thenApply(pageContents -> {
            return pageContents.stream().filter(pageContent -> pageContent.length() > 0).collect(Collectors.toList());
        });

        System.out.println("Number of Web Pages having CompletableFuture keyword: " + countFuture.get());
    }

    public static CompletableFuture<String> downloadWebPage(String pageLink) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Downloading: " + pageLink);
            try {
                if(pageLink.equals("https://www.google.com.vn/")){
                    TimeUnit.SECONDS.sleep(3);
                }else{
                    TimeUnit.SECONDS.sleep(1);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Code to download and return the web page's content
            return "CompletableFuture Completed";
        });
    }
}
