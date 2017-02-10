package io.vp.projects.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clinical_trial")
public class ClinicalTrial {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name = "nct_id")
	private String nctid;

	@Column(name = "official_title", length = 4000)
	private String officialTitle;

	@Column(name = "phase")
	private String phase;

	@Column(name = "primary_completion_date")
	private String completionDate;

	public ClinicalTrial() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNctid() {
		return nctid;
	}

	public void setNctid(String nctid) {
		this.nctid = nctid;
	}

	public String getOfficialTitle() {
		return officialTitle;
	}

	public void setOfficialTitle(String officialTitle) {
		this.officialTitle = officialTitle;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

}

