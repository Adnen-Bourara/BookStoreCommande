package com.ms.commande.Service.Impl;


import com.ms.commande.Service.CommandeService;
import com.ms.commande.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ms.commande.entity.Commande;


import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    Repo commandeRepository;



    @Override
    public Commande add(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande findById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Commande> findAll() {
        return (List<Commande>) commandeRepository.findAll();
    }

    @Override
    public void DeleteById(Long id) {
        commandeRepository.deleteById(id);
    }
    @Override
    public Commande Update(Commande commande){
        return commandeRepository.save(commande);
    }

}
