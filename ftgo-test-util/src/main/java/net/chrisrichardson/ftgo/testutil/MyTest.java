package net.chrisrichardson.ftgo.testutil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by 姓名 on 2019/10/10.
 */
public class MyTest {

    public static void main(String[] args) {
        List<Map<String, Object>> repayTermList = new ArrayList<>();
        repayTermList.add(new HashMap<String, Object>() {{
            put("term", 1);
            put("id", 1);
        }});
        repayTermList.add(new HashMap<String, Object>() {{
            put("term", 2);
            put("id", 2);
        }});
        String terms = repayTermList.stream()
                .map(m -> String.valueOf(m.get("term")))
                .collect(Collectors.joining(","));
        System.out.println(terms);
    }

    public static List<LoanReq> buildLoanReqs(final String periodNos,
                                              final String loanNo) {
        if ("all".equalsIgnoreCase(periodNos)) {
            LoanReq loanReq = buildLoanReq(null, loanNo);
            return Arrays.asList(loanReq);
        } else {
            return Arrays.asList(periodNos.split(",")).stream()
                    .map(t -> buildLoanReq(String.valueOf(t), loanNo))
                    .collect(Collectors.toList());
        }
    }

    private static LoanReq buildLoanReq(final String rypTerm, final String loanNo) {
        LoanReq loanReq = new LoanReq();
        loanReq.setLoanNo(loanNo);
        loanReq.setRpyTerm(rypTerm);
        return loanReq;
    }

}
