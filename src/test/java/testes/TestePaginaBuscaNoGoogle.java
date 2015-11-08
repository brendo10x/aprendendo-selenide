package testes;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.codeborne.selenide.junit.ScreenShooter;

public class TestePaginaBuscaNoGoogle {

	@Rule
	public final ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests();

	@Before
	public void abreAPaginaParaTeste() {
		open("https://www.google.com.br/");
	}

	@Test
	public void testeScreenShooterComFalha() throws InterruptedException {
		$("#lst-ib").val("Brendo Felipe").pressEnter();
		$$("#search").shouldHave(texts("Brendo Felipe | Facebook tal"));

	}
}
