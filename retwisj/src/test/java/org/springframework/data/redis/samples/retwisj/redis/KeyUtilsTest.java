package org.springframework.data.redis.samples.retwisj.redis;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class KeyUtilsTest {

	private String UID;
	
	@Before
	public void initKeyUtils() {
		UID = "test";
	}
	
	@Test
	public void testFollowing() {
		assertEquals(KeyUtils.following(UID), "uid:"+UID+":following");
	}
	
	@Test
	public void testFollowers() {
		assertEquals(KeyUtils.followers(UID), "uid:"+UID+":followers");
	}
	
	@Test
	public void testTimeline() {
		assertEquals(KeyUtils.timeline(UID), "uid:"+UID+":timeline");
	}
	
	@Test
	public void testMentions() {
		assertEquals(KeyUtils.mentions(UID),  "uid:"+UID+":mentions");
	}
	
	@Test
	public void testPosts() {
		assertEquals(KeyUtils.posts(UID),  "uid:"+UID+":posts");
	}
	
	@Test
	public void testAuth() {
		assertEquals(KeyUtils.auth(UID),  "uid:"+UID+":auth");
	}
	
	@Test
	public void testUid() {
		assertEquals(KeyUtils.uid(UID),  "uid:"+UID);
	}
	
	@Test
	public void testPost() {
		assertEquals(KeyUtils.post(UID),  "pid:" + UID);
	}
	
	@Test
	public void testAuthKey() {
		assertEquals(KeyUtils.authKey(UID), "auth:" + UID);
	}
	
	@Test
	public void testUser() {
		assertEquals(KeyUtils.user(UID), "user:" + UID + ":uid");
	}
	
	
}
