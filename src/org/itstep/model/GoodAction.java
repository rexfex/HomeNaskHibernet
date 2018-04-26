package org.itstep.model;

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "good_actions")
public class GoodAction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "actiontime")
	private Time timeAction;

	@Column(name = "login")
	private String login;

	@Column(name = "asin")
	private String asin;

	@Column(name = "added_to_wl")
	private Boolean added_to_wl;

	@Column(name = "added_to_cart")
	private Boolean added_to_cart;

	

	public GoodAction() {
		// TODO Auto-generated constructor stub
	}



	public GoodAction(Time timeAction, String login, String asin, Boolean added_to_wl, Boolean added_to_cart) {
		
		this.timeAction = timeAction;
		this.login = login;
		this.asin = asin;
		this.added_to_wl = added_to_wl;
		this.added_to_cart = added_to_cart;
	}

}