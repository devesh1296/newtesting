package com.amdocs.bdd;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	Calculator calculator;
	private double result;
	@Given("The calculator to perform addition")
	public void the_calculator_to_perform_addition() {
		calculator= new Calculator();
	}

	@When("The input is {string} and {string}")
	public void the_input_is_and(String first, String second) {
		result= calculator.addition(Double.parseDouble(first), Double.parseDouble(second));
	}

	@Then("the output is {string}")
	public void the_output_is(String expectedResult) {
		assertEquals(Double.parseDouble(expectedResult),result,0.001);
	}
	@Given("The calculator to perform subtraction")
	public void the_calculator_to_perform_subtraction() {
		calculator= new Calculator();
	}

	@When("The provided input is {string} and {string}")
	public void the_provided_input_is_and(String first, String second) {
		result= calculator.subtraction(Double.parseDouble(first), Double.parseDouble(second));
	}

	@Then("the output we got is {string}")
	public void the_output_we_got_is(String expectedResult) {
		assertEquals(Double.parseDouble(expectedResult),result,0.001);
	}

	@Given("The calculator to perform multiplication")
	public void the_calculator_to_perform_multiplication() {
		calculator= new Calculator();
	}

	@When("The input are {string} and {string}")
	public void the_input_are_and(String first, String second) {
		result= calculator.multiplication(Double.parseDouble(first), Double.parseDouble(second));
	}

	@Then("the output that we get is  {string}")
	public void the_output_that_we_get_is(String expectedResult) {
		assertEquals(Double.parseDouble(expectedResult),result,0.001);
	}

	@Given("The calculator to perform Division")
	public void the_calculator_to_perform_Division() {
		calculator= new Calculator();
	}

	@When("The input been given are{string} and {string}")
	public void the_input_been_given_are_and(String first, String second) {
		result= calculator.division(Double.parseDouble(first), Double.parseDouble(second));
	}

	@Then("the output is showing {string}")
	public void the_output_is_showing(String expectedResult) {
		assertEquals(Double.parseDouble(expectedResult),result,0.001);
	}

}
