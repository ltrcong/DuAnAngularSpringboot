package com.project.shopapple.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO {

    @JsonProperty("order_id")
    @Min(value = 1, message = "Order ID must be > 0")
    private Long orderId;

    @JsonProperty("product_id")
    @Min(value = 1, message = "Product's ID must be > 0")
    private Long productId;

    @Min(value = 0, message = "Price must be > 0")
    private Float price;

    @JsonProperty("number_of_products")
    @Min(value = 1, message = "Number Of Product must be > 0")
    private  Long numberOfProduct;

    @JsonProperty("total_money")
    @Min(value = 0, message = "Total Money must be > 0")
    private Float totalMoney;

    private String color;

}
