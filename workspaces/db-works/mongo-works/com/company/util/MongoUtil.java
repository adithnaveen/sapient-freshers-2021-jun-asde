package com.company.util;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.util.Arrays;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.company.entity.Employee;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoUtil {
	private MongoUtil() {
	}

	public static MongoClient mongoUtil() {
	

		return MongoClients.create(
		        MongoClientSettings.builder()
		                .applyToClusterSettings(builder ->
		                        builder.hosts(Arrays.asList(new ServerAddress("localhost", 27017))))
		                .build());
	}


	public static MongoClient mongoUtil(String host, int port ) {
	

		return MongoClients.create(
		        MongoClientSettings.builder()
		                .applyToClusterSettings(builder ->
		                        builder.hosts(Arrays.asList(new ServerAddress(host, port))))
		                .build());
	}
	
	
	public static MongoClient mongoUtilCodedRegistray() {
		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		
		MongoClientSettings settings = MongoClientSettings.builder()
		        .codecRegistry(pojoCodecRegistry)
		        .build(); 
		
		return MongoClients.create(settings);
	}
	
	public static MongoCollection getCollectionFromDB(String db, String collection, Class clss) {

		MongoDatabase database = mongoUtil().getDatabase(db); 
		return  database.getCollection(collection, clss);
	}
}

















