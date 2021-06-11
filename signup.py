import mysql.connector
import os
from tkinter import messagebox
from tkinter import*
from tkinter import ttk
from PIL import ImageTk


top = Tk()
top.geometry("1490x750+10+10")
top.resizable(0, 0)
top.title("SIGN PAGE !!")
bg=ImageTk.PhotoImage(file="bg.png")
bg_image=Label(top,image=bg).place(x=0,y=0,width=1490,height=750)
Topframe = Frame(top,bg='#fff',height=500,width=1200).place(x=200,y=200)

def redirect():
    top.destroy()
    os.system('python login.py')

def login():
    name = tb1.get()
    gender = cb1.get()
    state = cb.get()
    adress = tb3.get()
    mobile = tb4.get()
    emailid = tb5.get()
    username = tb6.get()
    password = tb7.get()
    print(name, gender, state, adress, mobile, emailid, username, password)
    if name == "":
        messagebox.showwarning("Warning", "Invalid Name")
    else:
        if gender == "":
            messagebox.showwarning("Warning", "Invalid Gender")
        else:
            if state == "":
                messagebox.showwarning("Warning", "Invalid state")
            else:
                if mobile == "":
                    messagebox.showwarning("Warning", "Invalid mobile")
                else:
                    if emailid == "":
                        messagebox.showwarning("Warning", "Invalid Email-ID")
                    else:
                        if username == "":
                            messagebox.showwarning("Warning", "Invalid Username")
                        else:
                            if password == "":
                                messagebox.showwarning("Warning", "Invalid Password")
                            else:
                                logintodb(name, gender, state, adress, mobile, emailid, username, password)



def logintodb(Name,Gender,States,Address,Mobile,Email,username,password):
    try:
        db = mysql.connector.connect(host="localhost",user="root",password="",db="recharge")
        cursor = db.cursor()
        savequery = "insert into ragister (Name,Gender,States,Address,Mobile,Email) values (%s,%s,%s,%s,%s,%s)"
        try:
            cursor.execute(savequery,(Name,Gender,States,Address,Mobile,Email))
            db.commit()
        except mysql.connector.Error as e:
            messagebox.showinfo("Error",e)
    except mysql.connector.Error as e:
        messagebox.showinfo("Error",e)

    try:
        db = mysql.connector.connect(host="localhost",user="root",password="",db="recharge")
        cursor = db.cursor()
        savequery = "insert into login (username,password) values (%s,%s)"
        try:
            cursor.execute(savequery,(username,password))
            db.commit()
            messagebox.showinfo("Information","Entry Added Successfully! You Are About To Redirect On Login Page!")
            redirect()
        except mysql.connector.Error as e:
            messagebox.showinfo("Error",e)
    except mysql.connector.Error as e:
        messagebox.showinfo("Error",e)
    db.close()




t11 = Label(top,text="SIGN UP",bg='#000',fg='#ffea00',font='Times 40 bold').place(x=10,y=10)
t1 = Label(Topframe,text="NAME : ",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=275,y=260)
t2 = Label(Topframe,text="GENDER :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=275,y=320)
t3 = Label(Topframe,text="STATES :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=275,y=380)
t4 = Label(Topframe,text="ADDRESS :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=275,y=440)
t5 = Label(Topframe,text="MOBILE NO. :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=275,y=500)
t6 = Label(Topframe,text="EMAIL-ID :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=275,y=560)
t7 = Label(Topframe,text="USERNAME :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=850,y=260)
t8 = Label(Topframe,text="PASSWORD :",bg='#fff',fg='#000',font=("Times", 25,"bold")).place(x=850,y=320)

tb1 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb1.place(x=550,y=275,width=250)

tb3 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb3.place(x=550,y=515,width=250)

tb4 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb4.place(x=550,y=445,width=250)

tb5 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb5.place(x=550,y=570,width=250)

tb6 = Entry(Topframe,font=("Times",20),bg="lightgray")
tb6.place(x=1100,y=275,width=250)

tb7 = Entry(Topframe,show="*",font=("Times",20),bg="lightgray")
tb7.place(x=1100,y=325,width=250)

course = ["Uttar Pradesh","Maharastra","Gujarat","Hyderabad","Karnataka","Andhra Pradesh","Tamil Nadu","Rajasthan","Kerala","West Bengal","Delhi","Odisha","Punjab","Jammu Kashmir","Bihar","Madhya Pradesh","Assam","Telangana","Jharkhand","Haryana","Chhattisgarth","Uttarakhand","Goa","Himachal Pradesh","Arunachal Pradesh","Tripura","Nagaland","Meghalay","Mizoram","Sikkim","Manipur"]
cb = ttk.Combobox(Topframe,values=course,width=38,height=30)
cb.place(x=550,y=390)
cb.current(0)

course1 = ["MALE","FEMALE","OTHER"]
cb1 = ttk.Combobox(Topframe,values=course1,width=38,height=30)
cb1.place(x=550,y=330)
cb1.current(0)

b2 = Button(Topframe,text="SIGN-UP",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=login).place(x=1000,y=425)
top.mainloop()