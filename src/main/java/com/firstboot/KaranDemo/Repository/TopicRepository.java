package com.firstboot.KaranDemo.Repository;

import com.firstboot.KaranDemo.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
