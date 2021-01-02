package StocksInvestorPortfolio;
import StockLinkedList.StockWatchList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainFlow //implements AddStock
{
    public static void main(String[] args) throws ParseException {
        ArrayList<Stock> stocks1 = new ArrayList<>();
        Customer customer = new Customer();
        customer.setPurchaseStock(new ArrayList<>());
        final String CUSTOMER = "customer";


        Scanner scn = new Scanner(System.in);  // Create a Scanner object
        for (int i = 1; i <= 2; i++)
        {
            System.out.println("Are you a Admin or a Customer");
            String login = scn.nextLine();
            if (login.equalsIgnoreCase(CUSTOMER)) {

                CustomerHelper customerHelper = new CustomerHelper();
                ArrayList<Customer> mockCustomers = customerHelper.mockData();

                Date date = new Date();
               /*SimpleDateFormat purchaseDate = new SimpleDateFormat("MM/dd/yyyy");
                purchaseDate.format(new Date());
               */ Scanner cEntry = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter your name");
                String cName = cEntry.nextLine();

                for (int j = 0; j < 10; j++)
                {
                    for(int m = 0; m<mockCustomers.size();m++)
                    //for (Customer mockCustomer : mockCustomers)
                    {
                        if (mockCustomers.get(m).getCustomerName().equals(cName))
                        {
                            System.out.println("Welcome back " + cName);
                            Scanner cEntry1 = new Scanner(System.in);  // Create a Scanner object
                            System.out.println("Enter action to be performed: (Enter 1 2 or 3)\t 1.View Available Stocks  2.Buy Stocks\t 3.View My Portfolio\t 4.Search My Portfolio\t 5.View My Watch List\t 6.Exit Program");
                            int action = cEntry1.nextInt();
                            ArrayList<Stock> watchListArrayList = new ArrayList<>();
                            StockWatchList watchListDLL = new StockWatchList();

                            if(action == 1)
                            {
                                Stock stock = customerHelper.viewAvailableStocks(stocks1);
                                watchListArrayList.add(stock);
                            }
                             watchListDLL.addToWatchList(watchListArrayList);

                            if (action == 2)
                            {
                               Customer updatedCustomer= customerHelper.buyStocks(stocks1, cName, date, mockCustomers.get(m));
                               mockCustomers.get(m).setCustomerName(updatedCustomer.getCustomerName());
                                mockCustomers.get(m).setPurchaseStock(updatedCustomer.getPurchaseStock());

                            }
                            if (action == 3)
                            {

                                customerHelper.viewPortfolio(mockCustomers.get(m));
                            }
                            if(action == 4)
                            {
                                customerHelper.searchPortfolio(mockCustomers.get(m));
                            }
                            if(action == 5)
                            {
                                watchListDLL.display();
                            }
                            if (action == 6)
                            {
                                break;
                            }

                        }
                        if(!cName.equals("Neethu") && !cName.equals("Gouthu"))
                        {
                            System.out.println("Hi " + cName + "Please create ");
                            Scanner cEntry2 = new Scanner(System.in);  // Create a Scanner object
                            System.out.println("Enter action to be performed: (Enter 1 2 or 3)\t 1.Buy Stocks\t 2.View Portfolio\t 3.Search Portfolio\t 4.Exit Program");
                            int action2 = cEntry2.nextInt();

                            if (action2 == 1) {

                                customer = customerHelper.buyStocks(stocks1, cName, date, customer);
                            }

                            if (action2 == 2) {
                                customerHelper.viewPortfolio(customer);
                            }
                           /* if(action==3)
                            {

                            }
                           */
                            if (action2 == 4) {
                                break;
                            }
                        }
                    }

                    // if (cName != "Neethu" || cName != "Gouthu")

                }

            }


            if (login.equals("Admin")) {
                Admin admin = new Admin();
                for (int j = 0; j < 10; j++) {
                    Scanner scn1 = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter action to be performed: (Enter 1 2 or 3)\t 1.Enter Stock\t 2.View Stock\t 3.search Stock\t 4.Exit Program");
                    int action = scn1.nextInt();
                    if (action == 1) {
                        stocks1 = admin.addStocks();
                    }
              /*  System.out.println("Enter action to be performed: (Enter 1 2 or 3)\n 1.Enter Stock\n 2.View Stock\n 3.Dispatch Stock");
                action = scn1.nextInt();
*/
                    if (action == 2) {
                        admin.viewStocks(stocks1);

                    }
                    if (action == 3) {
                        admin.searchStocks(stocks1);

                    }


                    if (action == 4) {
                        break;
                    }
                }
            }

        }
    }



}
