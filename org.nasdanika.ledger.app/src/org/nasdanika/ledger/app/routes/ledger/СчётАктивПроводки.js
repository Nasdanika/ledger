function СчётАктивПроводки() {
	
	
	this.счёт = ko.observable({{счёт}});
	
	var Актив = function(name, cdoId) {
		this.name = name;
		this.cdoId = cdoId;		
	};
	
	this.активыСчёта = ko.pureComputed(function() {
		return [new Актив(this.счёт, 'L13')];
	}.bind(this));
	
}

ko.applyBindings(new СчётАктивПроводки());
