package joshua;

import java.util.Date;

/**
 * Created by rtsy on 01.08.2015.
 */
public class Item39DefensiveCopy {
    
    static class PeriodDefenseLess {
        private final Date start;
        private final Date end;

        PeriodDefenseLess(Date start, Date end) {
            if (start.compareTo(end) > 0) {
                throw new IllegalArgumentException(
                        start + " after " + end
                );
            }
            this.start = start;
            this.end = end;
        }

        public Date getStart() {
            return start;
        }

        public Date getEnd() {
            return end;
        }
    }

    static class PeriodDefense_v1 {
        private final Date start;
        private final Date end;

        PeriodDefense_v1(Date start, Date end) {
//            prevent TOCTOU attack
            this.start = new Date(start.getTime());
            this.end = new Date(end.getTime());
            if (this.start.compareTo(this.end) > 0) {
                throw new IllegalArgumentException(
                        this.start + " after " + this.end
                );
            }
        }

        public Date getStart() {
            return start;
        }

        public Date getEnd() {
            return end;
        }
    }

    static class PeriodDefense_v2 {
        private final Date start;
        private final Date end;

        PeriodDefense_v2(Date start, Date end) {
//            prevent TOCTOU attack
            this.start = new Date(start.getTime());
            this.end = new Date(end.getTime());
            if (this.start.compareTo(this.end) > 0) {
                throw new IllegalArgumentException(
                        this.start + " after " + this.end
                );
            }
        }

        public Date getStart() {
            return new Date(start.getTime());
        }

        public Date getEnd() {
            return new Date(start.getTime());
        }
    }

    //clone defence copy
    static class PeriodDefense_v3 {
        private final Date start;
        private final Date end;

        PeriodDefense_v3(Date start, Date end) {
//            prevent TOCTOU attack
            this.start = (Date) start.clone();
            this.end = (Date) end.clone();
            if (this.start.compareTo(this.end) > 0) {
                throw new IllegalArgumentException(
                        this.start + " after " + this.end
                );
            }
        }

        public Date getStart() {
            return (Date) start.clone();
        }

        public Date getEnd() {
            return (Date) end.clone();
        }
    }
}
