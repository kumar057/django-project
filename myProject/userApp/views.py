from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def first(request):
    return HttpResponse("first to the django project")

def head(req):
    return HttpResponse("<h3>Welcome to django</h3>")