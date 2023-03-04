package eci;
import org.junit.Assert;
import org.junit.Test;
	
public class FizzBuzzPlusTest {
	@Test
	public void Should_ReturnFizz_When_NumberIsMultipleOfThree(){
		// Arrange
		FizzBuzzPlus sample = new FizzBuzzPlus();
		String expected = "Fizz";
		// Act
		String result = sample.validate(9);
		// Assert
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void Should_ReturnFizz_When_NumberContainsThree(){
		// Arrange
		FizzBuzzPlus sample = new FizzBuzzPlus();
		String expected = "Fizz";
		// Act
		String result = sample.validate(13);
		// Assert
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void Should_ReturnBuzz_When_NumberIsMultipleOfFive(){
		// Arrange
		FizzBuzzPlus sample = new FizzBuzzPlus();
		String expected = "Buzz";
		// Act
		String result = sample.validate(20);
		// Assert
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void Should_ReturnFizz_When_NumberContainsFive(){
		// Arrange
		FizzBuzzPlus sample = new FizzBuzzPlus();
		String expected = "FizzBuzz";
		// Act
		String result = sample.validate(57);
		// Assert
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void Should_ReturnFizzBuzz_When_NumberIsMultipleOfThreeAndFive(){
		// Arrange
		FizzBuzzPlus sample = new FizzBuzzPlus();
		String expected = "FizzBuzz";
		// Act
		String result = sample.validate(60);
		// Assert
		Assert.assertEquals(expected, result);
	}
	
}