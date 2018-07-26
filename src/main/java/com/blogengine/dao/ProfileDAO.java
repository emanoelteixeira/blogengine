
package com.blogengine.dao;

import com.blogengine.model.Profile;

/**
 *
 * @author lucasemanoel
 */
public interface ProfileDAO extends DAO<Profile, Long> {
    
    Profile findByProfileName(String name);
    
    Profile findByProfileEmail(String email);
    
}
