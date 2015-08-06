
	var exec = require('cordova/exec');
	
	var viapplink = function()	{
		exec( null, null, "ViappLink", "execute", [] );
	};
	
	module.exports = viapplink;
