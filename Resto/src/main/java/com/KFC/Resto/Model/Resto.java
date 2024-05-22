package com.KFC.Resto.Model;

import lombok.*;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Resto {
    private UUID uuid;
    private String location;
}
