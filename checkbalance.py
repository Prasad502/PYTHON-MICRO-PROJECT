import mysql.connector
import os
from tkinter import messagebox
from tkinter import *
from PIL import ImageTk

top = Tk()
top.geometry("1490x750+10+10")
top.resizable(0, 0)
top.title("LOGIN PAGE !!")
bg=ImageTk.PhotoImage(file="bg.png")
bg_image=Label(top,image=bg).place(x=0,y=0,width=1490,height=750)
Topframe = Frame(top,bg='#fff',height=500,width=800).place(x=280,y=200)


def dashboard():
    top.destroy()
    os.system('python maindashboard.py')

def login():
    mobNo = tb1.get()
    if (mobNo == ""):
        messagebox.showerror("Error","Invalid Mobile Number")
    print(mobNo)
    confirm(mobNo)

def confirm(mobNo):
    try:
        db = mysql.connector.connect(host="localhost", user="root", password="", db="recharge")
        cursor = db.cursor()
        savequery = "SELECT * FROM finalpay WHERE Mobile_No = '" + mobNo + "'"
        print(savequery)
        try:
            cursor.execute(savequery)
            rows = cursor.fetchone()
            print(rows)
            numrows = int(cursor.rowcount)
            print(numrows)
            t8.config(text=rows[0])
            t9.config(text=rows[1])
            t10.config(text=rows[2])
            t12.config(text=rows[3])
            t13.config(text=rows[5])
            t14.config(text=rows[4])
            if numrows == 1:
                messagebox.showinfo("Information", "DATA RETRIEVED !!")
            else:
                messagebox.showerror("Error", "Invalid Mobile Number")
        except mysql.connector.Error as e:
            messagebox.showinfo("Error", e)
    except mysql.connector.Error as e:
        messagebox.showinfo("Error", e)
    db.close()


t11 = Label(top,text="CHECK BALANCE",bg='#000',fg='#ffea00',font='Times 40 bold').place(x=10,y=10)
t1 = Label(Topframe,text="TRANSACTION DATE :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=340)
t2 = Label(Topframe,text="TRANSACTION TIME :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=400)
t3 = Label(Topframe,text="MOBILE NO :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=460)
t4 = Label(Topframe,text="SERVICE PROVIDER :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=520)
t5 = Label(Topframe,text="PLAN :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=580)
t6 = Label(Topframe,text="AMOUNT :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=640)
t7 = Label(Topframe,text="MOBILE NO. :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=325,y=260)


t8 = Label(Topframe,text="-",bg='#fff',fg='#000',font=("Times", 25,"bold"))
t8.place(x=725,y=340)

t9 = Label(Topframe,text="-",bg='#fff',fg='#000',font=("Times", 25,"bold"))
t9.place(x=725,y=400)

t10 = Label(Topframe,text="-",bg='#fff',fg='#000',font=("Times", 25,"bold"))
t10.place(x=725,y=460)

t12 = Label(Topframe,text="-",bg='#fff',fg='#000',font=("Times", 25,"bold"))
t12.place(x=725,y=520)

t13 = Label(Topframe,text="-",bg='#fff',fg='#000',font=("Times", 25,"bold"))
t13.place(x=725,y=580)

t14 = Label(Topframe,text="-",bg='#fff',fg='#000',font=("Times", 25,"bold"))
t14.place(x=725,y=640)

tb1 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb1.place(x=590,y=265,width=250)
b1 = Button(Topframe,text="CHECK",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=login).place(x=900,y=250)
b2 = Button(Topframe,text="BACK TO HOME",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=dashboard).place(x=400,y=690)

top.mainloop()