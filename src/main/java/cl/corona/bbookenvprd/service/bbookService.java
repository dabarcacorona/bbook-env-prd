package cl.corona.bbookenvprd.service;

import cl.corona.bbookenvprd.model.bbookJsonPrd;
import cl.corona.bbookenvprd.repository.bbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class bbookService {

    @Autowired
    bbookRepository bbookrepository;

    public ArrayList<bbookJsonPrd> obtenerJsob() {

        return (ArrayList<bbookJsonPrd>) bbookrepository.findAll();
    }

    public bbookJsonPrd guardarJsob(bbookJsonPrd bbookjson) {

        return bbookrepository.save(bbookjson);
    }

    public Optional<bbookJsonPrd> buscarJsob(Long idbk) {

        return bbookrepository.findById(idbk);
    }
}
