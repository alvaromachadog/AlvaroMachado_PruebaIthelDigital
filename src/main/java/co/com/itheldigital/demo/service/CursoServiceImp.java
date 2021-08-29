package co.com.itheldigital.demo.service;

import co.com.itheldigital.demo.dto.CursoDTO;
import co.com.itheldigital.demo.model.Cursos;
import co.com.itheldigital.demo.repository.CursosRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImp implements CursoService {

    @Autowired
    private CursosRepository cursosRepository;

    /**
     *
     * Metodo encargado de agregar un curso
     * @param cursoDTO
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public CursoDTO agregar(CursoDTO cursoDTO) throws ServiceException {

        CursoDTO response = null;

        Cursos cursosDb = new Cursos();

        try {

            if (cursosDb != null) {
                cursosDb.setId(cursoDTO.getId());
                cursosDb.setNombre(cursoDTO.getNombre());
                cursosDb.setDirigido(cursoDTO.getDirigido());
                cursosDb.setCosto(cursoDTO.getCosto());
                cursosDb.setModalidad(cursoDTO.getModalidad());
                cursosDb.setDescripcion(cursoDTO.getDescripcion());
                cursosDb.setHoras(cursoDTO.getHoras());

                Cursos responseDB = cursosRepository.save(cursosDb);

                response = new CursoDTO();

                response.setId(responseDB.getId());
                response.setNombre(responseDB.getNombre());
                response.setDirigido(responseDB.getDirigido());
                response.setCosto(responseDB.getCosto());
                response.setModalidad(responseDB.getModalidad());
                response.setDescripcion(responseDB.getDescripcion());
                response.setHoras(responseDB.getHoras());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }


    /**
     *
     * Metodo encargado de editar un curso
     * @param cursoDTO
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public CursoDTO editar(CursoDTO cursoDTO) throws ServiceException {

        CursoDTO response = null;
        Cursos cursosDb = new Cursos();
        try {
            if (cursosDb != null) {

                cursosDb.setId(cursoDTO.getId());
                cursosDb.setCosto(cursoDTO.getCosto());
                cursosDb.setDescripcion(cursoDTO.getDescripcion());
                cursosDb.setDirigido(cursoDTO.getDirigido());
                cursosDb.setHoras(cursoDTO.getHoras());
                cursosDb.setModalidad(cursoDTO.getModalidad());
                cursosDb.setNombre(cursoDTO.getNombre());

                Cursos responseDB = cursosRepository.save(cursosDb);

                response = new CursoDTO();

                response.setModalidad(responseDB.getModalidad());
                response.setCosto(responseDB.getCosto());
                response.setDescripcion(responseDB.getDescripcion());
                response.setDirigido(responseDB.getDirigido());
                response.setHoras(responseDB.getHoras());
                response.setId(responseDB.getId());
                response.setNombre(responseDB.getNombre());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

}
