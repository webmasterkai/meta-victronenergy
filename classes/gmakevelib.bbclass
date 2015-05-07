inherit siteinfo

# run ./configure && make && make install
# set DESTDIR / bindir to point to the correct location

bindir := "${@base_conditional('VELIB_DEFAULT_DIRS', '1', '${bindir}', '/opt/victronenergy/${PN}', d)}"
bindir_bpp3 := '${@base_conditional("VELIB_DEFAULT_DIRS", "1", "${bindir}", "/opt/color-control/${PN}", d)}'

oe_runconf () {
	cfgscript="${S}/configure"
	if [ -x "$cfgscript" ] ; then
		bbnote "Running $cfgscript ${CONFIGUREOPTS} ${EXTRA_OECONF} $@"
		set +e
		$cfgscript ${CONFIGUREOPTS} ${EXTRA_OECONF} "$@"
		if [ "$?" != "0" ]; then
			echo "Configure failed. The contents of all config.log files follows to aid debugging"
			find ${S} -name config.log -print -exec cat {} \;
			bbfatal "oe_runconf failed"
		fi
		set -e
	else
		bbfatal "no configure script found at $cfgscript"
	fi
}

gmakevelib_do_configure() {
	if [ -e ${S}/configure ]; then
		oe_runconf
	else
		bbnote "nothing to configure"
	fi
}

gmakevelib_do_install() {
	oe_runmake 'DESTDIR=${D}' install
}

inherit siteconfig

EXPORT_FUNCTIONS do_configure do_install