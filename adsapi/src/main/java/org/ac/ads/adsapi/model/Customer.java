package org.ac.ads.adsapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode(of = "login")
@ToString(of = "login")
@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@Column(name = "Login")	
	private String login;
	
	private String password;
	private Boolean notificationFlag;
	private Integer masterId;
	private Boolean blockedFlag;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AuditId", insertable=false, updatable=false)
	private Audit audit;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NotificationId", insertable=false, updatable=false)
	private Notification notification;
}
