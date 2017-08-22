SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel
require recipes-kernel/linux/linux-dtb.inc

COMPATIBLE_MACHINE = "canvu500"

LINUX_VERSION = "4.13"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

SRC_URI = "git://github.com/victronenergy/linux.git;protocol=https;branch=canvu500"
SRCREV="${AUTOREV}"
PV = "${LINUX_VERSION}+git${SRCPV}"

SRC_URI += "file://defconfig"
