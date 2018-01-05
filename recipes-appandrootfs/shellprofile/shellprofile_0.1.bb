#
# This file was manual added as an example for how to add a file in rootfs of deployed image
#

SUMMARY = "Add general file to rootfs"
SECTION = "applications"
LICENSE = "CLOSED"

do_install() {
	     install -d ${D}${ROOT_HOME}
	     install -m 0644 ${THISDIR}/profile/.profile ${D}${ROOT_HOME}
}

FILES_${PN} += "${ROOT_HOME}"
