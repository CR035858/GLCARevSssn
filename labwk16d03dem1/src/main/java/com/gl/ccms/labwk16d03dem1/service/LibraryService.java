package com.gl.ccms.labwk16d03dem1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.ccms.labwk16d03dem1.model.Library;

@Service
public interface LibraryService {

	public void addLibrarySvc(Library library);
	public List <Library> getAllLibraries();
	public Library getLibraryById(int id);
	public void updateLibrary(int id,Library library);
	public void deleteLibraryById(int id);
	
	
}
