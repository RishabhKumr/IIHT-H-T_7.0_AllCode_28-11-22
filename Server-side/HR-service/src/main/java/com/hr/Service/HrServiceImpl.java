package com.hr.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.Entity.HR;

@Service
public class HrServiceImpl implements IhrService{
	
	//Fake HR list
	List<HR> list = List.of(
			new HR(1001L,"vivek","12345"),
			new HR(1002L,"rishabh","123465"),
			new HR(1003L,"vaishali","12345654"),
			new HR(1004L,"vikram","12365445"),
			new HR(1005L,"vishal","123454"));

	@Override
	public HR getHR(Long id) {
		return list.stream().filter(hr -> hr.getUserId().equals(id)).findAny().orElse(null);
	}

}
