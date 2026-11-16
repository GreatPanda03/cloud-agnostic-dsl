## CO4217 - Agile Cloud Automation - Coursework 2 - Group 204


## Introduction
This `README.md` file outlines the contents of the project along with a basic set of installation instructions for Google Cloud.


## Files of Interest

**Grammar:** `co7217.week18.entity.EntityDsl.xtext` - the grammar which defines the rules of the DSL.

**Generator File:** `co7217.week18.entity.generator.EntityGenerator.groovy` - the generator which creates the corresponding YAML document of the given DSL program.

**Scope Provider:** `co7217.week18.entity.scoping.EntityDslScopeProvider.java` - allow resources within a DSL to reference other existing resources within different scopes

**Resources:** Stored under `src/main/resources`.
* `large_program.dmodel` - a large valid DSL program
* `small_program.dmodel` - a simple valid DSL program
* `error_program.dmodel` - a simple invalid DSL program
* `output.yaml` - the YAML output produced by the generator

**Testing:** `co7217.week18.entity.tests.EntityDslParsingTest.groovy` - a collection of JUnit Tests to confirm the DSL parser and generator are valid for a variety of DSL programs.

**DSL Object Classes:** `co7217.week18.entity.entityDsl` - the collection of classes produced as artefacts of the DSL grammar.


## Writing a Program

A new program can be written using the Web Editor IDE or by creating a new `.dmodel` file in the `src/main/resources` folder with the program content.

If a file in the resources folder is being used, the name supplied to the `EntityGenerator.groovy` file must also be updated to ensure the correct program is parsed.

The produced deployment YAML file will be saved in as a file called `output.yaml`. This can then be passed on to AWS or GCP.


## Google Cloud Deployment Steps

The following steps describe how to deploy the GCP YAML with Deployment Manager, including how to prepare a project.

**Creating a Google Cloud Project**
1. Install the Google Cloud CLI, which includes the gcloud command. While the following steps could be completed with the Google Cloud console GUI, it is much simpler to do with the CLI.

    * **Installation Steps:** Google Cloud, "Install the Google Cloud CLI", Google Cloud, docs.cloud.google.com, [Online]. Available at: https://docs.cloud.google.com/sdk/docs/install-sdk. Accessed: Jan. 6, 2026.

2. Run `gcloud init` to initialise the Google Cloud CLI. A wizard may be displayed to set up the project environment, or a set of instructions will appear. Complete either of these.

3. Create a Google account and sign in using `gcloud login`.

4. Start a free Google Cloud trial through the Google Cloud GUI. A billing account must be assigned to use the required APIs. Free credit is provided and no charge is incurred when the trial ends.

5. Run `gcloud config get-value project` to see the current project. This is usually the default project that comes with the account. If it is, continue to the next section.

6. If no project is assigned, run `gcloud projects list` to list all projects. Note the `PROJECT_ID` of a project to use (any will do).

7. If no project exists, use `gcloud projects create <PROJECT_ID> ` to create a new project, where `PROJECT_ID` is the name it will have.

8. Run `gcloud config set project <PROJECT_ID>`, where `PROJECT_ID` is the name of the new project.

**Enabling the Required APIs**
Google Cloud includes a suite of services which are not initially activated for new accounts. These services must be activated manually once a billing account has been assigned to the Google Cloud account.

1. Enable compute using `gcloud services enable compute.googleapis.com`. This enables:
    * `compute.v1.network` (`Network` in the DSL)
    * `compute.v1.subnetwork` (`Subnet` in the DSL)
    * `compute.v1.instance` (`ComputeInstance` in the DSL)

2. Enable managed zones and record sets using `gcloud services enable dns.googleapis.com`. This enables:
    * `dns.v1.managedZone` (`HostedZone` in the DSL)
    * `dns.v1.resourceRecordSet` (`VPC` in the DSL)

3. Enable storage buckets using `gcloud services enable storage.googleapis.com`. This enables:
    * `storage.v1.bucket` (`StorageBucket` in the DSL)

4. Enable GCP Deployment Manager using `gcloud services enable deploymentmanager.googleapis.com`. This service is used to deploy the YAML file.

5. Verify all required services are enabled using `gcloud services list --enabled`.

**Infrastructure Deployment & Cleanup**
1. To run the deployment, run `gcloud deployment-manager deployments create <DEPLOYMENT_ID> --config <PATH_TO_YAML>`, where `DEPLOYMENT_ID` is the name to give the deployment (e.g., `cloudiac`) `PATH_TO_YAML` is the directory to the deployment YAML file. This may take a few minutes to complete.

2. To view all resources, run `gcloud deployment-manager deployments describe <DEPLOYMENT_ID>`. This may already be displayed by Step 15.

3. Verify all resources correspond to the names and types provided in the DSL program. The Google Cloud console GUI can also be visited to view the created resources.

4. To clean up the deployment, run `gcloud deployment-manager deployments delete <DEPLOYMENT_NAME>`.
