package com.example.kafkaconsumerdatabase;

import com.example.kafkaconsumerdatabase.entity.RecentChange;
import com.example.kafkaconsumerdatabase.entity.WikimediaData;
import com.example.kafkaconsumerdatabase.repo.WikimediaDataRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @Autowired
    private WikimediaDataRepository wikimediaDataRepository;

    @Autowired
    private ObjectMapper objectMapper;


    @KafkaListener(topics = "wikimedia_recent_change", groupId = "myGroup")
    public void consume(String eventMessage) {
        logger.info("Event received. Message -> {}", eventMessage);
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);

        RecentChange recentChange = objectMapper.convertValue(eventMessage, RecentChange.class);

        logger.info("Recent change -> {}", recentChange);

        wikimediaDataRepository.save(wikimediaData);
    }

    public RecentChange convertJsonToRecentChange(String jsonString) throws Exception {
        return objectMapper.readValue(jsonString, RecentChange.class);
    }

}
