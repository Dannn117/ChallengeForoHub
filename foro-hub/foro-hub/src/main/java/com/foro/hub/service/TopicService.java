package com.foro.hub.service;

import com.foro.hub.model.Topic;
import com.foro.hub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic createTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopicById(Long id) {
        return topicRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Tópico no encontrado con ID: " + id));
    }

    public Topic updateTopic(Long id, Topic updatedTopic) {
        Topic existingTopic = getTopicById(id);
        existingTopic.setTitle(updatedTopic.getTitle());
        existingTopic.setContent(updatedTopic.getContent());
        return topicRepository.save(existingTopic);
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}
