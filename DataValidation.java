/* 
* Data Validation

* This program has the user complete several questions, and loops unit the user inputs the answer correctly.

* Toronto, Canada
* modified 20230720
* date     20230720
* @author  Kezia Sorensen  
* @version 1.0
 */



import java.util.Scanner;

/**
 *
 * @author ruruk
 */
public class DataValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        
        String userInput;
        int length, userNum, remainder;
        boolean valid;
        
        
        
         // stage 1 start
         
        valid = false;
        
        System.out.println(" ");
        
        System.out.println("Please input a phrase that is over 6 characters long: ");
        
        while (valid == false)
                {
                     
                    try 
                    {
                        userInput = keyedInput.nextLine();
                        length = userInput.length();
                            
                            while (length <= 6)
                            {
                                System.out.println("Wrong. You must use over 6 characters. "); 
                                userInput = keyedInput.nextLine();
                                length = userInput.length();
                            }
                    
                        
                    System.out.println("valid input! Great! ");
                    valid = true;
                            
                    } catch (Exception e)
                        {
                             System.out.println("Invalid input ");       
                        }
 
                } // stage 1 end
        
         
        
         // stage 2 start
         valid = false;
        
        System.out.println(" ");
        
        System.out.println("Please input a phrase that includes the lowercase letter 'a' : ");
        
        while (valid == false)
                {
                     
                    try 
                    {
                        userInput = keyedInput.nextLine();
                        boolean contains = userInput.contains("a");
                            
                            while (contains != true) // making sure the phrase has an a in it
                            {
                                System.out.println("Wrong. Your phrase must include the lowercase letter 'a'. "); 
                                userInput = keyedInput.nextLine();
                                contains = userInput.contains("a");
                            }
                    
                        
                    System.out.println("Valid input! Great! On to the next stage. ");
                    valid = true;
                            
                    } catch (Exception e)
                        {
                             System.out.println("Invalid input ");       
                        }
 
                } // stage 2 end
        
        
        
        // stage 3 start
        
         valid = false;
        
        System.out.println(" ");
        
        System.out.println("Please input a phrase that does not include the lowercase letter 'z' and is between 5 and 15 characters long: "); 
        
        while (valid == false)
                {
                     
                    try 
                    {
                        userInput = keyedInput.nextLine();
                        length = userInput.length();
                        boolean contains = userInput.contains("z");
                        boolean check;
                        
                        if (contains != false)
                            { 
                               check = false;
                            } else if ((length < 5) || (length > 15))
                            {
                               check = false;
                            }  
                            else 
                            {
                                check = true;
                            }
                        
                        String newuserInput;
                        
                        while (check != true)
                            {
                                System.out.println("Wrong. Your phrase must not include the lowercase letter 'z' and must be between 5 and 15 characters long. "); 
                                newuserInput = keyedInput.nextLine();
                                contains = newuserInput.contains("z");
                                length = newuserInput.length();
                                
                                    if (contains != false)
                                        { 
                                       check = false;
                                    } else if ((length < 5) || (length > 15))
                                        {
                                       check = false;
                                    } else 
                                        {
                                        check = true;
                                    }
                            } 
                        {
                }
                         
                    System.out.println("Valid input! Great! On to the next stage. ");
                    valid = true;
                            
                    } catch (Exception e)
                        {
                             System.out.println("Invalid input ");       
                        }
 
                } // stage 3 end
        
        
         // stage 4 start
         
        valid = false;
        
        System.out.println(" ");
        
        System.out.println("Please input an integer between 5 and 500: ");
        
        while (valid == false)
                {
                    try 
                    {
                        userInput = keyedInput.nextLine();
                        userNum = Integer.parseInt(userInput);
                        
                            while ( (userNum > 500 || userNum < 5))
                                {
                                System.out.println("Wrong. You must input an integer that is between 5 and 500. "); 
                                userInput = keyedInput.nextLine();
                                userNum = Integer.parseInt(userInput);
                                }
                    
                        System.out.println("Valid input! Great! ");
                        valid = true;
                            
                    } catch (Exception e)
                        {
                             System.out.println("Invalid input ");       
                        }
 
                } // stage 4 end
        
         
        // stage 5 start
         
        valid = false;
        
        System.out.println(" ");
        System.out.println("Please input a negative integer: ");
        
        while (valid == false)
                {
                     
                    try 
                    {
                        userInput = keyedInput.nextLine();
                        userNum = Integer.parseInt(userInput);
                            
                            while (userNum >= 0)
                            {
                                System.out.println("Wrong. It must be a negative integer. "); 
                                userInput = keyedInput.nextLine();
                                userNum = Integer.parseInt(userInput);
                            }
                    
                    System.out.println("Valid input! Great! ");
                    valid = true;
                            
                    } catch (Exception e)
                        {
                             System.out.println("Invalid input ");       
                        }
                } // stage 5 end
        
         // stage 6 start
         
        valid = false;
        
        System.out.println(" ");
        
        System.out.println("Please input a potitive, odd integer: ");
        
        while (valid == false)
                {
                     
                    try 
                    {
                        userInput = keyedInput.nextLine();
                        userNum = Integer.parseInt(userInput);
                        
                        remainder = userNum % 2; 
                        boolean check;
                        
                        if (remainder != 1) {
                            check = false;
                        } else if (userNum <= 0) // zero is not a positive number
                        {
                            check = false;
                        }
                        else 
                        {
                            check = true;
                        }
                        
                            while (check != true)
                            {
                                System.out.println("Wrong. It must be a positive and odd integer. "); 
                                userInput = keyedInput.nextLine();
                                userNum = Integer.parseInt(userInput);
                                
                                remainder = userNum % 2; 
                                
                                 if (remainder != 1)
                                {
                                   check = false;
                                }
                                else if (userNum <= 0)
                                {
                                  check = false;
                                  
                                } else {
                                  check = true;
                                }  
                            }
                    
                    System.out.println("valid input! Great! ");
                    valid = true;
                    
                    System.out.println("Thank you for using the Data Validation Software!! ");
                            
                    } catch (Exception e)
                        {
                             System.out.println("Invalid input ");       
                        }
 
                } // stage 6 end
    }
    
}
