package com.velorin.example.entity;

import java.io.Serializable;

import com.velorin.annotation.DTO;
import com.velorin.example.EntityProvider;

/**
 * This is an object that contains data related to the users table. Do not
 * modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 * 
 * @hibernate.class table="users"
 */
public abstract class BaseUsers implements Serializable, EntityProvider {

	private static final long serialVersionUID = 1L;
	public static String REF = "Users";
	public static String PROP_ENABLED = "enabled";
	public static String PROP_ACCOUNT_NON_LOCKED = "accountNonLocked";
	public static String PROP_PASSWORD = "password";
	public static String PROP_USERNAME = "username";
	public static String PROP_ID = "id";
	public static String PROP_CREDENTIALS_NON_EXPIRED = "credentialsNonExpired";
	public static String PROP_ACCOUNT_NON_EXPIRED = "accountNonExpired";

	// constructors
	public BaseUsers() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUsers(java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseUsers(java.lang.Long id, java.lang.String username,
			java.lang.String password) {

		this.setId(id);
		this.setUsername(username);
		this.setPassword(password);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;
	// primary key
	private java.lang.Long id;
	// fields
	@DTO
	private java.lang.String username;
	private java.lang.String password;
	@DTO
	private boolean enabled;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;

	// collections
	/**
	 * Return the unique identifier of this class
	 * 
	 * @hibernate.id generator-class="increment" column="id"
	 */
	public java.lang.Long getId() {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * 
	 * @param id
	 *            the new ID
	 */
	public void setId(java.lang.Long id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
	 * Return the value associated with the column: username
	 */
	public java.lang.String getUsername() {
		return username;
	}

	/**
	 * Set the value related to the column: username
	 * 
	 * @param username
	 *            the username value
	 */
	public void setUsername(java.lang.String username) {
		this.username = username;
	}

	/**
	 * Return the value associated with the column: password
	 */
	public java.lang.String getPassword() {
		return password;
	}

	/**
	 * Set the value related to the column: password
	 * 
	 * @param password
	 *            the password value
	 */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	/**
	 * Return the value associated with the column: enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Set the value related to the column: enabled
	 * 
	 * @param enabled
	 *            the enabled value
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Return the value associated with the column: AccountNonExpired
	 */
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	/**
	 * Set the value related to the column: AccountNonExpired
	 * 
	 * @param accountNonExpired
	 *            the AccountNonExpired value
	 */
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	/**
	 * Return the value associated with the column: AccountNonLocked
	 */
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	/**
	 * Set the value related to the column: AccountNonLocked
	 * 
	 * @param accountNonLocked
	 *            the AccountNonLocked value
	 */
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	/**
	 * Return the value associated with the column: CredentialsNonExpired
	 */
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	/**
	 * Set the value related to the column: CredentialsNonExpired
	 * 
	 * @param credentialsNonExpired
	 *            the CredentialsNonExpired value
	 */
	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	/**
	 * Set the value related to the column: Authorities
	 * 
	 * @param authorities
	 *            the Authorities value
	 */
	/**
	 * @deprecated Use
	 *             {@link #addToAuthorities(ir.org.onet.orm.model.authorities.Authorities)}
	 *             instead.
	 */
	// @Ahmadreza Comented This
	/*
	 * @Deprecated public final void
	 * addToAuthorities(ir.org.onet.orm.model.authorities.Authorities
	 * authorities) { this.addToAuthorities(authorities); }
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (null == obj) {
			return false;
		}
		if (!(obj instanceof com.velorin.example.Users)) {
			return false;
		} else {
			com.velorin.example.Users users = (com.velorin.example.Users) obj;
			if (null == this.getId() || null == users.getId()) {
				return false;
			} else {
				return (this.getId().equals(users.getId()));
			}
		}
	}

	public int hashCode() {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) {
				return super.hashCode();
			} else {
				String hashStr = this.getClass().getName() + ":"
						+ this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public String toString() {
		return super.toString();
	}
}