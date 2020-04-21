import sqlite3
#importing and implementing SQLite3 into the programm

db = sqlite3.connect('C:/Users/Cristiano/assessment.db')
cursor = db.cursor()

#setting up some variables to use 
choice = 0
shopperId = ''
run = True

#first page to select the shopper ID
welcome = '    Welcome to the ORINOCO customer database    '
print('\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n') # using this line to clear the terminal window
print(welcome.center(100,'-'))
print('\n')
customer_id = input('Input customer ID: ')

#Menu
while run :
    print('ORINOCO - SHOPPER MAIN MENU')
    print('___________________________\n')
    
    print('\n1- Display your order')
    print('2- Add an item to your basket')
    print('3- View your basket')
    print('4- Checkout')
    print('5- Exit')
    choice = int(input('Enter your choice: \n'))

    if(choice == 1):
        print('choose 1')
        
        sql_query = 'SELECT shopper_orders.order_id, \
                        shopper_orders.order_date, \
                        products.product_description, \
                        sellers.seller_name, \
                        PRINTF("£ %7.2f",ordered_products.price), \
                        ordered_products.quantity, \
                        ordered_products.ordered_product_status\
                    FROM shopper_orders \
                        INNER JOIN ordered_products  ON shopper_orders.order_id = ordered_products.order_id\
                        INNER JOIN sellers ON ordered_products.seller_id = sellers.seller_id\
                        INNER JOIN products ON ordered_products.product_id = products.product_id \
                        WHERE shopper_orders.shopper_id=(?)\
                    ORDER BY shopper_orders.order_date DESC'
        cursor.execute(sql_query,(customer_id,))
        order_row = cursor.fetchall()
        print('\nOrderId\t\tOrder Date\tProduct Description\t\t\t\t\t\t\t\t\t\t\tSeller\t\t\tPrice\t\tQty\tStatus\n\n')
        for output in order_row:
            order_id = output[0]
            order_date = output[1]
            product_description = output[2]
            seller_name = output[3]
            price = output[4]
            quantity = output[5]
            ordered_product_status = output[6]
            
            print('{0}\t\t{1:10}\t{2:100}\t{3:17}\t{4:8}\t{5:3}\t{6:10}\n'
                .format(order_id, order_date, product_description, seller_name, price, quantity, ordered_product_status))
        print('\n\n')
            
    elif(choice == 2):
        print('choose 2')
        print('this option is not yet working')
    
    elif(choice == 3):
        print('choose 3')
        print('this option is not yet working')
    
    elif(choice == 4):
        print('choose 4')
        print('this option is not yet working')
    
    elif(choice == 5):
        print('you choose to exit')
        run = False
    
    else:
        print('Choose a number between 1 and 5\n')



db.close()