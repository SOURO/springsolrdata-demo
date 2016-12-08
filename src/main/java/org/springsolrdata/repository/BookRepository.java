package org.springsolrdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.solr.repository.Query;

import com.springsolrdata.document.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	@Query("title:?0")
	public Book findByBookTitle(String name);

}
