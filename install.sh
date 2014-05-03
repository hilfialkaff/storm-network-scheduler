# Copy library into the storm directory

STORM_DIR="../storm/lib/"

mvn package
cp ./target/storm_network_scheduler-1.0.0-SNAPSHOT.jar $STORM_DIR/lib/
