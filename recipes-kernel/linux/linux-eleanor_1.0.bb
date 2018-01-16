# Adapted from linux-imx.inc, copyright (C) 2013, 2014


# ROBBAN use comunity kernel (as babbage)
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
include recipes-kernel/linux/linux-fslc.inc

# Copyright (C) 2012-2017 Trimble
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel for Eleanor Board \
Based on FSL Community BSP Linux mainline kernel with backported features and fixes"

DESCRIPTION = "Changes to FSL Community BSP mainline kernel to acomodate Trimble IMC board."


SRC_URI += "file://imx51-imc.dts \
"

do_compile_prepend () {
	cp ${WORKDIR}/imx51-imc.dts \
	${S}/arch/${ARCH}/boot/dts
}

#PV = "4.9+git${SRCPV}"

SRCBRANCH = "4.9.x+fslc"
LOCALVERSION = "-robban-fslc"
SRCREV = "${AUTOREV}"


COMPATIBLE_MACHINE = "(imx51-imc)"







