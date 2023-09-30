package pe.edu.cibertec.DSWII_CL1SOAPRubioVallasCarrasco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAPRubioVallasCarrasco.model.Paciente;
import pe.edu.cibertec.DSWII_CL1SOAPRubioVallasCarrasco.repository.PacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    //Listar todos
    public List<Paciente> obtenerPacientes(){
        return pacienteRepository.findAll();
    }

    //Busqueda por id
    public Paciente obtenerPacienteXId(Integer id){
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        if(paciente.isEmpty()){
            return null;
        }
        return paciente.get();
    }
    //guardar
    public Paciente guardarPaciente(Paciente paciente){

        return pacienteRepository.save(paciente);
    }
}
