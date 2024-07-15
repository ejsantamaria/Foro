package edu.alura.foro.controller;

import edu.alura.foro.entity.Topic;
import edu.alura.foro.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping("topic/{id}")
    public Topic getTopicService(@PathVariable("id") long id) {
        return topicService.getTopicById(id);
    }

    @GetMapping("topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @PostMapping("topic")
    public Topic createTopic(@RequestBody Topic topic) {
        return topicService.addTopic(topic);
    }

    @PutMapping("topic")
    public Topic updateTopic(@RequestBody Topic topic) {
        return topicService.updateTopic(topic);
    }

    @DeleteMapping("topic/{id}")
    public void deleteTopic(@PathVariable("id") long id) {
        topicService.deleteTopic(id);
    }
}
