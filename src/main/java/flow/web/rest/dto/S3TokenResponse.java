package flow.web.rest.dto;

import com.amazonaws.auth.BasicSessionCredentials;

public class S3TokenResponse {

	private String secretKey;
	private String accessKey;
	private String sessionToken;
	private String s3Bucket;
	
	public S3TokenResponse(BasicSessionCredentials credentials, String s3Bucket){
		this.secretKey = credentials.getAWSSecretKey();
		this.accessKey = credentials.getAWSAccessKeyId();
		this.sessionToken = credentials.getSessionToken();
		this.s3Bucket = s3Bucket;
	}
		
	public String getSecretKey(){
		return secretKey;
	}
	
	public String getAccessKey(){
		return accessKey;
	}
	
	public String getS3Bucket(){
		return s3Bucket;
	}
	
	public void setS3Bucket(String s3Bucket){
		this.s3Bucket = s3Bucket;
	}
	
	public String getSessionToken(){
		return sessionToken;
	}
}
