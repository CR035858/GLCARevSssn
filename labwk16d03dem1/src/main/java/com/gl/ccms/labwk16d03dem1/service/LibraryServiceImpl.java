package com.gl.ccms.labwk16d03dem1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.ccms.labwk16d03dem1.dao.LibrarySimulatorDao;
import com.gl.ccms.labwk16d03dem1.model.Library;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	LibrarySimulatorDao libraryDao;
	
	@Override
	public void addLibrarySvc(Library library) {
		// TODO Auto-generated method stub
		libraryDao.addLibrary(library);
		
	}

	@Override
	public List<Library> getAllLibraries() {
		// TODO Auto-generated method stub
		return libraryDao.getAllLibraries();
	}

	@Override
	public Library getLibraryById(int id) {
		// TODO Auto-generated method stub
		return libraryDao.getLibraryById(id);
	}

	@Override
	public void updateLibrary(int id, Library library) {
		// TODO Auto-generated method stub
		libraryDao.updateLibraryById(id, library);
	}

	@Override
	public void deleteLibraryById(int id) {
		// TODO Auto-generated method stub
		libraryDao.deleteLibraryById(id);
	}

}
