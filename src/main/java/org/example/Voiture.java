package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    private int id;
    private String name;
    private String modele;

    public boolean hasSameModel(Voiture other) {
        return this.modele.equalsIgnoreCase(other.modele);
    }

    public boolean isIdentical(Voiture other) {
        return this.id == other.id &&
                this.name.equalsIgnoreCase(other.name) &&
                this.modele.equalsIgnoreCase(other.modele);
    }


}
