package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.Revision;
import org.example.entities.Root;

public class Main {

    private static final String json = "{\"$schema\":\"/mediawiki/recentchange/1.0.0\",\"meta\":{\"uri\":\"https://commons.wikimedia.org/wiki/File:I-10_West_-_Exit_267AB_-_I-12_West_and_I-59_North_(41459849844).jpg\",\"request_id\":\"39a51c23-5e99-49a2-a2d6-aed70a393502\",\"id\":\"19e057b3-e72e-4928-8e6f-7ef2414739d4\",\"dt\":\"2024-09-14T14:34:25Z\",\"domain\":\"commons.wikimedia.org\",\"stream\":\"mediawiki.recentchange\",\"topic\":\"eqiad.mediawiki.recentchange\",\"partition\":0,\"offset\":5415419701},\"id\":2590297934,\"type\":\"edit\",\"namespace\":6,\"title\":\"File:I-10 West - Exit 267AB - I-12 West and I-59 North (41459849844).jpg\",\"title_url\":\"https://commons.wikimedia.org/wiki/File:I-10_West_-_Exit_267AB_-_I-12_West_and_I-59_North_(41459849844).jpg\",\"comment\":\"category created\",\"timestamp\":1726324465,\"user\":\"DanTD\",\"bot\":false,\"notify_url\":\"https://commons.wikimedia.org/w/index.php?diff=924070046&oldid=924069248&rcid=2590297934\",\"minor\":false,\"patrolled\":true,\"length\":{\"old\":11233,\"new\":11284},\"revision\":{\"old\":924069248,\"new\":924070046},\"server_url\":\"https://commons.wikimedia.org\",\"server_name\":\"commons.wikimedia.org\",\"server_script_path\":\"/w\",\"wiki\":\"commonswiki\",\"parsedcomment\":\"category created\"}";

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        Root recentChange = new Root();

        recentChange = objectMapper.convertValue(json, Root.class);

    }
}