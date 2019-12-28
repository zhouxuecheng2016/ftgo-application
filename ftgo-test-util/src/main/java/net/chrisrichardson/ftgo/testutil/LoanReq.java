package net.chrisrichardson.ftgo.testutil;

/**
 * @author zhouxuecheng.
 * @date on 2019/10/11.
 * description .
 */
public class LoanReq {


    /**
     * 借据号
     */
    private String loanNo;
    /**
     * 期数
     */
    private String rpyTerm;

    /**
     * 合作方代码
     */
    private String thirdCode;

    /**
     * 代偿标识
     */
    private String compensateType;


    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(final String loanNo) {
        this.loanNo = loanNo;
    }

    public String getRpyTerm() {
        return rpyTerm;
    }

    public void setRpyTerm(final String rpyTerm) {
        this.rpyTerm = rpyTerm;
    }

    public String getThirdCode() {
        return thirdCode;
    }

    public void setThirdCode(final String thirdCode) {
        this.thirdCode = thirdCode;
    }

    public String getCompensateType() {
        return compensateType;
    }

    public void setCompensateType(final String compensateType) {
        this.compensateType = compensateType;
    }

    @Override
    public String toString() {
        return "LoanReq{" +
                "loanNo='" + loanNo + '\'' +
                ", rpyTerm='" + rpyTerm + '\'' +
                ", thirdCode='" + thirdCode + '\'' +
                ", compensateType='" + compensateType + '\'' +
                '}';
    }
}
