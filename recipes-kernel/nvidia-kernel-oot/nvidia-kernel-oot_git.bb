SRC_REPO = "github.com/OE4T/nvidia-kernel-oot;protocol=https"
SRC_URI = "gitsm://${SRC_REPO};branch=${SRCBRANCH}"
SRCBRANCH = "patches-rel-36"
SRCREV = "a94b44e97f04bd1c5171837dfe6fe3b53402e71c"
PV = "36.4.3+git"

SRC_URI += "file://0001-t23x-overlay-add-dts-to-support-Arducam-6-channels-o.patch \
            file://0001-drivers-video-nvcsi-t194-fix-the-failure-of-creating.patch \
            file://0001-t23x-overlay-create-a-overlay-dts-to-support-for-boo.patch \
            file://0001-net-nvethernet-generate-a-random-mac-address.patch \
            file://0001-Fix-rcu-stall-when-CONFIG_SHADOW_CALL_ST.patch \
            file://0001-host1x-fence-call-dma_fence_put-to-avoid-memory-leak.patch \
            file://0001-drm-tegra-release-the-count-of-pid-to-avoid-memory-l.patch \
            file://0001-nvdisplay-improve-coed-to-allow-nested-lock.patch \
            file://0001-t23x-overlay-create-dts-for-booting-NVIDIA-Orin-Nano.patch \
            file://0001-usb-typec-remove-IRQF_ONESHOT-flag.patch \
            file://0001-host1x-fence-call-fput-to-avoid-memory-leak.patch \
            file://0001-drivers-capture-common-only-create-memory-cache-at-t.patch \
            file://0001-usb-typec-release-resource-when-removing-usb-driver-.patch \
            file://0001-nvdisplay-nv-platform-call-platform_device_put-to-de.patch \
            file://0001-nvidia-modeset-dp-decrease-reference-if-destroy-func.patch \
            file://0001-nvdisplay-nv-platform-set-the-dma-segment-size-for-n.patch \
"

S = "${WORKDIR}/git"

require nvidia-kernel-oot.inc
