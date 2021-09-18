import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit {
    SimhashTest simhashTest = null;
    @Before
    public void init(){
        simhashTest = new SimhashTest();
    }
    @Test
    public void testClean(){
        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>测试过滤";
        html = simhashTest.cleanWords(html);
        System.out.println(html);
    }

    @Test
    public void testSimHash(){
        String content1 = "今天是星期天，天气晴，今天晚上我要去看电影";
        System.out.println(simhashTest.simHash(content1));
        String content2 = "今天是周天，天气晴朗，我晚上要去看电影。";
        System.out.println(simhashTest.simHash(content2));
    }

    @Test
    public void testCompare(){
        String content1 = "今天是星期天，天气晴，今天晚上我要去看电影";
        String content2 = "今天是周天，天气晴朗，我晚上要去看电影。";
        String result = simhashTest.compare(content1,content2);
        System.out.println( result);
    }

    @Test
    public void testException(){

    }
}