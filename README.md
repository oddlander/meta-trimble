meta-trimble
============

This layer (will eventually) provide support for Trimble's specific
boards/machines for use with OpenEmbedded and/or Yocto.


Boards/Machines supported by this layer:
========================================

* i.MX51 based:
  * [IMC](conf/machine/trmb-imx51-imc.conf) - `trmb-imx51-imc`
  * [CCB](conf/machine/trmb-imx51-ccb.conf) - `trmb-imx51-ccb`
  * [IPCR3](conf/machine/trmb-imx51-ipcr3.conf) - `trmb-imx51-ipcr3`
* Zynq based:
  * [CCB](conf/machine/trmb-zc702-ccb.conf) - `trmb-zc702-ccb`
  * [GURU](conf/machine/trmb-zc702-guru.conf) - `trmb-zc702-guru`
 
Additional information can be found at:
	http://www.bitbucket.com/trimble-something/index.htm

Maintainers, Mailing list, Patches
==================================

Please send any patches, pull requests, comments or questions for this layer to
the [meta-trimble mailing list](mailto:meta-trimble@trimble.se):



Maintainers:

	Robert Olander	  <robert.olander@trimble.se>
	Thomas Johansson  <thomas.johansson@trimble.se>
	Björn Magnusson   <bjorn.magnusson@trimble.se> 

Dependencies
============

This layer depends on:

	URI: git://git.openembedded.org/bitbake

	URI: git://git.openembedded.org/openembedded-core
	layers: meta

