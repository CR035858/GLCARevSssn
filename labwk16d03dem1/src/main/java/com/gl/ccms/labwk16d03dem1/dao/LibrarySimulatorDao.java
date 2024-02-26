package com.gl.ccms.labwk16d03dem1.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.ccms.labwk16d03dem1.model.Library;

@Repository
public class LibrarySimulatorDao {
	
	List <Library> libraries;
	
	public LibrarySimulatorDao()
	{
		libraries = new ArrayList<Library>();
		
		libraries.add(new Library(1,"Library1","Book11,Book22,Book33","Sociology","Publisher1"));
		libraries.add(new Library(2,"Library2","Book44,Book55,Book66","Psychology","Publisher2"));
		libraries.add(new Library(3,"Library3","Book1,Book2,Book3","Physical Science","Publisher3"));
		libraries.add(new Library(4,"Library4","Book4,Book5,Book6","Chemical Science","Publisher4"));
		libraries.add(new Library(5,"Library5","Book7,Book8,Book9","Biological Science","Publisher1"));
		libraries.add(new Library(6,"Library6","Book111,Book222,Book333","Trigonometry","Publisher2"));
		libraries.add(new Library(7,"Library7","Book10,Book20,Book30","Analytical Geometry","Publisher1"));
		libraries.add(new Library(8,"Library8","Book40,Book50,Book60","Algebra","Publisher2"));
	}
	
	public void addLibrary(Library library)
	{
		libraries.add(library);
	}
	
	public List <Library> getAllLibraries()
	{
		return libraries;
	}
	public Library getLibraryById(int id)
	{
		Iterator <Library> libIter = libraries.iterator();
		while(libIter.hasNext())
		{
			Library library = libIter.next();
			if(library.getId() == id)
			{
				return library;
			}
		}
		return null;
		
	}
	public void updateLibraryById(int id,Library library)
	{
		Iterator <Library> libIter = libraries.iterator();
		int idx = -1;
		Library libraryU = new Library();
		while(libIter.hasNext() && idx <= libraries.size())
		{
			
			libraryU = libIter.next();
			if(libraryU.getId() == id)
			{
				idx++;
				break;
				
			}
			idx++;
			
		}
		libraries.remove(idx);
		libraries.add(idx,library);
	}
	public void deleteLibraryById(int id)
	{
		Iterator <Library> libIter = libraries.iterator();
		Library libraryD = new Library();
		int idx = -1;
		while(libIter.hasNext() && idx <= libraries.size())
		{
				
			libraryD = libIter.next();
			if(libraryD.getId() == id)
			{
				idx++;
				break;
			}
			idx++;
		}
		libraries.remove(idx);
	}

}
