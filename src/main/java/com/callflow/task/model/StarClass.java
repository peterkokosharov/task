package com.callflow.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum StarClass {
    @JsonProperty("M") M,
    @JsonProperty("K") K,
    @JsonProperty("G") G,
    @JsonProperty("F") F,
    @JsonProperty("A") A,
    @JsonProperty("B") B,
    @JsonProperty("O") O;

    public static StarClass calcStarClass(float mass, float size, float light, int temp) {
        if(temp >= 30000 && light >=30000 && mass >= 16 && size >= 6.6) return O;
        if(temp >= 10000 && temp <= 30000 && light >=25 && light <= 30000 && mass >= 2.1 && mass < 16 && size >= 1.8 && size <= 6.6) return B;
        if(temp >= 7500 && temp <= 10000 && light >=5 && light <= 25 && mass >= 1.4 && mass <= 2.1 && size >= 1.4 && size <= 1.8) return A;
        if(temp >= 6000 && temp <= 7500 && light >=1.5 && light <= 5 && mass >= 1.04 && mass <= 1.4 && size >= 1.15 && size <= 1.4) return F;
        if(temp >= 5200 && temp <= 6000 && light >=0.6 && light <= 1.5 && mass >= 0.8 && mass <= 1.04 && size >= 0.96 && size <= 1.15) return G;
        if(temp >= 3700 && temp <= 5200 && light >=0.08 && light <= 0.6 && mass >= 0.45 && mass <= 0.8 && size >= 0.7 && size <= 0.96) return K;
        if(temp >= 2400 && temp <= 3700 && light <=0.08 && mass >= 0.08 && mass <= 0.45 && size <=0.7) return M;

        return null; // invalid data
    }
}
