package com.firstboot.KaranDemo.controller.Topic;

import com.firstboot.KaranDemo.model.Topic;
import com.firstboot.KaranDemo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> topic(){
        return topicService.getTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/topic")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
}
