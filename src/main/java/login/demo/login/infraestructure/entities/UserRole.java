package login.demo.login.infraestructure.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_Role")
public class UserRole {
    @Id
    @ManyToOne
    @JoinColumn(name = "User_ID")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "Role_ID")
    private Role role;

    private Date dateCreate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}

