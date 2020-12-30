package com.github.acme42.backend;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicelRestController {

	private static final Map<String, Set<String>> userVehicles = Map.of(
		"Sam Jones", new HashSet<>(List.of("Jupiter", "Merkur", "Juno")),
		"Penny Morris", new HashSet<>(List.of("Venus", "Neptun")),
		"Elvis Cridlington", new HashSet<>(List.of("Jupiter", "Venus")),
		"Norris Steele", new HashSet<>(List.of()),
		"Tom Thomas", new HashSet<>(List.of("Wallaby 1")),
		"Norman Price", new HashSet<>(List.of("Skateboard"))
	);
	
	@GetMapping("/list")
	public Set<String> listVehiclesOfUser(@RequestParam String user) {
		if (userVehicles.containsKey(user)) {
			return userVehicles.get(user);
		}
		return Set.of();
	}
	
	@PostMapping("/add")
	public void addVehicleForUser(@RequestParam String vehicle, @RequestParam String user) {
		if (!userVehicles.containsKey(user)) {
			userVehicles.put(user, new HashSet<String>());
		}
		userVehicles.get(user).add(vehicle);
	}
}
