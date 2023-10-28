package com.jspiders.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.model.Movie;
import com.jspiders.repository.MovieRepo;

@Service
public class MovieService {
	@Autowired
	private MovieRepo mRepo;
	public String insertMovies(int mId, String mName, int mPrice) {
		mRepo.insertMovie(mId, mName, mPrice);
		return "Data inserted Successfully";
	}
	public List getMovies() {
		List<Movie> list = mRepo.getMovie();
		return list;
	}
	public String updateMovies(int mId, String mName, int mPrice) {
		mRepo.updateMovie(mId, mName, mPrice);
		return "Data Updated Successfully";
	} 
	public String deleteMovies(int mId) {
		mRepo.deleteMovie(mId);
		return "Data deleted Successfully";
	} 
}
