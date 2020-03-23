package com.cp.onlinemovieticketsystem.dto;

import java.math.BigInteger;

public class Movie {
	String movieName;
	long movieId;
	String movieGenre;
    long movieLength;
	String languages;
	public Movie(String movieName,long movieId,String movieGenre,long movieLength,String languages)
	{
		this.movieName=movieName;
		this.movieId=movieId;
		this.movieGenre=movieGenre;
		this.movieLength=movieLength;
		this.languages=languages;
		
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public long getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(long movieLength) {
		this.movieLength = movieLength;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}

}
