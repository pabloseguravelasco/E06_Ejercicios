package com.salesianostriana.dam.ej2;


import com.salesianostriana.dam.ej2.model.CursoOnline;
import com.salesianostriana.dam.ej2.model.Profesor;
import com.salesianostriana.dam.ej2.model.Video;
import com.salesianostriana.dam.ej2.service.CursoOnlineService;
import com.salesianostriana.dam.ej2.service.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

        private final CursoOnlineService cursoOnlineService;
        private final ProfesorService profesorService;

        @PostConstruct
        public void prueba(){

            //Profesores
            Profesor luismi = Profesor.builder()
                    .nombre("Luis Miguel")
                    .email("luismi@gmail.com")
                    .puntuacion(8)
                    .build();
            profesorService.save(luismi);
            Profesor miguel = Profesor.builder()
                    .nombre("Miguel")
                    .email("miguel@gmail.com")
                    .puntuacion(7)
                    .build();
            profesorService.save(miguel);

            //CursoOnline
            CursoOnline spring = CursoOnline.builder()
                    .nombre("Spring")
                    .puntuacion(5)
                    .videos(new ArrayList<>())
                    .build();
            cursoOnlineService.save(spring);
            CursoOnline angular = CursoOnline.builder()
                    .nombre("Angular")
                    .puntuacion(5)
                    .videos(new ArrayList<>())
                    .build();
            cursoOnlineService.save(angular);
            spring.addVideo(Video.builder()
                    .orden(1)
                    .titulo("SpringData")
                    .descripcion("Conceptos básicos de Spring")
                    .url("https://Spring.com")
                    .build());
            cursoOnlineService.edit(spring);

            angular.addVideo(Video.builder()
                    .orden(1)
                    .titulo("Angular")
                    .descripcion("Conceptos básicos de Angular")
                    .url("https://Angular.com")
                    .build());
            cursoOnlineService.edit(angular);


            //Add profesor curso
            spring.addProfesor(luismi);
            angular.addProfesor(miguel);

            cursoOnlineService.edit(spring);
            cursoOnlineService.edit(angular);

            List<CursoOnline> cursos = cursoOnlineService.findAll();

            System.out.println("Profesor: " + luismi.getNombre());
            System.out.println("Listado de cursos online: ");
            luismi.getCursoOnline().forEach(c -> {
                System.out.println(c.getNombre());
            });
            System.out.println("Videos: ");
            spring.getVideos().forEach(v -> {
                System.out.println(v.getTitulo());
            });

            System.out.println("Profesor: " + miguel.getNombre());
            System.out.println("Listado de cursos online: ");
            miguel.getCursoOnline().forEach(c -> {
                System.out.println(c.getNombre());
            });
            System.out.println("Videos: ");
            angular.getVideos().forEach(v -> {
                System.out.println(v.getTitulo());
            });

        }
}
