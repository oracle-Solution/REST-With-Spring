package org.rest.sec.persistence.service;

import org.rest.persistence.service.IService;
import org.rest.sec.model.User;

public interface IUserService extends IService< User >{
	
	User findByName( final String name );
	
}
