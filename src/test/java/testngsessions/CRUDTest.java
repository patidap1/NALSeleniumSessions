package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {

	// create - get - update - delete
	// AAA ==> Arrange -- Act -- Assertion

	public int createUser() {
		System.out.println("create user");
		return 100;
	}

	public String getUserInfo(int userId) {
		return "user info";
	}

	public String updateUserInfo(int userId) {
		return "updated user info";
	}

	public String deleteUserInfo(int userId) {
		return "user is not found 404 error";
	}

	@Test
	public void createUserTest() {
		int userId = createUser();
		Assert.assertEquals(userId, 100);
	}

	@Test
	public void getUserTest() {
		//create ==> userId ==> getUserId(userId)
		int userId = createUser();
		String userInfo = getUserInfo(userId);
		Assert.assertEquals(userInfo, "user info");
	}

	@Test
	public void updateUserTest() {
		//Create -> userId -> updateUser(userId) --> getUser(userId)
		int userId = createUser();
		String updatedInfo = updateUserInfo(userId);
		String userInfo = getUserInfo(userId);
		Assert.assertTrue(userInfo.contains(userInfo));

	}

	@Test
	public void deleteUserTest() {
		//create -> userId ->
		int userId = createUser();
		String mesg = deleteUserInfo(userId);
		Assert.assertTrue(mesg.contains("404"));
	}
}
