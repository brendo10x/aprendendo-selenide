package testes;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
public class TesteSelenideElement {

	@Before
	public void abreAPaginaParaTeste() {
		open("http://localhost:8080/aprendendo-selenide/selenideElement.html");
	}

	@Test
	public void teste() {
		$("#btnEnviar").should(visible);
		$("#btnCancelar").shouldNot(visible);
		$(By.name("nome")).setValue("Brendo Felipe");
		selectRadio(By.name("sexo"), "Masculino");
		$(by("value", "Inglês")).click();
		$(By.id("vaga")).selectOptionByValue("Suporte de TI");
		assertEquals("Brendo Felipe", $(By.name("nome")).val());
		assertEquals(true, $("#btnEnviar").exists());
		assertEquals(false, $("#btnCancelar").isDisplayed());
		assertEquals("Masculino", getSelectedRadio(By.name("sexo")).val());
		assertEquals("Inglês", $(By.name("idioma")).val());
		assertEquals("Suporte de TI", $(By.id("vaga")).getSelectedValue());
		$("#btnEnviar").pressEnter();

	}
}
