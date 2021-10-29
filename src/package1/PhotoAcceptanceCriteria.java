package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotoAcceptanceCriteria 
{
	private  String findPhotoValidity(int l, int w, int h) {
		if((w>=l)&&(h>=l))
		{
			if(w==h)
			{
				return "ACCEPTED";
			}
			else
			{
				return "CROP IT";
			}
		}
		else
		{
			return "UPLOAD ANOTHER";
		}
	}
	
	@Test
	public void testCase1()
	{
		int length = 180, width = 210, height = 210;
		Assert.assertEquals(findPhotoValidity(length, width, height), "ACCEPTED");
		
	}
	
	@Test
	public void testCase2()
	{
		int length = 180, width = 100, height = 210;
		Assert.assertEquals(findPhotoValidity(length, width, height), "UPLOAD ANOTHER");
		
	}
	
	@Test
	public void testCase3()
	{
		int length = 180, width = 450, height = 210;
		Assert.assertEquals(findPhotoValidity(length, width, height), "CROP IT");
		
	}


}
