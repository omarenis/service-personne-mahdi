package com.gestionpersonne.gestionpersonne.services;

import com.gestionpersonne.gestionpersonne.models.entities.CustomUser;
import com.gestionpersonne.gestionpersonne.models.entities.Person;
import com.gestionpersonne.gestionpersonne.models.repositories.ClientRepository;
import com.gestionpersonne.gestionpersonne.models.repositories.CompanyRepository;
import com.gestionpersonne.gestionpersonne.models.repositories.ProviderRepository;
import com.gestionpersonne.gestionpersonne.models.repositories.UserRepository;
import com.gestionpersonne.gestionpersonne.services.interfaces.UserCrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserCrudImplementation implements UserCrudInterface {
    private final UserRepository userRepository;
    private final ClientRepository clientRepository;
    private final ProviderRepository providerRepository;

    private final CompanyRepository companyRepository;
    @Autowired
    public UserCrudImplementation(UserRepository userRepository, ClientRepository clientRepository, ProviderRepository providerRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.clientRepository = clientRepository;
        this.providerRepository = providerRepository;
        this.companyRepository = companyRepository;
    }

    @Override
    public List<? extends CustomUser> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<? extends CustomUser> findByUsername(String username) {
        return Optional.ofNullable(this.userRepository.findByUsername(username));
    }

    public List<? extends CustomUser> findByUsernameContaining(String username) {
        return this.userRepository.findByUsernameContaining(username);
    }

    @Override
    public List<? extends Person> findByFirstnameContaining() {
        return null;
    }

    @Override
    public List<? extends Person> findByLastnameContaining() {
        return null;
    }

    @Override
    public List<? extends Person> findByEmail() {
        return null;
    }

    public Optional<? extends Person> findPersonByIdAndTypeUser(Long id, String typeUser)
    {
        if (typeUser.equals("client"))
        {
            return this.clientRepository.findById(id);
        }
        if(typeUser.equals("provider"))
        {
            return this.providerRepository.findById(id);
        }
        return Optional.empty();
    }

    public Optional<? extends CustomUser> findUserById(Long id, String typeUser)
    {
        if(typeUser.equals("admin"))
        {
            return this.userRepository.findById(id);
        }
        return this.companyRepository.findById(id);
    }

    public void delete(Long id, String typeUser)
    {
        this.userRepository.deleteById(id);
    }
}
