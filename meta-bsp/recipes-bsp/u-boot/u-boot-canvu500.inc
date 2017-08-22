require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

COMPATIBLE_MACHINE = "canvu500"

UBOOT_LOCALVERSION = "-venus"

SRC_URI = "git://github.com/victronenergy/u-boot.git;protocol=https;branch=canvu500"
SRCREV = "${AUTOREV}"
PV = "2017.09+git${SRCPV}"

S = "${WORKDIR}/git"
