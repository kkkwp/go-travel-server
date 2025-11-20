package com.travelers.gotravelserver.domain.flight;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travelers.gotravelserver.domain.flight.dto.FlightResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/flights")
public class FlightController {

	private final FlightService flightService;

	@GetMapping
	public List<FlightResponse> getFlightsByMonth(
		@RequestParam int year,
		@RequestParam int month
	) {
		return flightService.getFlightsByMonth(year, month);
	}
}
