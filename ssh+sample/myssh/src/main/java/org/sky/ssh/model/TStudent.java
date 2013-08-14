package org.sky.ssh.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_STUDENT database table.
 * 
 */
@Entity
@Table(name="T_STUDENT")
public class TStudent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_STUDENT_STUDENTNO_GENERATOR", sequenceName="SEQ_STUDENT_NO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_STUDENT_STUDENTNO_GENERATOR")
	@Column(name="STUDENT_NO")
	private long studentNo;

	@Column(name="STUDENT_NAME")
	private String studentName;

    public TStudent() {
    }

	public long getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(long studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}