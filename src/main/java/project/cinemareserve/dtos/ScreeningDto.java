package project.cinemareserve.dtos;

import lombok.Builder;
import lombok.Data;

@Data
public class ScreeningDto {
    private MovieDto movie;
    private String startTime;
    private String hallName;

    public ScreeningDto(MovieDto movie, String startTime, String hallName) {
        this.movie = movie;
        this.startTime = startTime;
        this.hallName = hallName;
    }
}
