
/**
 * DateWeightYoungHumanDriver class:
 * This is used to test the Date, Weight, and YoungHuman classes
 *
 * @author David Nixon
 * @version 2021
 */
public class DateWeightYoungHumanDriver
{
    public static void main(String [] args){
        /* *** DATE TESTS:  *** */
        System.out.println("Date tests:");
        System.out.println("-----------");
        // construct some date objects and do some tests:
        Date d1 = new Date(6,7,2005);
        System.out.println("Testing getMonth(). Should print 6:  " + d1.getMonth());
        Date d2 = new Date(d1);
        System.out.println("Comparing d1 and d2 (copy constructor of d1)."
        		+ " This should return true: " + d1.equals(d2));
        System.out.println("Printing toString (6/7/2014) " + d1.toString());
        Date invalid = new Date(0,0,0);
        System.out.println("Printing toString (1/1/2014): " + invalid.toString());
        System.out.println("Should print 7: " + d2.getDay());
        Date d4 = new Date(3,13,2017);
        System.out.println("Should print 2017: " + d4.getYear());
        System.out.println("End of Date tests.");
        System.out.println();
        
        
        
        /* *** WEIGHT TESTS:  *** */
        System.out.println("Weight tests:");
        System.out.println("-------------");
        // construct some Weight objects and do some tests:
        Weight invalidw = new Weight(10,17);
        System.out.println("Printing toString for invalidw. " + invalidw.toString());
        Weight w1 = new Weight(14,8);
        System.out.println("Testing getWeight(). Should print 14.5: " +w1.getWeight());
        //copy constructor 
        Weight w2 = new Weight(w1);
        System.out.println("Testing equals method. Should print true: " + w1.equals(w2));
        // constructor only lbs
        Weight w3 = new Weight(10);
        w3.add(2);
        System.out.println("Weight should be 12.0: " + w3.getWeight());
        w3.add(-2, 8);
        System.out.println("Weight should be 10.5: " + w3.getWeight());
        w3.add(-20, 17);
        System.out.println("Weight should not change and should be 10.5: " + w3.getWeight());
        Weight w = new Weight(3);
        w3.add(w);
        System.out.println("Weight should be 13.5: " + w3.getWeight());
        System.out.println("End of Weight tests.");
        System.out.println();
        
        /* *** YOUNGHUMAN TESTS:  *** */
        System.out.println("YoungHuman tests:");
        System.out.println("-----------------");
        // construct some YoungHuman objects and do some tests:
        YoungHuman y1 = new YoungHuman(w1, d1, "Homer", "Simpson");
        System.out.print("Testing getName(): ");
        if (y1.getName().equals("Homer Simpson"))
            System.out.println(" TEST PASSED! :) ");
        else System.out.println(" TEST FAILED!  :( ");
        YoungHuman y2 = new YoungHuman(w3, d4, "Maxine", "McDonald");
        YoungHuman y3 = new YoungHuman(w3, d4, "Maxine", "McDonald");
        System.out.println("Should return (Maxine McDonald): " 
        		+ y2.getName());
        System.out.println("Should return 13 lbs 8oz.: " + y2.getWeight());
        System.out.println("Should return 3/13/2017: " + y2.getBirthDate());
        System.out.println("Comparing y3 and y2."
        		+ " This should return true: " + y2.equals(y3));
        YoungHuman invalidh = new YoungHuman(invalidw, invalid, "b", "c");
        System.out.println("Printing toString of invalidh: " +
        		invalidh.toString());
        y2.setBirthDate(d4);
        Date d5 = new Date(3,12,2014);
        //this should not work 
        System.out.println("Entering an invalid checkup date. It should not work: ");
        y2.setCheckUp(d5);
        Date d6 = new Date(3,15,2018);
        y2.setCheckUp(d6);
        System.out.println("This should return true. " + y2.hasHadCheckUp());
        System.out.println(y2.toString());
        y2.unsetCheckUpDate();
        System.out.println("This should return false. " + y2.hasHadCheckUp());
        System.out.println(y2.toString());
        System.out.println("Comparing y1 and y2. Should return false. "
        		+ y2.equals(y1));
        
      
    }
}

