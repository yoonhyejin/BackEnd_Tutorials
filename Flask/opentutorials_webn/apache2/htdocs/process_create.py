#!/usr/local/bin/python3
print("Content-Type: text/html")
print()
import cgi

# 사용자가 입력한 데이터 받음
form = cgi.FieldStorage()
title = form["title"].value
description = form['description'].value

# 새로운 파일 생성하여 쓰기
opened_file = open('data/'+title, 'w')
opened_file.write(description)
opened_file.close()

#Redirection
print("Location: index.py?id="+title)
print()
