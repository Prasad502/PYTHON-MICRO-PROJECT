import mysql.connector
import os
from tkinter import messagebox
from tkinter import*
from tkinter import ttk
from PIL import ImageTk

top = Tk()
top.geometry("1490x750+10+10")
top.resizable(0, 0)
top.title("LOGIN PAGE !!")
bg=ImageTk.PhotoImage(file="bg.png")
bg_image=Label(top,image=bg).place(x=0,y=0,width=1490,height=750)
Topframe = Frame(top,bg='#fff',height=500,width=800).place(x=280,y=200)


def redirect():
    top.destroy()
    os.system('python maindashboard.py')

def login():
    Mobile_No = tb1.get()
    card_number = tb2.get()
    cvv = tb3.get()
    card_date = tb4.get()
    type_card = cb1.get()
    Amount = tb5.get()

    print(Mobile_No,card_number,cvv,card_date,type_card,Amount)

    if Mobile_No == "":
        messagebox.showwarning("Warning", "Invalid Mobile Number")
    else:
        if card_number == "":
            messagebox.showwarning("Warning", "Invalid card Number")
        else:
            if cvv == "":
                messagebox.showwarning("Warning", "Invalid CVV")
            else:
                if card_date == "":
                    messagebox.showwarning("Warning", "Invalid Card Date")
                else:
                    if type_card == "":
                        messagebox.showwarning("Warning", "Invalid Card Type")
                    else:
                        if Amount == "":
                            messagebox.showwarning("Warning", "Invalid Amount")
                        else:
                            logintodb(Mobile_No, card_number, cvv, card_date, type_card, Amount)

def logintodb(Mobile_No,card_number,cvv,card_date,type_card,Amount):
    try:
        db = mysql.connector.connect(host="localhost",user="root",password="",db="recharge")
        cursor = db.cursor()
        savequery = "insert into finalpay (Mobile_No,card_number,cvv,card_date,type_card,Amount) values (%s,%s,%s,%s,%s,%s)"
        try:
            cursor.execute(savequery,(Mobile_No,card_number,cvv,card_date,type_card,Amount))
            db.commit()
            messagebox.showinfo("Information","Money Added Successfully")
            redirect()
        except mysql.connector.Error as e:
            messagebox.showinfo("Error",e)
    except mysql.connector.Error as e:
        messagebox.showinfo("Error",e)
    db.close()



t11 = Label(top,text="ADD MONEY",bg='#000',fg='#ffea00',font='Times 40 bold').place(x=10,y=10)
t1 = Label(Topframe,text="MOBILE NO.:",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=260)
t2 = Label(Topframe,text="CARD NO :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=320)
t3 = Label(Topframe,text="CVV :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=380)
t4 = Label(Topframe,text="CARD DATE :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=440)
t5 = Label(Topframe,text="CARD NAME :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=500)
t6 = Label(Topframe,text="AMOUNT :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=560)

tb1 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb1.place(x=650,y=275,width=250)
tb2 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb2.place(x=650,y=330,width=250)
tb3 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb3.place(x=650,y=385,width=250)
tb4 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb4.place(x=650,y=445,width=250)
tb5 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb5.place(x=650,y=570,width=250)

course1 = ["Visa","Chase Freedom","Citi Cash Card","Mastercard","Bank of America","Citi Simplicity","Citibank","American Express"," Capital One"]
cb1 = ttk.Combobox(Topframe,values=course1,width=38,height=50)
cb1.place(x=650,y=515)
cb1.current(0)

b2 = Button(Topframe,text="ADD MONEY",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=login).place(x=500,y=625)
b5 = Button(Topframe,text="BACK TO HOME",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=redirect).place(x=700,y=625)

top.mainloop()