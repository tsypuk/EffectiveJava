package joshua;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.testng.Assert.*;

public class Item39DefensiveCopyTest {

    @Test
    public void testNonDefence() {
        Date start = new Date();
        Date end = new Date();
        Item39DefensiveCopy.PeriodDefenseLess period = new Item39DefensiveCopy.PeriodDefenseLess(start, end);
        start.setYear(start.getYear() + 10);
        assertNotEquals(period.getStart(), start);
    }

    @Test
    public void testDefence_v1() {
        Date start = new Date();
        Date end = new Date();
        Item39DefensiveCopy.PeriodDefense_v1 period = new Item39DefensiveCopy.PeriodDefense_v1(start, end);
        start.setYear(start.getYear() + 10);
        assertNotEquals(period.getStart(), start);
        period.getEnd().setYear(period.getEnd().getYear() - 1000);
        assertEquals(period.getEnd(), end);
    }

    @Test
    public void testDefence_v2() {
        Date start = new Date();
        Date end = new Date();
        Item39DefensiveCopy.PeriodDefense_v2 period = new Item39DefensiveCopy.PeriodDefense_v2(start, end);
        start.setYear(start.getYear() + 10);
        assertNotEquals(period.getStart(), start);
        period.getEnd().setYear(period.getEnd().getYear() - 1000);
        assertEquals(period.getEnd(), end);
    }

    class AtackDate extends Date {
        private static final long serialVersionUID = 123421151L;
        private List<StackTraceElement[]> actionList = new ArrayList<StackTraceElement[]>();

        @Override
        public int getYear() {
            actionList.add(Thread.currentThread().getStackTrace());
            return super.getYear();
        }

        public List<StackTraceElement[]> getActionList() {
            return actionList;
        }
    }
    @Test
    public void testDefence_v3() {
        Date start = new AtackDate();
        Date end = new AtackDate();

        Item39DefensiveCopy.PeriodDefense_v3 period = new Item39DefensiveCopy.PeriodDefense_v3(start, end);
        start.setYear(start.getYear() + 10);
        assertNotEquals(period.getStart(), start);
        period.getEnd().setYear(period.getEnd().getYear() - 1000);
        assertEquals(period.getEnd(), end);

        List<StackTraceElement[]> stackTraceElements = ((AtackDate)period.getStart()).getActionList();
        for (StackTraceElement[] traceElement : stackTraceElements) {
            for (StackTraceElement el : traceElement){
                System.out.println(el.getClassName());
                System.out.println(el.getMethodName());
                System.out.println(el.getFileName());
            }
        }
    }
}