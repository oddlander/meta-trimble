# Default Trimble BSP Machine settings

EXTRA_IMAGE_FEATURES = "debug-tweaks ssh-server-openssh tools-debug"
IMAGE_INSTALL_append = "openssh-sftp-server libstdc++ helloworld"
