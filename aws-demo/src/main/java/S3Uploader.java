import java.nio.file.Paths;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.CreateBucketRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

public class S3Uploader {

	public static void main(String[] args) {

		S3Client s3 = S3Client.create();
		String bucket = "synex-24102025";
		String key = "test.png";
		System.out.println(s3.listBuckets());
		
		s3.createBucket(CreateBucketRequest.builder().bucket(bucket).build());
		s3.putObject(PutObjectRequest.builder().bucket(bucket).key(key)
					.build(),
				RequestBody.fromFile(Paths.get("D:\\Synergy\\Demos\\s3\\test.png")));
		
		System.out.println("Image uploaded");
	}

}
