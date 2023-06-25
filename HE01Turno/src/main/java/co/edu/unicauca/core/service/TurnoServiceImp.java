package co.edu.unicauca.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.core.entity.Jornada;
import co.edu.unicauca.core.entity.Turno;
import co.edu.unicauca.core.repository.JornadaRepository;
import co.edu.unicauca.core.repository.TurnoRepository;

@Service
public class TurnoServiceImp implements TurnoServiceInt {
	
	@Autowired
	private TurnoRepository turnoRepo;
	
	@Autowired
	private JornadaRepository jornadaRepo;

	@Override
	public Turno registrarTurno(Turno turno) {
		return turnoRepo.save(turno);
	}

	@Override
	public Turno editarTurno(Turno turno) {
		return turnoRepo.save(turno);
	}

	@Override
	public Integer eliminarAsociacionesTurno(Turno turno) {
		return turnoRepo.eliminarAsociacionesTurno(turno.getEstudiante_id(), turno.getFecha());
	}

	@Override
	public List<Turno> listarTurnos() {
		return turnoRepo.findAll();
	}

	@Override
	public Turno listarTurno(Integer turno_id) {
		try {
			return turnoRepo.findById(turno_id).get();
		} catch (Exception e) {
			return null;
		}
	}
	@Override
	public List<Jornada> listarJornadas() {
		List<Jornada> listAux;
		listAux = jornadaRepo.findAll();
		
		for (Jornada jornada : listAux) {
			jornada.setNombre(formaterString(jornada.getNombre()));
		}
		return listAux;
	}
	@Override
	public void eliminarTurnoId(Integer turno_id) {
		turnoRepo.deleteById(turno_id);
		
	}

	
	public String formaterString(String jornada) {
		String[] values = jornada.split(",");
		String ret="";
		String ender="";
		String auxi="";
		char[] auxi2;
		if (Integer.parseInt(values[0])<1200) {
			ret+="Mañana (";
		}else {
			ret+="Tarde (";
		}
		if (Integer.parseInt(values[1])>=1200) {
			ender=" p.m.";
		}else {
			ender=" a.m.";
		}
		if (Integer.parseInt(values[0])>=1300) {
			auxi=((Integer)((Integer.parseInt(values[0])-1200))).toString();
			auxi2=auxi.toCharArray();
			 if (auxi2.length==4) {
				auxi=String.valueOf(auxi2[0]);
				auxi+=String.valueOf(auxi2[1]);
				auxi+=":";
				auxi+=String.valueOf(auxi2[2]);
				auxi+=String.valueOf(auxi2[3]);
			}else {
				auxi=String.valueOf(auxi2[0]);
				auxi+=":";
				auxi+=String.valueOf(auxi2[1]);
				auxi+=String.valueOf(auxi2[2]);				
			}
			ret+=auxi;
		}else {
			auxi=((Integer)(Integer.parseInt(values[0]))).toString();
			auxi2=auxi.toCharArray();
			 if (auxi2.length==4) {
				auxi=String.valueOf(auxi2[0]);
				auxi+=String.valueOf(auxi2[1]);
				auxi+=":";
				auxi+=String.valueOf(auxi2[2]);
				auxi+=String.valueOf(auxi2[3]);
			}else {
				auxi=String.valueOf(auxi2[0]);
				auxi+=":";
				auxi+=String.valueOf(auxi2[1]);
				auxi+=String.valueOf(auxi2[2]);				
			}
			ret+=auxi;
		}
		ret+="-";
		if (Integer.parseInt(values[1])>=1300) {
			auxi=((Integer)((Integer.parseInt(values[1])-1200))).toString();
			 auxi2=auxi.toCharArray();
			 if (auxi2.length==4) {
				auxi=String.valueOf(auxi2[0]);
				auxi+=String.valueOf(auxi2[1]);
				auxi+=":";
				auxi+=String.valueOf(auxi2[2]);
				auxi+=String.valueOf(auxi2[3]);
			}else {
				auxi=String.valueOf(auxi2[0]);
				auxi+=":";
				auxi+=String.valueOf(auxi2[1]);
				auxi+=String.valueOf(auxi2[2]);				
			}
			ret+=auxi;
		}else {
			auxi=((Integer)(Integer.parseInt(values[1]))).toString();
			auxi2=auxi.toCharArray();
			 if (auxi2.length==4) {
				auxi=String.valueOf(auxi2[0]);
				auxi+=String.valueOf(auxi2[1]);
				auxi+=":";
				auxi+=String.valueOf(auxi2[2]);
				auxi+=String.valueOf(auxi2[3]);
			}else {
				auxi=String.valueOf(auxi2[0]);
				auxi+=":";
				auxi+=String.valueOf(auxi2[1]);
				auxi+=String.valueOf(auxi2[2]);				
			}
			 ret+=auxi;
		}
		
		ret+=ender+")";
			
		return ret;
	}

	
	


	
}
