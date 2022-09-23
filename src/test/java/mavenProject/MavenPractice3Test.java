package mavenProject;

import org.testng.annotations.Test;

public class MavenPractice3Test {
	
	@Test
	public void step1Test()
	{


	String browser=System.getProperty("br");
	String url=System.getProperty("ur");

	System.out.println("Browser name is====>"+browser);
	System.out.println("url is ===>"+url);
	

}
}
