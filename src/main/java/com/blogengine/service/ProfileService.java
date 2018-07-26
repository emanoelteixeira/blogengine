package com.blogengine.service;

import com.blogengine.model.Profile;
import javax.ws.rs.core.Response;

/**
 *
 * @author lucasemanoel
 */
public interface ProfileService extends CRUDRestService<Profile> {
    
    Response getByName(String name);
    
    Response getByEmail(String email);
    
}
