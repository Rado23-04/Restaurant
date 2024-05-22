package com.KFC.Resto.Model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Menu {
    private String ingredient;
    private double quantity;
    private String unity;
    private double currentUnitPrice;
}
