package com.rokin.annotation.football.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rokin.annotation.football.model.Player;

@RestController
@RequestMapping("/players")
public class PlayerController {

	@PostMapping
	public Player savePlayer(@RequestBody @Valid Player player) {
		return player;
	}
}
