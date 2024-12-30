from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def first(request):
	return HttpResponse(request,"first to the Django project")
def second(request):
	return HttpResponse(request,"second to the Django project")
def head(req):
    return HttpResponse("<h3>Welcome to django project</h3>")
