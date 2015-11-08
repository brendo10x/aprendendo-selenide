package testes;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TesteCondition {
	@Before
	public void abreAPaginaParaTeste() {
		open("http://localhost:8080/aprendendo-selenide/condition.html");
	}
	
	@Test
	public void testeConditionFormulario(){
		$(By.id("meuFormulario")).should(visible); 
		$(By.id("meuFormulario")).should(exist); 
		$(By.id("meuFormulario")).shouldNot(hidden); 
		$(By.id("nome")).should(readonly);
		$(By.id("nome")).should(attribute("value"));
		$(By.id("nome")).should(name("nome"));
		$(By.id("nome")).should(value("Brendão"));
		$(By.id("nome")).should(type("text"));
		$(By.id("nome")).should(id("nome"));
		$(By.id("rodape")).should(empty); 
		$(By.id("rodape")).should(cssClass("estilo_rodape"));
		$(By.id("email")).should(focused);
		$(By.id("email")).should(enabled);
		$(By.id("email")).shouldNot(disabled);
		$(By.id("meuParagrafo")).should(textCaseSensitive("Meu texto"));
		
	}
}
