package org.htmlToPdfDemo;

//import com.google.api.services.mybusiness.v4.MyBusiness;
//import com.google.api.services.mybusiness.v4.model.ListAccountsResponse;
//import com.google.api.services.mybusiness.v4.model.ListLocationsResponse;
//import com.google.api.services.mybusiness.v4.model.Location;
//
//import com.google.api.client.auth.oauth2.Credential;
//import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
//import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
//import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
//import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.http.HttpTransport;
//import com.google.api.client.json.jackson2.JacksonFactory;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.util.store.FileDataStoreFactory;
//
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.mybusiness.v4.MyBusiness;
import com.google.api.services.mybusiness.v4.model.Account;
import com.google.api.services.mybusiness.v4.model.ListAccountsResponse;
import com.google.api.services.mybusiness.v4.model.ListLocationsResponse;
import com.google.api.services.mybusiness.v4.model.ListReviewsResponse;
import com.google.api.services.mybusiness.v4.model.Location;
import com.google.api.services.mybusiness.v4.model.Review;
import Review
//import com.google.api.services.mybusinessaccountmanagement.v1.*;
//
//import com.google.api.client.auth.oauth2.Credential;
//import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
//import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
//import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
//import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.http.HttpTransport;
//import com.google.api.client.json.jackson2.JacksonFactory;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.util.store.FileDataStoreFactory;

//import com.google.api.services.mybusinessaccountmanagement.v1.MyBusinessAccountManagement;
//import com.google.api.services.mybusinessaccountmanagement.v1.model.ListAccountsResponse;

//
//import java.io.InputStream;
//import java.io.InputStreamReader;
//
//import java.util.Collections;
//import java.util.List;
//
import java.util.List;

public class ListReviews {
    /**
     * Returns a list of reviews.
     * @param locationName Name of the location to retrieve reviews for.
     * @return List<Reviews> A list of reviews.
     * @throws Exception
     */
    public static List<Review> listReviews(String locationName) throws Exception {
        Mybusiness.Accounts.Locations.Reviews.List reviewsList =
                mybusiness.accounts().locations().reviews().list(locationName);
        ListReviewsResponse response = accountsList.execute();
        List<Reviews> reviews = response.getReviews();

        for (Reviews review : reviews) {
            System.out.println(review.toPrettyString());
        }
        return reviews;
    }
}