package com.travelers.gotravelserver.domain.flight.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;

@Builder
public record FlightResponse(
	Long id,
	Long locationId,
	String locationName,
	String flightNumber,
	String airline,
	LocalDate deptDate,
	LocalDateTime deptTime,
	LocalDateTime arrivalTime,
	BigDecimal price
) {
}
