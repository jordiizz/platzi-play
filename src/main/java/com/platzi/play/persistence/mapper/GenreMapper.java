package com.platzi.play.persistence.mapper;

import com.platzi.play.domain.Genre;
import org.mapstruct.Named;


public class GenreMapper {

    @Named("stringToGenre")
    public static Genre stringToGenre(String genero){
        if(genero == null) return null;

        return switch (genero.toUpperCase()) {
            case "ACCION" -> Genre.ACTION;
            case "COMEDIA" -> Genre.COMEDY;
            case "HORROR" -> Genre.HORROR;
            case "CIENCIA_FICCION" -> Genre.SCIENCE_FICTION;
            case "DRAMA" -> Genre.DRAMA;
            case "THRILLER" -> Genre.THRILLER;
            case "ROMANCE" -> Genre.ROMANCE;
            case "FANTASIA" -> Genre.FANTASY;
            case "ANIMACION" -> Genre.ANIMATION;
            default -> throw new IllegalArgumentException("Invalid genre value: " + genero);
        };
    }

    @Named("genreToString")
    public static String genreToString(Genre genre){
        if(genre == null) return null;

        return switch (genre) {
            case ACTION -> "ACCION";
            case COMEDY -> "COMEDIA";
            case HORROR -> "HORROR";
            case SCIENCE_FICTION -> "CIENCIA_FICCION";
            case DRAMA -> "DRAMA";
            case THRILLER -> "THRILLER";
            case ROMANCE -> "ROMANCE";
            case FANTASY -> "FANTASIA";
            case ANIMATION -> "ANIMACION";
            default -> throw new IllegalArgumentException("Invalid genre value: " + genre);
        };
    }
}
