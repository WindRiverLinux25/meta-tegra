SRC_REPO = "github.com/OE4T/nvidia-kernel-oot;protocol=https"
SRC_URI = "gitsm://${SRC_REPO};branch=${SRCBRANCH}"
SRCBRANCH = "main"
SRCREV = "92c7803bcf2e6ce7f12a69ca5570c36095518d94"
PV = "36.4.3+git"

SRC_URI += "file://0001-t23x-overlay-add-dts-to-support-Arducam-6-channels-o.patch \
            file://0001-drivers-video-nvcsi-t194-fix-the-failure-of-creating.patch \
            file://0001-t23x-overlay-create-a-overlay-dts-to-support-for-boo.patch \
            file://0001-net-nvethernet-generate-a-random-mac-address.patch \
"

S = "${WORKDIR}/git"

require nvidia-kernel-oot.inc
