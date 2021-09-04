/**
 * 
 */
package mx.tec.web.lab.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author sebas
 *
 */
public class ColorValidator implements ConstraintValidator<ValidColor, String> {
	private final List<String> validColors = Arrays.asList("negro", "azul claro" , "azul mar", "dark stonewash", "black");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		for(String validColor: validColors) { 
			
			if (validColor.equalsIgnoreCase(value)) {
				return true;
			}	
		}
		return false;
	}
	

}
