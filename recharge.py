import mysql.connector
import os
from tkinter import messagebox
from tkinter import*
from tkinter import ttk
from PIL import ImageTk
from datetime import *

top = Tk()
top.geometry("1490x750+10+10")
top.resizable(0, 0)
top.title("RECHARGE HERE !!")
bg=ImageTk.PhotoImage(file="bg.png")
bg_image=Label(top,image=bg).place(x=0,y=0,width=1490,height=750)
Topframe = Frame(top,bg='#fff',height=500,width=800).place(x=280,y=200)

def clear():
    tb3.delete(0, 'end')
    tb5.delete(0, 'end')

def dashboard():
    top.destroy()
    os.system('python maindashboard.py')

def login():
    today = date.today()
    now = datetime.now()
    T_time = now.strftime("%H:%M:%S")
    T_date = today.strftime("%d/%m/%Y")
    service_provider = cb.get()
    plan = cb1.get()
    A = tb5.get()
    mobNo = tb3.get()
    print(T_time,T_date,service_provider,A,plan,mobNo)
    if today == "":
        messagebox.showwarning("Warning", "Date not set")
    else:
        if now == "":
            messagebox.showwarning("Warning", "Time not set")
        else:
            if service_provider == "":
                messagebox.showwarning("Warning", "Please select service provider")
            else:
                if plan == "":
                    messagebox.showwarning("Warning", "Please select a plan")
                else:
                    if mobNo == "":
                        messagebox.showwarning("Warning", "Invalid Mobile Number")
                    else:
                        if A == "":
                            messagebox.showwarning("Warning", "Please Insert an Amount")
                        else:
                            confirm(T_time, T_date, service_provider, A, plan, mobNo)



def confirm(T_time,T_date,service_provider,A,plan,mobNo):
    try:
        db = mysql.connector.connect(host="localhost",user="root",password="",db="recharge")
        cursor = db.cursor()
        savequery = "SELECT Amount FROM finalpay WHERE  Mobile_No = '" + mobNo + "'"
        print(savequery)
        try:
            cursor.execute(savequery)
            rows = cursor.fetchone()
            print(rows[0])
            Amount = rows[0]
            numrows = int(cursor.rowcount)
            print(numrows)
        except mysql.connector.Error as e:
            messagebox.showinfo("Error",e)
    except mysql.connector.Error as e:
        messagebox.showinfo("Error",e)

    try:
        db = mysql.connector.connect(host="localhost",user="root",password="",db="recharge")
        cursor = db.cursor()
        savequery = "UPDATE finalpay SET Transaction_Time='" + T_time + "'" + ",Transaction_Date='" + T_date + "'" + ",Service_Provider='" + service_provider + "'" + ",Amount=" + "(" + str(Amount) + "-" + str(A) + ")" + ",Plan='" + plan + "' WHERE Mobile_No='" + mobNo + "'"
        print(savequery)
        try:
            cursor.execute(savequery)
            db.commit()
            numrows = int(cursor.rowcount)
            print(numrows)
            if numrows == 1:
                messagebox.showinfo("Information","Recharge Successful!!")
                clear()
                dashboard()
            else:
                messagebox.showerror("Error", "Something went wrong")
                clear()
        except mysql.connector.Error as e:
            messagebox.showinfo("Error",e)
            clear()
    except mysql.connector.Error as e:
        messagebox.showinfo("Error",e)
        clear()
    db.close()


t11 = Label(top,text="RECHARGE",bg='#000',fg='#ffea00',font='Times 40 bold').place(x=10,y=10)
t1 = Label(Topframe,text="TRANSACTION DATE :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=260)
t2 = Label(Topframe,text="TRANSACTION TIME :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=320)
t3 = Label(Topframe,text="MOBILE NO :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=380)
t4 = Label(Topframe,text="SERVICE PROVIDER :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=440)
t5 = Label(Topframe,text="PLAN :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=500)
t6 = Label(Topframe,text="AMOUNT :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=560)

t7 = Label(Topframe,text="AUTO-GENERATED",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=700,y=260)
t8 = Label(Topframe,text="AUTO-GENERATED",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=700,y=320)
tb3 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb3.place(x=700,y=385,width=250)
tb5 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb5.place(x=700,y=570,width=250)

course = ["Jio","Idea","Vodafone","Airtel","Bsnl","Uninor","Telinor"]
cb = ttk.Combobox(Topframe,values=course,width=38,height=30)
cb.place(x=700,y=455)
cb.current(0)

course1 = ["PostPaid","PrePaid"]
cb1 = ttk.Combobox(Topframe,values=course1,width=38,height=30)
cb1.place(x=700,y=515)
cb1.current(0)

b2 = Button(Topframe,text="RECHARGE",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=login).place(x=500,y=625)
b5 = Button(Topframe,text="BACK TO HOME",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=dashboard).place(x=700,y=625)

top.mainloop()