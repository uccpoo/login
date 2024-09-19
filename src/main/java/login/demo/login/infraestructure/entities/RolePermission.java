package login.demo.login.infraestructure.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Role_permission")
public class RolePermission {
    @Id
    @ManyToOne
    @JoinColumn(name = "Role_ID")
    private Role role;

    @Id
    @ManyToOne
    @JoinColumn(name = "Permission_ID")
    private Permission permission;

    private Date dateCreate;

    private Date assignmentDate;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(Date assignmentDate) {
        this.assignmentDate = assignmentDate;
    }
}