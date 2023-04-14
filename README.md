# kmehr-emf

![Java CI with Maven](https://github.com/dwagelaar/kmehr-emf/actions/workflows/maven.yml/badge.svg)

KMEHR XML implementation for EMF

## Installation

For Maven projects, add the following to your POM:

```
<repositories>
	<repository>
		<id>kmehr-emf</id>
		<name>kmehr-emf GitHub Packages</name>
		<url>https://raw.github.com/dwagelaar/kmehr-emf/repository/</url>
	</repository>
</repositories>

<dependencies>
	<dependency>
		<groupId>be.fgov.ehealth.emf.kmehr</groupId>
		<artifactId>be.fgov.ehealth.emf.kmehr</artifactId>
		<version>1.38.0</version>
	</dependency>
</dependencies>
```

For use with the Eclipse IDE:
  * Download the zipped update site file from the [latest release](https://github.com/dwagelaar/kmehr-emf/releases/latest).
  * In Eclipse, select Help -> Install New Software...
  * In the Install dialog, click Add... to open the Add Repository dialog.
  * In the Add Repository dialog, click Archive..., select the downloaded zip file, then click Add.
  * Back in the Install dialog, select "KMEHR XML implementation for EMF", and go through the wizard.


