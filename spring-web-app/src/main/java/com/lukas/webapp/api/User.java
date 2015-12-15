package com.lukas.webapp.api;

import lombok.*;

@Data
@Builder
public class User {
	private String name;
	private String surname;
	private int age;
}
