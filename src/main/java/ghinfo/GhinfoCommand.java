package ghinfo;

import io.micronaut.configuration.picocli.PicocliRunner;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;

import java.util.List;

@Command(name = "ghinfo", description = "...",
        mixinStandardHelpOptions = true)
public class GhinfoCommand implements Runnable {

    @Inject
    GitHubClient gitHubClient;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(GhinfoCommand.class, args);
    }

    public void run() {

        // error handling omitted
        int page = 1;
        while (true) {
            List<Repository> repos = gitHubClient.repos(page++);

            // pagination hack
            if (repos.size() == 0) break;

            repos.stream().forEach(System.out::println);
        }
    }
}
