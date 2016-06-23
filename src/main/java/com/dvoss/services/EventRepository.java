package com.dvoss.services;

import com.dvoss.entities.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dan on 6/23/16.
 */
public interface EventRepository extends CrudRepository<Event, Integer> {
}
