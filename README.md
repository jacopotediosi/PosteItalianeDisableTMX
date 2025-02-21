# PosteItalianeDisableTMX

This LSPosed module disables ThreatMetrix tracking in the Poste Italiane (com.posteitaliane.spim) app, which uses the Usage Data Access permission to exfiltrate (imho) sensitive data from our Android devices.

By default, users can deny this permission, but only for a limited number of app launches. This module fully disables the TMX component, preventing the app from ever requesting the Usage Data Access permission again. As a result, the app skips the permission request and directly loads the home screen.

Reference newspaper article (in Italian): [Why does the Poste app request access to phone data?](https://www.dday.it/redazione/48955/perche-lapp-di-poste-chiede-accesso-ai-dati-del-telefono)

Original author: [Jacopo Tediosi](https://github.com/jacopotediosi/PosteItalianeDisableTMX)
