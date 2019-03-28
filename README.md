Project name: SNAP importer plugin
Type: Plugin
Repository: git clone git@bitbucket.org:iceyedev/snap_importer.git
Main contact: ahmad.hamouda@iceye.fi

* Introduction

This plugin is used inside snap desktop application to map our image format to snap format.
This blugin build as per snap development extension module documentation "https://senbox.atlassian.net/wiki/spaces/SNAP/pages/10879037/How+to+develop+an+extension+module".

* Compilation & dependencies

In order to compile and execute the current code for development
purposes [debug], execute:

    - Change TESTING_IMAGE_PATH variable at e.g.esa.snap.dataio.iceye.TestIceyeReader
    - Set application enviroments as per "https://senbox.atlassian.net/wiki/spaces/SNAP/pages/10879037/How+to+develop+an+extension+module"
    - Run test case in debug mode

* Unit Testing

To run unit tests, execute:

- change TESTING_IMAGE_PATH variable at e.g.esa.snap.dataio.iceye.TestIceyeReader

    mvn clean install

To build without testing

    mvn clean install -DskipTests=true;
