package com.KFC.Resto.Model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovementStock {
    private Menu menu;
    private double quantityRemaining;
}
