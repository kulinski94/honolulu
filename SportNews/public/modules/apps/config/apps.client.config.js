'use strict';

// Configuring the Articles module
angular.module('apps').run(['Menus',
	function(Menus) {
		// Set top bar menu items
		Menus.addMenuItem('topbar', 'Applications', 'apps', 'dropdown', '/apps(/create)?');
		Menus.addSubMenuItem('topbar', 'apps', 'All applications', 'apps');
		Menus.addSubMenuItem('topbar', 'apps', 'Add new applications', 'apps/create');
	}
]);
