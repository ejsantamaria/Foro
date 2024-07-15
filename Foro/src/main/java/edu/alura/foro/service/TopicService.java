package edu.alura.foro.service;

import edu.alura.foro.entity.Topic;
import edu.alura.foro.repository.ITopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    ITopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        return topicRepository.findAll();
    }

    public Topic getTopicById(long id){
        return topicRepository.getOne(id);
    }

    public Topic addTopic(Topic topic){
        return topicRepository.save(topic);
    }

    public Topic updateTopic(Topic topic){
        return topicRepository.save(topic);
    }

    public void deleteTopic(long id){
        topicRepository.deleteById(id);
    }
}
