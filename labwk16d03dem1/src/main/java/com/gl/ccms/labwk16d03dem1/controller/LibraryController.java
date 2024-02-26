package com.gl.ccms.labwk16d03dem1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.ccms.labwk16d03dem1.model.Library;
import com.gl.ccms.labwk16d03dem1.service.LibraryService;

@RestController
@RequestMapping("/libraries")
public class LibraryController {
	
	@Autowired
	LibraryService libraryService;
	
	@GetMapping(value="/allLibraries")
	public List <Library> getAllLibraries()
	{
		return libraryService.getAllLibraries();
	}
	
	@GetMapping(value="/allLibraries/{libId}")
	public Library getLibraryById(@PathVariable int libId)
	{
		return libraryService.getLibraryById(libId);
	}
	
	@PostMapping(value="/allLibraries")
	public String addLibrary(@RequestBody Library library)
	{
		libraryService.addLibrarySvc(library);
		return "Library Addedd Successfully...";
	}
	
	@PutMapping(value="/allLibraries")
	public String updateLibrary(@RequestBody Library library,@RequestParam int id)
	{
		libraryService.updateLibrary(id, library);
		return "Library Updated Successfully...";
	}
	
	@DeleteMapping(value="/allLibraries/{libId}")
	public String deleteLibraryById(@PathVariable int libId)
	{
		libraryService.deleteLibraryById(libId);
		return "Library Deleted Successfully";
	}
	

}
