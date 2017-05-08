function СчётАктивПроводки() {

	var активыСчетов  = {{активыСчетов}};
	this.счёт = ko.observable({{счёт}});
	
	this.активыСчёта = ko.pureComputed(function() {
		return активыСчетов[this.счёт()];
	}.bind(this));
	
}

ko.applyBindings(new СчётАктивПроводки());
