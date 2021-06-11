from tkinter import *
import os
from PIL import ImageTk
import webbrowser

top = Tk()
top.geometry("1490x750+10+10")
top.resizable(0, 0)
top.title("LOGIN PAGE !!")
bg=ImageTk.PhotoImage(file="bg.png")
bg_image=Label(top,image=bg).place(x=0,y=0,width=1490,height=750)
Topframe = Frame(top,bg='#fff',height=500,width=800).place(x=280,y=180)


def recharge():
    top.destroy()
    os.system('python recharge.py')

def addmoney():
    top.destroy()
    os.system('python addmoney.py')

def check():
    top.destroy()
    os.system('python checkbalance.py')

def logout():
    top.destroy()
    os.system('python login.py')

def about():
    url = "https://worldofalp.netlify.app/about.html"
    webbrowser.open_new(url)

def exit():
    top.destroy()

t1 = Label(top,text="HOME",bg='#000',fg='#ffea00',font='Times 40 bold').place(x=10,y=10)
b1 = Button(Topframe,text="RECHARGE",bg="#727eb5",bd=0,font=("Times",30,"bold"),fg="white",command=recharge).place(x=500,y=300)
b2 = Button(Topframe,text="CHECK BALANCE",bg="#727eb5",bd=0,font=("Times",30,"bold"),fg="white",command=check).place(x=500,y=400)
b3 = Button(Topframe,text="ADD MONEY..",bg="#727eb5",bd=0,font=("Times",30,"bold"),fg="white",command=addmoney).place(x=500,y=500)
b4 = Button(Topframe,text="EXIT",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=exit).place(x=770,y=650)
b5 = Button(Topframe,text="ABOUT",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=about).place(x=300,y=650)
b6 = Button(Topframe,text="LOG_OUT",bg="#727eb5",bd=0,font=("Times",20,"bold"),fg="white",command=logout).place(x=900,y=650)

top.mainloop()