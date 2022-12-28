package com.example.Inst_Sait.payload.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JWTTokenSuccessResponse {
   private boolean success;
   private String token;
}
