$( function(){
	switch (menu) {
	case 'About':
		$('#about').addClass('active');
		break;
		
	case 'Contact':
		$('#contact').addClass('active');
		break;

	case 'AllProducts':
		$('#products').addClass('active');
		break;
		
	default:
		$('#products').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
});