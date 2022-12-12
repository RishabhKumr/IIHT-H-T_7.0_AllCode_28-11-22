package com.resource.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.resource.entity.Resource;

@Service
public class ResourceServiceImpl  implements IResourceService{
	
	List<Resource> list = List.of(
			new Resource(1L,"peter@gmil.com","peter","dev",1001L));

	@Override
	public List<Resource> getResourceForUsers(Long userID) {
		return list.stream().filter(resource -> resource.getUserID().equals(userID)).collect(Collectors.toList());
	}

}
