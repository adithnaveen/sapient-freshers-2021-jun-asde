package com.company.client;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.client.MongoClient;
import com.company.util.MongoUtil;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
	public static void main(String[] args) {
		MongoClient mc =  MongoUtil.mongoUtil(); 
	}

	
//	private static void connectionOldStyle() {
//		// by default look for localhost / 27017
//		MongoClient mongoClient = new MongoClient();
//		
//		log.info("Connection to DB :  {}", mongoClient.getConnectPoint());
//		log.info("List of DBS");
//		
//		for(String dbName : mongoClient.getDatabaseNames()) {
//			log.info(dbName);
//		}
//	}
}
