package com.github.acme42.backend;

import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicelRestController {

	private static final Map<String, Set<String>> userVehicles = Map.of(
		"Sam Jones", Set.of("Jupiter", "Merkur", "Juno"),
		"Penny Morris", Set.of("Venus", "Neptun"),
		"Elvis Cridlington", Set.of("Jupiter", "Venus"),
		"Norris Steele", Set.of(),
		"Tom Thomas", Set.of("Wallaby 1")
	);
	
	@GetMapping("/list")
	public Set<String> listVehiclesOfUser(@RequestParam String user) {
		if (userVehicles.containsKey(user)) {
			return userVehicles.get(user);
		}
		return Set.of();
	}
}
