DESCRIPTION = "additional system packages"

PR = "r1"

inherit packagegroup

LICENSE = "MIT"

PACKAGES = "\
         packagegroup-venus-base \
         "

# build but not installed in the image
DEPENDS = "\
	gdb \
	git \
	tcpdump \
	tmux \
	vim \
"

RDEPENDS_${PN} = "\
	bash \
	bsdiff \
	bzip2 \
	cronie \
	curl \
	dbus \
	e2fsprogs \
	iproute2 \
	iw \
	kernel-modules \
	ldd \
	less \
	linux-firmware-rt2800 \
	linux-firmware-rt73 \
	linux-firmware-rtl8192cu \
	miniupnpc \
	mtd-utils \
	mtd-utils-ubifs \
	nano \
	ntp-utils \
	ntpdate \
	openssh \
	openssh-sftp-server \
	opkg \
	opkg-collateral \
	rsync \
	screen \
	strace \
	tzdata \
	tzdata-africa \
	tzdata-americas \
	tzdata-antarctica \
	tzdata-arctic \
	tzdata-asia \
	tzdata-atlantic \
	tzdata-australia \
	tzdata-europe \
	tzdata-pacific \
	watchdog \
	zip \
"