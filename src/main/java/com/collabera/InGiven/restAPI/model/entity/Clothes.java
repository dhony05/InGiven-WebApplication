package com.collabera.InGiven.restAPI.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clothes")
public class Clothes {
	
			@Id
		@Column(name="id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private long id;
		
		@Column(name = "style")
		private String style;
		
		@Column(name = "size")
		private String size;
		
		@Column (name = "color")
		private String color;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getStyle() {
			return style;
		}

		public void setStyle(String style) {
			this.style = style;
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		
	}
