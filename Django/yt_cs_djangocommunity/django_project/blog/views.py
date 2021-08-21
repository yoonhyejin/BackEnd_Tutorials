from django.shortcuts import render
from django.http import HttpResponse

posts = [ 
    {
    'author' : 'Author1',
    'title' : 'Blog Post 1',
    'content' : 'First post content',
    'date_posted' : 'August 27 2021'
},
{
    'author' : 'Author2',
    'title' : 'Blog Post 2',
    'content' : 'Second post content',
    'date_posted' : 'August 17 2021'
}
]

def home(request):
    contexts = {'posts' : posts}
    return render(request, 'blog/home.html', contexts)

def about(request):
    return render(request, 'blog/about.html')