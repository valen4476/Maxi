package co.edu.uniquindio.poo;

public record Mascota(String identificacion, String nombre, byte edad, String raza, String especie, Character genero, String color, byte peso) {

    public Mascota{
        assert identificacion != null && !identificacion.isBlank(): "La identificación no puede ser null, no puede ser vacío y tampoco puede ser igual a otra identificación";
        assert nombre != null && !nombre.isBlank() :"El nombre de la mascota no puede ser null y tampoco puede ser vacio";
        assert edad >= 0: "La edad no puede ser negativa";
        assert raza != null && !raza.isBlank() :"La raza de la mascota no puede se null y tampoco puede ser vacío";
        assert especie != null && !especie.isBlank() :"La especie de la mascota no puede ser null y tampoco puede ser vacio";
        assert genero != null && genero.equals('M') || genero.equals('H') :"El genero de la mascota no puede ser null y tampoco puede ser vacio ni puede ser diferente de 'M' o 'H'";
        assert color != null && !color.isBlank() :"El color de las mascota no puede ser null y tampoco puede ser vacio";
        assert peso >0 && peso <51: "El peso no puede ser negativo ni mayor a 80";
    }
}