package org.springsolrdata.demo.springsolrdata_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springsolrdata.repository.BookRepository;

import com.springsolrdata.document.Book;

public class SpringDataSolrDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"Config.xml");
		BookRepository bookRepo = context.getBean(BookRepository.class);

		Book wish = new Book();
		wish.setId("5");
		wish.setTitle("Souro is Wining");
		wish.setDescription("He wants to have a PHD on his name before he die.");
		bookRepo.save(wish);

		System.out.println(bookRepo.findOne(5l)); /* Searching by Id */
		System.out.println(bookRepo.findByBookTitle("Souro")); /* Searching by Title */ 

		context.close();
	}
}
