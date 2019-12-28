package net.chrisrichardson.ftgo.testutil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxuecheng.
 * @date on 2019/10/31.
 * description .
 */
public class ReduceTwoObjectAddProp {

    static class A{
        int principal = 0;
        int fee = 0;
        public A(int principal, int fee) {
            super();
            this.principal = principal;
            this.fee = fee;
        }
        public A() {
            super();
            // TODO Auto-generated constructor stub
        }
        public int getPrincipal() {
            return principal;
        }
        public void setPrincipal(int principal) {
            this.principal = principal;
        }
        public int getFee() {
            return fee;
        }
        public void setFee(int fee) {
            this.fee = fee;
        }
        @Override
        public String toString() {
            return "A [principal=" + principal + ", fee=" + fee + "]";
        }

    }

    static class B{
        int principal = 0;
        int fee = 0;
        public B(int principal, int fee) {
            super();
            this.principal = principal;
            this.fee = fee;
        }
        public B() {
            super();
            // TODO Auto-generated constructor stub
        }
        public int getPrincipal() {
            return principal;
        }
        public void setPrincipal(int principal) {
            this.principal = principal;
        }
        public int getFee() {
            return fee;
        }
        public void setFee(int fee) {
            this.fee = fee;
        }
        @Override
        public String toString() {
            return "A [principal=" + principal + ", fee=" + fee + "]";
        }

    }



}
