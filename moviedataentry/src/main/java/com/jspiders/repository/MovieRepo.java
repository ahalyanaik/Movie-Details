package com.jspiders.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.model.Movie;

@Repository
public class MovieRepo {
	@Autowired
	private Movie movie;
	Session session;
	Transaction trans;
	public void config() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Movie.class);
		SessionFactory sf = cfg.buildSessionFactory();
		session = sf.openSession();
		trans = session.beginTransaction();
	}
	public void insertMovie(int mId, String mName, int mPrice) {
		movie.setmId(mId);
		movie.setmName(mName);
		movie.setmPrice(mPrice);
		config();
		session.save(movie);
		trans.commit();
		session.close();
	}
	public List getMovie() {
		config();
		Query query = session.createQuery("from Movie");
		List<Movie> list = query.list();
		trans.commit();
		session.close();
		return list;
	}
	public void updateMovie(int mId, String mName, int mPrice) {
		config();
		Movie movie = session.get(Movie.class, mId);
		movie.setmName(mName);
		movie.setmPrice(mPrice);
		session.update(movie);
		trans.commit();
		session.close();
	}
	public void deleteMovie(int mId) {
		config();
		Movie m = session.get(Movie.class, mId);
		session.delete(m);
		trans.commit();
		session.close();
	}
}
