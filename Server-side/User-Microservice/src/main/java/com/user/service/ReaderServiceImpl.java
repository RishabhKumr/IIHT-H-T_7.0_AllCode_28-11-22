package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Reader;
import com.user.repository.IReaderRepository;

@Service
public class ReaderServiceImpl implements IReaderService{
	
	@Autowired
	private IReaderRepository readerRepository;

	@Override
	public String createReader(Reader reader) {
		Reader addReader = null;
		try
		{
			addReader = readerRepository.save(reader);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return addReader.getReaderEmail();
	}

}
