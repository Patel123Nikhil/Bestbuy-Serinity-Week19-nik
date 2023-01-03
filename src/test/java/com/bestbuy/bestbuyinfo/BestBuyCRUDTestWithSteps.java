package com.bestbuy.bestbuyinfo;

import com.bestbuy.constants.EndPoints;
import com.bestbuy.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

public class BestBuyCRUDTestWithSteps extends TestBase {

    /*static String name = "Duracell - AA 1.5V CopperTop Batteries (4-Pack)" + TestUtils.getRandomName();
    static String type = "HardGood" + TestUtils.getRandomName();
    static Double price = 5.49;
    static Integer shipping = 0;
    static String upc = "041333415017";
    static String description = "Long-lasting energy DURALOCK";
    static String manufacturer = "Duracell";
    static String model = "MN1500B4Z";
    static String url = "http://www.bestbuy.com/site/duracell-aa-1-5v-coppertop-batteries-4-pack/48530.p?id=1099385268988&skuId=48530&cmp=RMXCC";
    static String image = "http://img.bbystatic.com/BestBuy_US/images/products/4853/48530_sa.jpg";
    static int productId;

    @Steps
    ProductsSteps productsSteps;*/

    @Title("Get all Products")
    @Test
    public void test01() {
        SerenityRest.given()
                .when()
                .get(EndPoints.productsGet)
                .then()
                .log().all().statusCode(200);
    }


//        @Title("Verify that Product was added to the application")
//        @Test
//        public void test002 () {
//            HashMap<String, Object> productMap = productsSteps.getProductInfoByName(name);
//            Assert.assertThat(productMap, hasValue(name));
//            productId = (int) productMap.get("id");
//            System.out.println("Created Product ID: " + productId);
//        }
//
//        @Title("Update the Product information and verify the updated information")
//        @Test
//        public void test003 () {
//            name = name + "_updated";
//            productsSteps.updateProduct(productId, name, type, price, shipping, upc, description, manufacturer, model, url, image).log().all().statusCode(200);
//            HashMap<String, Object> value = productsSteps.getProductInfoByName(name);
//            Assert.assertThat(value, hasValue(name));
//        }
//        @Title("Delete the Product and verify if the Product is deleted!")
//        @Test
//        public void test004 () {
//            productsSteps.deleteProduct(productId).statusCode(200);
//            productsSteps.getProductById(productId).statusCode(404);
//        }

}


