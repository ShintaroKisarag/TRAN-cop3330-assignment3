package ex43;

import junit.framework.TestCase;

public class WebsiteGeneratorTest extends TestCase {

    public void testWebsite() {
            WebsiteGenerator websiteGenerator = new WebsiteGenerator();
            websiteGenerator.path = "src/main/java/";
            websiteGenerator.site = "testwebsite.com";
            websiteGenerator.author = "Phi-Hung Tran";
        }

    public void testJSFolder() {
        WebsiteGenerator websiteGenerator = new WebsiteGenerator();
        websiteGenerator.path = "src/main/java/";
        websiteGenerator.site = "testwebsite.com";
        websiteGenerator.author = "Phi-Hung Tran";
        String expected = "src/main/java/testwebsite.com/js";
        String actual = websiteGenerator.JSFolder();
        assertEquals(expected,actual);
    }

    public void testCSSFolder() {
        WebsiteGenerator websiteGenerator = new WebsiteGenerator();
        websiteGenerator.path = "src/main/java/";
        websiteGenerator.site = "testwebsite.com";
        websiteGenerator.author = "Phi-Hung Tran";
        String expected = "src/main/java/testwebsite.com/css";
        String actual = websiteGenerator.CSSFolder();
        assertEquals(expected,actual);
    }

    public void testHTML() {
        WebsiteGenerator websiteGenerator = new WebsiteGenerator();
        websiteGenerator.path = "src/main/java/";
        websiteGenerator.site = "testwebsite.com";
        websiteGenerator.author = "Phi-Hung Tran";
        String expected = "src/main/java/testwebsite.com/index.html";
        String actual = websiteGenerator.HTML();
        assertEquals(expected,actual);
    }
}