package com.velorin.example;

import com.velorin.example.entity.BaseUsers;


//import ir.org.onet.orm.root.EntityProvider;



public class Users extends BaseUsers {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Users () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Users (java.lang.Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Users (
		java.lang.Long id,
		java.lang.String username,
		java.lang.String password) {

		super (
			id,
			username,
			password);
	}

/*[CONSTRUCTOR MARKER END]*/


}