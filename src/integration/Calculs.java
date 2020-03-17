package integration;

public class Calculs
{
        private final int operande1;
        private final int operande2;

        public Calculs(int operande1, int operande2)
        {
                this.operande1 = operande1;
                this.operande2 = operande2;
        }
        
        // private Calculs c = null;
        // @Before
        // methode() { c= new Calculs(1,2); }
        
        public int multiplier() // public int testMultiplier() if (c.multiplier() == 2 { OK } else { KO } }
        {
                return operande1 * operande2;
        }
        
        public int additionner() // public int testAdditionner()
        {
                return operande1 + operande2;
        }
        
        public int diviser() // public int testDiviser()
        {
                return operande1 / operande2;
        }
        
        public int soustraire() // public int testSoustraire()
        {
                return operande1 - operande2;
        }
        
        public static void main(String args[])
        {
        	Calculs c = new Calculs(1,2);
        	
        	System.out.println("Lancement des tests...\r\n");
        	System.out.println("1+2 = " + c.additionner() + "\r\n");
        	System.out.println("1*2 = " + c.multiplier() + "\r\n");
        	System.out.println("1-2 = " + c.soustraire() + "\r\n");
        	System.out.println("1/2 = " + c.diviser() + "\r\n");
        }
}
