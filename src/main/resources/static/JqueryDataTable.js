$(document).ready( function () {
	 var table = $('#clinicaltrials').DataTable({
			"sAjaxSource": "/clinicaltrials",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
		          { "mData": "nctid" },
				  { "mData": "officialTitle" },
				  { "mData": "phase" },
				  { "mData": "completionDate" }
			]
	 })
});