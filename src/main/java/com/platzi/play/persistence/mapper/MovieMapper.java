package com.platzi.play.persistence.mapper;


import com.platzi.play.domain.dto.MovieDto;
import com.platzi.play.persistence.entity.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GenreMapper.class, StatusMapper.class})
public interface MovieMapper {


    @Mapping(source = "titulo", target = "title")
    @Mapping(source = "estado", target = "status", qualifiedByName = "stringToBoolean")
    @Mapping(source = "duracion", target = "duration")
    @Mapping(source = "fechaEstreno", target = "releaseDate")
    @Mapping(source = "clasificacion", target = "rating")
    @Mapping(source = "genero", target = "genre", qualifiedByName = "stringToGenre")
    MovieDto toDto(MovieEntity movieEntity);
    List<MovieDto> toDto(Iterable<MovieEntity> movies);
}

