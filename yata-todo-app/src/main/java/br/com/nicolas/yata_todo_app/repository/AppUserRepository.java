package br.com.nicolas.yata_todo_app.repository;

import br.com.nicolas.yata_todo_app.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
