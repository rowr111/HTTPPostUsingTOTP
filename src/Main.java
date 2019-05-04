public class Main {
    public static void main(String[] args) {
/* 
* This code is a basic tool that will allow you to send a post with json content to the endpoint of your choice with:
* HTTP Basic Authentication:
* 	using a 10-digit time-based one time password (default, you can edit) conforming to RFC6238 TOTP
* 	using HMAC-SHA-512 (default, you can edit)
* This code will make your post using the username/shared secret/json you provided and write the output to the console.
* It uses the apache.commons and apache.http libraries, you must add these to your project before it will run.
* If you find this useful, follow me at https://github.com/rowr111 for more hacky/useful tools and other things!
 */
        //your username:
    	String username="test@test.com";
    	//to generate the password you need a shared secret, and then convert it into hex:
	    String seed = "hexgoeshere"; 
	    
	    String endpoint = "https://your.endpoint.com/blah";

	    //if your json isn't super basic, make it yourself and convert it to string and stick it here:
        String jsonData = "{insert your json here}";
        
        String pwLength = "10";
        //crypto choices are: HmacSHA1, HmacSHA256, HmacSHA512
        String crypto = "HmacSHA512";
        
        PostWithTOTP newRequest = new PostWithTOTP();
        newRequest.basicPost(endpoint, username, seed, jsonData, pwLength, crypto);
    }
}
