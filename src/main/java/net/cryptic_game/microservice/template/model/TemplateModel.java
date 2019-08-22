package net.cryptic_game.microservice.template.model;

import java.util.UUID;

import net.cryptic_game.microservice.db.Database;
import net.cryptic_game.microservice.model.Model;
import org.hibernate.Session;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "template")
public class TemplateModel extends Model {

    public TemplateModel() {
        //TODO
    }

    public void update() {
        Session session = Database.getInstance().openSession();
        session.beginTransaction();

        //TODO

        session.update(this);

        session.getTransaction().commit();
        session.close();
    }

    public static TemplateModel get(UUID uuid) {
        Session session = Database.getInstance().openSession();
        session.beginTransaction();

        TemplateModel model = session.get(TemplateModel.class, uuid);

        session.getTransaction().commit();
        session.close();

        return model;
    }

    public static TemplateModel create() {
        Session session = Database.getInstance().openSession();
        session.beginTransaction();

        TemplateModel model = new TemplateModel();

        //TODO

        session.save(model);

        session.getTransaction().commit();
        session.close();
        return null;
    }

}
