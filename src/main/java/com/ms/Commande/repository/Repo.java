package com.ms.commande.repository;

import com.ms.commande.entity.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository <Commande, Long> {

}
