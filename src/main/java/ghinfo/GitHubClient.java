package ghinfo;


import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.client.annotation.Client;

import java.util.List;
import java.util.Map;

@Client(value="https://api.github.com/", path="/orgs/micronaut-projects")
@Header(name = "User-Agent", value = "Micronaut Demo")
public interface GitHubClient {
    @Get("/repos?page={page}&per-page=100")
    List<Repository> repos(int page);
}
