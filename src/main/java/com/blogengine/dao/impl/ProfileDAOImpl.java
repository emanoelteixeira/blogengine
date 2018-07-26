package com.blogengine.dao.impl;

import com.blogengine.dao.GenericDAO;
import com.blogengine.dao.ProfileDAO;
import com.blogengine.model.Profile;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

/**
 *
 * @author lucasemanoel
 */
@ApplicationScoped
public class ProfileDAOImpl extends GenericDAO<Profile, Long> implements ProfileDAO {

    public ProfileDAOImpl() {
        super(Profile.class);
    }

    @Override
    public Profile findByProfileName (String name) {
        Query query = getEntityManager().createNamedQuery("Profile.findByProfileName", Profile.class);
        query.setParameter("name", name);
        List<Profile> profiles = query.getResultList();

        if (profiles == null || profiles.isEmpty()) {
            return null;
        } else if (profiles.size() > 1) {
            throw new NonUniqueResultException();
        } else {
            return profiles.get(0);
        }
    }

    @Override
    public Profile findByProfileEmail(String email) {
        Query query = getEntityManager().createNamedQuery("Profile.findByProfileEmail", Profile.class);
        query.setParameter("email", email);
        List<Profile> profiles = query.getResultList();

        if (profiles == null || profiles.isEmpty()) {
            return null;
        } else if (profiles.size() > 1) {
            throw new NonUniqueResultException();
        } else {
            return profiles.get(0);
        }}

    
}
