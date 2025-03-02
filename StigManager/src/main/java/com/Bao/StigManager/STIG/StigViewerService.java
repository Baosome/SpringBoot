package com.Bao.StigManager.STIG;

import com.Bao.StigManager.Repositories.StigsViewerRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Iterator;



@Service
public class StigViewerService {
    private static final String STIG_URL = "https://cyber.trackr.live/api/stig";

    @Autowired
    private StigsViewerRepository stigsViewerRepository;

    @PostConstruct
    public void fetchStigs() throws IOException, InterruptedException {
        List<StigViewerEntity> myStigList = new ArrayList<>();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(STIG_URL))
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(httpResponse.body());

        Iterator<Entry<String, JsonNode>> stigs = jsonNode.fields();
        int count = 0;
        while (stigs.hasNext()) {
            Entry<String, JsonNode> myStig = stigs.next();
            String stigName = myStig.getKey();
            JsonNode stigInfoNode = myStig.getValue();

            if(stigInfoNode.isArray()) {
                for (JsonNode item : stigInfoNode) {
                    String date = item.get("date").asText();
                    String released = item.get("released").asText();
                    String version = item.get("version").asText();
                    String release = item.get("release").asText();
                    String link = item.get("link").asText();

//                    System.out.println("-------------------");
//                    System.out.println("Date: " + date);
//                    System.out.println("Released: " + released);
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
}
