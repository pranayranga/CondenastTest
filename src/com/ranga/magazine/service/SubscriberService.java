package com.ranga.magazine.service;

import com.ranga.magazine.model.Subscriber;
import com.ranga.magazine.repository.SubscriberRepository;

import java.util.Collections;
import java.util.List;

/**
 * Created by pranga on 8/26/14.
 */
public class SubscriberService {

	SubscriberRepository subscriberRepository;

	public List<Subscriber> getOrderedSubscriberByName(){
		List<Subscriber> subscriberList = subscriberRepository.getSubcribers();
		Collections.sort(subscriberList);
		return subscriberList;
	}

}
