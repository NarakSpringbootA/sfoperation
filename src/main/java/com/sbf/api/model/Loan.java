package com.sbf.api.model;

public class Loan
{
    private String principalDue;

    private String startDate;

    private String principalOutstanding;

    private String empId;

    private String committeeId;

    private String currId;

    private String creditStatusId;

    private String phoneNumber;

    private String khName;

    private String dueDate;

    private String savingAcc;

    private String aging;

    private String busTypeId;

    private String totalDue;

    private String creditTypeId;

    private String intDue;

    private String maturityDate;

    private String intRate;

    private String principalAmt;

    private String feeRate;

    private String pen;

    private String groupRef;

    private String loanFacId;

    private String refNo;

    private String fullName;

    private String feeDue;
    
    
    public Loan() {
		super();
	}

	public Loan(String principalDue, String startDate, String principalOutstanding, String empId, String committeeId,
			String currId, String creditStatusId, String phoneNumber, String khName, String dueDate, String savingAcc,
			String aging, String busTypeId, String totalDue, String creditTypeId, String intDue, String maturityDate,
			String intRate, String principalAmt, String feeRate, String pen, String groupRef, String loanFacId,
			String refNo, String fullName, String feeDue) {
		super();
		this.principalDue = principalDue;
		this.startDate = startDate;
		this.principalOutstanding = principalOutstanding;
		this.empId = empId;
		this.committeeId = committeeId;
		this.currId = currId;
		this.creditStatusId = creditStatusId;
		this.phoneNumber = phoneNumber;
		this.khName = khName;
		this.dueDate = dueDate;
		this.savingAcc = savingAcc;
		this.aging = aging;
		this.busTypeId = busTypeId;
		this.totalDue = totalDue;
		this.creditTypeId = creditTypeId;
		this.intDue = intDue;
		this.maturityDate = maturityDate;
		this.intRate = intRate;
		this.principalAmt = principalAmt;
		this.feeRate = feeRate;
		this.pen = pen;
		this.groupRef = groupRef;
		this.loanFacId = loanFacId;
		this.refNo = refNo;
		this.fullName = fullName;
		this.feeDue = feeDue;
	}

	public String getPrincipalDue ()
    {
        return principalDue;
    }

    public void setPrincipalDue (String principalDue)
    {
        this.principalDue = principalDue;
    }

    public String getStartDate ()
    {
        return startDate;
    }

    public void setStartDate (String startDate)
    {
        this.startDate = startDate;
    }

    public String getPrincipalOutstanding ()
    {
        return principalOutstanding;
    }

    public void setPrincipalOutstanding (String principalOutstanding)
    {
        this.principalOutstanding = principalOutstanding;
    }

    public String getEmpId ()
    {
        return empId;
    }

    public void setEmpId (String empId)
    {
        this.empId = empId;
    }

    public String getCommitteeId ()
    {
        return committeeId;
    }

    public void setCommitteeId (String committeeId)
    {
        this.committeeId = committeeId;
    }

    public String getCurrId ()
    {
        return currId;
    }

    public void setCurrId (String currId)
    {
        this.currId = currId;
    }

    public String getCreditStatusId ()
    {
        return creditStatusId;
    }

    public void setCreditStatusId (String creditStatusId)
    {
        this.creditStatusId = creditStatusId;
    }

    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getKhName ()
    {
        return khName;
    }

    public void setKhName (String khName)
    {
        this.khName = khName;
    }

    public String getDueDate ()
    {
        return dueDate;
    }

    public void setDueDate (String dueDate)
    {
        this.dueDate = dueDate;
    }

    public String getSavingAcc ()
    {
        return savingAcc;
    }

    public void setSavingAcc (String savingAcc)
    {
        this.savingAcc = savingAcc;
    }

    public String getAging ()
    {
        return aging;
    }

    public void setAging (String aging)
    {
        this.aging = aging;
    }

    public String getBusTypeId ()
    {
        return busTypeId;
    }

    public void setBusTypeId (String busTypeId)
    {
        this.busTypeId = busTypeId;
    }

    public String getTotalDue ()
    {
        return totalDue;
    }

    public void setTotalDue (String totalDue)
    {
        this.totalDue = totalDue;
    }

    public String getCreditTypeId ()
    {
        return creditTypeId;
    }

    public void setCreditTypeId (String creditTypeId)
    {
        this.creditTypeId = creditTypeId;
    }

    public String getIntDue ()
    {
        return intDue;
    }

    public void setIntDue (String intDue)
    {
        this.intDue = intDue;
    }

    public String getMaturityDate ()
    {
        return maturityDate;
    }

    public void setMaturityDate (String maturityDate)
    {
        this.maturityDate = maturityDate;
    }

    public String getIntRate ()
    {
        return intRate;
    }

    public void setIntRate (String intRate)
    {
        this.intRate = intRate;
    }

    public String getPrincipalAmt ()
    {
        return principalAmt;
    }

    public void setPrincipalAmt (String principalAmt)
    {
        this.principalAmt = principalAmt;
    }

    public String getFeeRate ()
    {
        return feeRate;
    }

    public void setFeeRate (String feeRate)
    {
        this.feeRate = feeRate;
    }

    public String getPen ()
    {
        return pen;
    }

    public void setPen (String pen)
    {
        this.pen = pen;
    }

    public String getGroupRef ()
    {
        return groupRef;
    }

    public void setGroupRef (String groupRef)
    {
        this.groupRef = groupRef;
    }

    public String getLoanFacId ()
    {
        return loanFacId;
    }

    public void setLoanFacId (String loanFacId)
    {
        this.loanFacId = loanFacId;
    }

    public String getRefNo ()
    {
        return refNo;
    }

    public void setRefNo (String refNo)
    {
        this.refNo = refNo;
    }

    public String getFullName ()
    {
        return fullName;
    }

    public void setFullName (String fullName)
    {
        this.fullName = fullName;
    }

    public String getFeeDue ()
    {
        return feeDue;
    }

    public void setFeeDue (String feeDue)
    {
        this.feeDue = feeDue;
    }

	@Override
	public String toString() {
		return "Loan [principalDue=" + principalDue + ", startDate=" + startDate + ", principalOutstanding="
				+ principalOutstanding + ", empId=" + empId + ", committeeId=" + committeeId + ", currId=" + currId
				+ ", creditStatusId=" + creditStatusId + ", phoneNumber=" + phoneNumber + ", khName=" + khName
				+ ", dueDate=" + dueDate + ", savingAcc=" + savingAcc + ", aging=" + aging + ", busTypeId=" + busTypeId
				+ ", totalDue=" + totalDue + ", creditTypeId=" + creditTypeId + ", intDue=" + intDue + ", maturityDate="
				+ maturityDate + ", intRate=" + intRate + ", principalAmt=" + principalAmt + ", feeRate=" + feeRate
				+ ", pen=" + pen + ", groupRef=" + groupRef + ", loanFacId=" + loanFacId + ", refNo=" + refNo
				+ ", fullName=" + fullName + ", feeDue=" + feeDue + "]";
	}

  
}
