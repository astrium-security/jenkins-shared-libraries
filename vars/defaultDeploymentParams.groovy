#!/usr/bin/env groovy

def call(String name = 'human') {
  properties([
    parameters([
        choice(name: 'INFRA_ENV', choices: ['NOPROD', 'PROD'], description: 'Which infra env to choose'),
        choice(name: 'TERRAFORM_ACTION', choices: ['PLAN', 'APPLY', 'DESTROY'], description: 'Which terraform action to perform'),
        choice(name: 'CSPROVIDER', choices: ['AWS', 'GCP'], description: 'Which provider to choose'),
        choice(name: 'REGION', choices: ['eu-west-1'], description: 'Region'),
        string(name: 'PREFIX_PROJECT', defaultValue: '', description: 'The prefix of the project'),
        string(name: 'TF_OPTIONS', defaultValue: '', description: 'Possible options')
    ])
  ])
}