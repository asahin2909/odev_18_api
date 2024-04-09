package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BookStoreAPITest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://demoqa.com";
    }

    @Test
    public void testDeleteBook() {
        given()
                .when()
                .delete("/BookStore/BookStore/v1/BookDelete/1") // Silinecek kitabın ID'sini belirtin
                .then()
                .statusCode(204); // No content döndürmesi beklenir (başarılı silme)
    }
}
