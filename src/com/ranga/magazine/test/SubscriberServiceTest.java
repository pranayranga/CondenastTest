package com.ranga.magazine.test;

import com.ranga.magazine.model.Subscriber;
import com.ranga.magazine.repository.SubscriberRepository;
import com.ranga.magazine.service.SubscriberService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pranga on 8/26/14.
 */
public class SubscriberServiceTest {

	@Mock
	private SubscriberRepository subscriberRepository;

	@InjectMocks
	private SubscriberService subscriberService = new SubscriberService();

	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void subscriberServiceTest(){
		Mockito.when(subscriberRepository.getSubcribers()).thenReturn(getSubscriberList());
		List<Subscriber> subscriberList = subscriberService.getOrderedSubscriberByName();
		Assert.assertNotNull(subscriberList);

		Assert.assertNotNull("john",subscriberList.get(0).getLastName());
		Assert.assertNotNull("owens",subscriberList.get(1).getLastName());
		Assert.assertNotNull("ranga",subscriberList.get(2).getLastName());
		Assert.assertNotNull("ranga",subscriberList.get(3).getLastName());

		Assert.assertNotNull("john",subscriberList.get(0).getFirstName());
		Assert.assertNotNull("steve",subscriberList.get(1).getFirstName());
		Assert.assertNotNull("pranay",subscriberList.get(2).getFirstName());
		Assert.assertNotNull("ranay",subscriberList.get(3).getFirstName());
	}

	private List<Subscriber> getSubscriberList() {
		List<Subscriber> subscriberList = new ArrayList<Subscriber>();
		subscriberList.add(new Subscriber("pranay","ranga"));
		subscriberList.add(new Subscriber("ranay","ranga"));
		subscriberList.add(new Subscriber("john","john"));
		subscriberList.add(new Subscriber("steve","owens"));
		return subscriberList;
	}

}
