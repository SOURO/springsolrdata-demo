package com.springsolrdata.document;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

public class Book {
	@Id
	@Field
	private String id;

	@Field
	private String title;

	@Field
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
