# play-vue-quasar

Play 2.7 with Vue2 and Quasar, axios, showing a rich UI, no node.js

https://quasar.dev/

This is here to show how simple it is to create a nice looking UI with Quasar,
and no need for node.js in your project

## Screenshot

![Screenshot](https://github.com/fancellu/play-vue-quasar/blob/master/screenshot.png)

## To run

`sbt run`

Point browser at 

`http://localhost:9000/`

## To explore

Enter a number in identity ID field. (read and delete buttons are grayed out until then)

Then click read/delete a few times.

If you enable to "Confirm Delete" checkbox, it will ask you to conifrm before any delete 

Enter a different number. Then click read/delete a few more times.

Then navigate to the audit tab

Click recent to see these stored audit entries (in memory for this simple example)

You can sort by timestamp, identity id, action, and also paginate
 
 You can also filter by identity id with the search icon in the identityID field, or by right mouse clicking
 on an identity ID in the table and choosing search
