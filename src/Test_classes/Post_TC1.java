package Test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common_API_method.Post_API_method;
import RequestRepositry.post_req_repository;
import comman_Api_method.API_method;
import io.restassured.path.json.JsonPath;

public class Post_TC1 {
	@Test
	public static void extractor() throws IOException {
		int statuscode=Post_API_method.responseStatusCode(post_req_repository.baseURI(), post_req_repository.Post_Resourse(), post_req_repository.Post_Req_TC1());
		System.out.println(statuscode);
		String ResponseBody = Post_API_method.ResponseBody(post_req_repository.baseURI(), post_req_repository.Post_Resourse(), post_req_repository.Post_Req_TC1());
		System.out.println(ResponseBody);
		
		JsonPath jspresponse = new JsonPath(ResponseBody);
		String Res_name = jspresponse.getString("name");
		
				
		Assert.assertEquals(Res_name, "Rushali");
		
		
		
	}
	

}



