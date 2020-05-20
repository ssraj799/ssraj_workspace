package com.staxrt.tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type User controller.
 *
 * @author Vamsi
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {

	@RequestMapping(value = "/conversions/ctok/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> getCelciusToKelvin(@PathVariable(value = "id") String sCelcius) throws Exception {
		System.out.println("getCelciusToKelvin");

		System.out.println("Temperature in Degree Celsius:" + sCelcius);
		float celsius = Float.parseFloat(sCelcius);
		float kelvin = celsius + 273.15F;
		System.out.println("Kelvin: " + kelvin);
		return ResponseEntity.ok().body("Temperature in Celcius:=" + sCelcius + " equivalent in Kelvin :" + kelvin);
	}

	@RequestMapping(value = "/conversions/ktoc/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> getKelvinToCelcius(@PathVariable(value = "id") String sKelvin) throws Exception {
		System.out.println("Temperature in kelvin:" + sKelvin);
		float kelvin = Float.parseFloat(sKelvin);
		float celsius = kelvin - 273.15F;
		System.out.println("Celsius: " + celsius);
		return ResponseEntity.ok().body("Temperature in Kelvin :" + sKelvin + " equivalent in Celcius : " + celsius);
	}

	@RequestMapping(value = "/conversions/mtok/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> getMilesToKiloMeter(@PathVariable(value = "id") String sMiles) throws Exception {
		System.out.println("Miles:" + sMiles);
		double miles = Double.valueOf(sMiles);
		double kilometers = miles * 1.6;
		System.out.println("Kilometers: " + kilometers);
		return ResponseEntity.ok().body("Distance in Miles :" + miles + " equivalent in Kilometers: " + kilometers);
	}

	@RequestMapping(value = "/conversions/ktom/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> getKiloMeterToMiles(@PathVariable(value = "id") String sKM) throws Exception {
		System.out.println("kilometers:" + sKM);

		double kilometers = Double.valueOf(sKM);

		double miles = kilometers / 1.6;
		System.out.println("miles: " + miles);
		return ResponseEntity.ok().body("Distance in Kilometers :" + kilometers + " equivalent in Miles: " + miles);
	}
}
