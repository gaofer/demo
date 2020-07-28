package com.example.demo;

import org.elasticsearch.client.RestClient;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Resource
    private RestClient restClient;
    
//    @Test
//    public void createIndex() {
//        CreateIndexRequest request = new CreateIndexRequest("first_index");
//        try {
//            Response put = restClient.performRequest("GET", "/test2");
//            System.out.println(put.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void addDoc(){
//        String method = "PUT";
//        String endpoint = "/test/doc/2";
//        Project project=new Project();
//        project.setId(1);
//        project.setNature("123");
//        project.setProjectName("321");
//        project.setPlanValue("123");
//        project.setUnit("s");
//        String jsonStr = JSON.toJSONString(project);
//        // JSON格式字符串
//        HttpEntity entity = new NStringEntity(jsonStr, ContentType.APPLICATION_JSON);
//        Response response = null;
//        try {
//            response = restClient.performRequest(method, endpoint, Collections.emptyMap(), entity);
//            System.out.println(EntityUtils.toString(response.getEntity()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("新增文档结束");
//    }

}
