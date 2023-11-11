# Weather Monitoring System

## Overview

This project implements a Weather Monitoring System, featuring RESTful APIs for managing measurements and sensor registrations. It provides endpoints to add new measurements, retrieve all measurements, count rainy days, and register new sensors.

## Technologies Used

- Java
- Spring Boot
- ModelMapper
- Hibernate Validator

## API Structure

### Measurement Controller

#### Endpoints

- **Add Measurement:** `POST /measurements/add`
  - Adds a new measurement based on the provided data.
  - Validates the input using Hibernate Validator and a custom MeasurementValidator.
  - Handles errors gracefully and returns appropriate error responses.

- **Get All Measurements:** `GET /measurements`
  - Retrieves all measurements and converts them to a list of MeasurementDTOs.

- **Get Rainy Days Count:** `GET /measurements/rainyDaysCount`
  - Counts the number of rainy days among all measurements.

#### Error Handling

- Custom exception handling using `@ExceptionHandler`.
- Returns standardized ErrorResponse in case of MeasurementException.

### Sensor Controller

#### Endpoints

- **Sensor Registration:** `POST /sensors/registration`
  - Registers a new sensor based on the provided sensor data.
  - Validates the input using Hibernate Validator and a custom SensorValidator.
  - Handles errors gracefully and returns appropriate error responses.

#### Error Handling

- Custom exception handling using `@ExceptionHandler`.
- Returns standardized ErrorResponse in case of MeasurementException.

## Setup and Usage

1. Clone the repository.
2. Configure the database settings in the application.properties file.
3. Build and run the application.
4. Use the provided endpoints for adding measurements, retrieving data, and sensor registration.

## Dependencies

- Spring Boot: Used for building and running the application.
- ModelMapper: Facilitates object mapping between DTOs and entities.
- Hibernate Validator: Ensures data integrity through input validation.