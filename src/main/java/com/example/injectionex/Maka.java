package com.example.injectionex;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Entity(name="maka")
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Maka {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id = 1;

	@Column
	private String name = "Caca";
}
