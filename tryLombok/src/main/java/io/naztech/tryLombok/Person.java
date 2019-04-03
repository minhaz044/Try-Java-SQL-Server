package io.naztech.tryLombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {
	private String fname;
	private String lname;
	private String roll;

}
