package scenarios;

import org.junit.Before;
import org.junit.Test;

import pages.PrincipalPage;

public class ContextMenu extends BaseTest {
	private PrincipalPage principalpage;

	@Before
	public void beforetest() {
		principalpage = new PrincipalPage(driver);
	}

	@Test
	public void test() throws Exception {
		principalpage.navegar("https://the-internet.herokuapp.com/");
		principalpage.selecionarMenu("Context Menu");
		principalpage.rightClickBox();
		principalpage.confirmAlert();
	}
}
