import mysql.connector
import os
from tkinter import messagebox
from tkinter import*
from PIL import ImageTk

top = Tk()
top.geometry("1490x750+10+10")
top.resizable(0, 0)
top.title("LOGIN PAGE !!")
bg=ImageTk.PhotoImage(file="bg.png")
bg_image=Label(top,image=bg).place(x=0,y=0,width=1490,height=750)
Topframe = Frame(top,bg='#fff',height=500,width=600).place(x=180,y=180)

def sign():
    top.destroy()
    os.system('python signup.py')

def dashboard():
    top.destroy()
    os.system('python maindashboard.py')

def clear():
    tb1.delete(0,'end')
    tb2.delete(0,'end')

def login():
    userid = tb1.get()
    passid = tb2.get()

    if userid == "":
        messagebox.showwarning("Warning", "Username Field Should Not Be Empty")
    else:
        if passid == "":
            messagebox.showwarning("Warning","Password Field Should Not Be Empty")
        else:
            print(userid, passid)
            clear()
            confirm(userid,passid)

def confirm(userid,passid):
    try:
        db = mysql.connector.connect(host="localhost",user="root",password="",db="recharge")
        cursor = db.cursor()
        savequery = "SELECT * FROM login WHERE Username= '" + userid + "' AND Password = '" + passid + "'"
        print(savequery)
        try:
            cursor.execute(savequery)
            rows = cursor.fetchall()
            numrows = int(cursor.rowcount)
            print(numrows)
            if numrows == 1:
                messagebox.showinfo("Information","Login Successful!")
                dashboard()
            else:
                messagebox.showerror("Error", "Invalid Username Or Password Or Email id Please Retry!")
        except mysql.connector.Error as e:
            messagebox.showinfo("Error",e)
    except mysql.connector.Error as e:
        messagebox.showinfo("Error",e)
    db.close()


a1 = StringVar()
a2 = StringVar()

t1 = Label(top,text="WELCOME TO ROADSTR PAYMENT SYSTEM !!",bg='#000',fg='#ffea00',font='Times 40 bold').place(x=150,y=20)

t2 = Label(Topframe,text="LOGIN HERE !!",bg='#fff',fg='#ff0022',font='Arial 40 bold').place(x=300,y=200)
t5 = Label(Topframe,text="EXISTING USERS ONLY !!",bg='#fff',fg='#000',font='Times 10 bold').place(x=400,y=270)
t3 = Label(Topframe,text="USERNAME :",bg='#fff',fg='#000',font='Times 25 bold').place(x=225,y=350)
t4 = Label(Topframe,text="PASSWORD :",bg='#fff',fg='#000',font='Times 25 bold').place(x=225,y=450)

tb1 = Entry(font=("Times",20),bg="lightgray")
tb1.place(x=450,y=360,width=250)
tb2 = Entry(font=("Times",20),bg="lightgray",show="*")
tb2.place(x=450,y=450,width=250)

b1 = Button(Topframe,text="LOG-IN",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=login).place(x=250,y=550)
b2 = Button(Topframe,text="SIGN-UP",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=sign).place(x=450,y=550)

top.mainloop()
