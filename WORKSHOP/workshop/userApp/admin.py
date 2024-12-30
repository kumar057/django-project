from django.contrib import migrations

class migration(migrations.migration):

	dependencies = [
	    ('userApp',0002_student),
	]

	operations = [
	    migrations.Renamefield(
	    	model_name='order',
	    	old_name='qun',
	    	new_name='qn',
	    )
    ]