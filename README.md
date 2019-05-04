# HTTP Post Using RFC6238 TOTP
This code is a basic tool that will allow you to send a post with json content to the endpoint of your choice with:
* HTTP Basic Authentication:
  * using a 10-digit time-based one time password (default, you can edit) conforming to RFC6238 TOTP
  * using HMAC-SHA-512 (default, you can edit)
* This code will make your post using the username/shared secret/json you provided and write the output to the console.
* It uses the apache.commons and apache.http libraries, you must add these to your project before it will run.
* If you find this useful, follow me at https://github.com/rowr111 for more hacky/useful tools and other things!
