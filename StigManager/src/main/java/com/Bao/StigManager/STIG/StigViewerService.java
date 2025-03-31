package com.Bao.StigManager.STIG;

import com.Bao.StigManager.Checklist.Checklist;
import com.Bao.StigManager.Checklist.StigVul;
import com.Bao.StigManager.ComponentController;
import com.Bao.StigManager.Repositories.StigsViewerRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Iterator;


@Service
public class StigViewerService {
    private static final String STIG_URL = "https://cyber.trackr.live/api/stig";

    @Autowired
    private StigsViewerRepository stigsViewerRepository;
    Logger logger = LoggerFactory.getLogger(ComponentController.class);
    @PostConstruct
    public void fetchStigs() throws IOException, InterruptedException {
        List<StigViewerEntity> myStigList = new ArrayList<>();
        JsonNode jsonNode = getJsonNode(STIG_URL);
        Iterator<Entry<String, JsonNode>> stigs = jsonNode.fields();
        int count = 0;
        while (stigs.hasNext()) {
            Entry<String, JsonNode> myStig = stigs.next();
            String stigName = myStig.getKey();
            JsonNode stigInfoNode = myStig.getValue();

            if(stigInfoNode.isArray()) {
                for (JsonNode item : stigInfoNode) {
                    String version = item.get("version").asText();
                    String release = item.get("release").asText();
                    String link = item.get("link").asText();
//                    System.out.println("-------------------");
//                    System.out.println("Version: " + version);
//                    System.out.println("Release: " + release);
//                    System.out.println("Link: " + link);

                    StigViewerEntity stigEntity = new StigViewerEntity(++count, stigName, version,
                            release,link);
                    myStigList.add(stigEntity);
                    stigsViewerRepository.save(stigEntity);
                }
            }
        }


    }

    private static JsonNode getJsonNode(String url) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readTree(httpResponse.body());
    }

    public Checklist fetchStiglist(String link) throws IOException, InterruptedException{
        var stigUrl = "https://cyber.trackr.live/api"+link;

        JsonNode jsonNode = getJsonNode(stigUrl);
        String title = jsonNode.get("title").asText();
        String description = jsonNode.get("description").asText();
        String publishedDate = jsonNode.get("published").asText();
        logger.info(title);
        var stigVuls = new ArrayList<StigVul>();
        
        return new Checklist(title, description, publishedDate, stigVuls);
    }
}
