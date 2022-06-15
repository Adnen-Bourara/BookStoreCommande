package com.ms.commande.Service;


import com.ms.commande.entity.Commande;

import java.util.List;

public interface CommandeService {

    public Commande add(Commande commande);
    public Commande findById( Long id);
    public List<Commande> findAll();
    public void DeleteById( Long id);
    public Commande Update(Commande commande);

}
