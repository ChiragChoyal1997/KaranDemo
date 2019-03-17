package com.firstboot.KaranDemo.service;

import com.firstboot.KaranDemo.Repository.TopicRepository;
import com.firstboot.KaranDemo.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("spring","spring framework","toughest java framework"),
            new Topic("django","python django framework","coll thing to learn")
    ));

    public List<Topic> getTopics(){
        List<Topic> l=new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return l;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }
}
