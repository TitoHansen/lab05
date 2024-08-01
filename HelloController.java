package org.example.lb5;

import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label productIdLabel;
    @FXML
    private Label productNameLabel;
    @FXML
    private Label orderDateLabel;
    @FXML
    private Label manufacturerLabel;

    @FXML
    protected void onParseButtonClick() {
        String jsonString = "{\"productID\": 1, \"productName\": \"pen\", \"orderDate\": \"2024-07-07\", \"manufacturer\": \"GC\"}";
        Gson gson = new Gson();
        Products product = gson.fromJson(jsonString, Products.class);

        productIdLabel.setText(String.valueOf(product.productID));
        productNameLabel.setText(product.productName);
        orderDateLabel.setText(product.orderDate);
        manufacturerLabel.setText(product.manufacturer);

        String jsonOutput = gson.toJson(product);
        System.out.println("The output for JSON: " + jsonOutput);
    }
}
