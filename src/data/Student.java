/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "student", catalog = "institute", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudid", query = "SELECT s FROM Student s WHERE s.studid = :studid"),
    @NamedQuery(name = "Student.findByName", query = "SELECT s FROM Student s WHERE s.name = :name"),
    @NamedQuery(name = "Student.findByBdate", query = "SELECT s FROM Student s WHERE s.bdate = :bdate"),
    @NamedQuery(name = "Student.findByAdate", query = "SELECT s FROM Student s WHERE s.adate = :adate"),
    @NamedQuery(name = "Student.findByAddress", query = "SELECT s FROM Student s WHERE s.address = :address"),
    @NamedQuery(name = "Student.findByMobile", query = "SELECT s FROM Student s WHERE s.mobile = :mobile"),
    @NamedQuery(name = "Student.findByCourse", query = "SELECT s FROM Student s WHERE s.course = :course"),
    @NamedQuery(name = "Student.findByQualification", query = "SELECT s FROM Student s WHERE s.qualification = :qualification")})
public class Student implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "studid")
    private Integer studid;
    @Column(name = "name")
    private String name;
    @Column(name = "bdate")
    @Temporal(TemporalType.DATE)
    private Date bdate;
    @Column(name = "adate")
    @Temporal(TemporalType.DATE)
    private Date adate;
    @Column(name = "address")
    private String address;
    @Column(name = "mobile")
    private BigInteger mobile;
    @Lob
    @Column(name = "gender")
    private String gender;
    @Column(name = "course")
    private String course;
    @Column(name = "qualification")
    private String qualification;

    public Student() {
    }

    public Student(Integer studid) {
        this.studid = studid;
    }

    public Integer getStudid() {
        return studid;
    }

    public void setStudid(Integer studid) {
        Integer oldStudid = this.studid;
        this.studid = studid;
        changeSupport.firePropertyChange("studid", oldStudid, studid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        Date oldBdate = this.bdate;
        this.bdate = bdate;
        changeSupport.firePropertyChange("bdate", oldBdate, bdate);
    }

    public Date getAdate() {
        return adate;
    }

    public void setAdate(Date adate) {
        Date oldAdate = this.adate;
        this.adate = adate;
        changeSupport.firePropertyChange("adate", oldAdate, adate);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        BigInteger oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        String oldQualification = this.qualification;
        this.qualification = qualification;
        changeSupport.firePropertyChange("qualification", oldQualification, qualification);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studid != null ? studid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studid == null && other.studid != null) || (this.studid != null && !this.studid.equals(other.studid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Student[ studid=" + studid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
