// SOURCE:
// https://stackoverflow.com/questions/9815273/how-to-get-a-list-of-installed-jenkins-plugins-with-name-and-version-pair

// Jenkins Script Console: http://<jenkins-url>/script

Jenkins.instance.pluginManager.plugins.each{
  plugin ->
    println ("${plugin.getDisplayName()} (${plugin.getShortName()}): ${plugin.getVersion()}")
}

/* RESULTS:

Display URL for Blue Ocean (blueocean-display-url): 2.3.0
Plain Credentials Plugin (plain-credentials): 1.5
REST API for Blue Ocean (blueocean-rest): 1.19.0
Git Pipeline for Blue Ocean (blueocean-git-pipeline): 1.19.0
Trilead API Plugin (trilead-api): 1.0.3
Pipeline (workflow-aggregator): 2.6
GitHub plugin (github): 1.29.4
Display URL API (display-url-api): 2.3.2
JWT for Blue Ocean (blueocean-jwt): 1.19.0
Maven Integration plugin (maven-plugin): 3.4
Config API for Blue Ocean (blueocean-config): 1.19.0
Green Balls (greenballs): 1.15
Design Language (jenkins-design-language): 1.19.0
Warnings Plug-in (warnings): 5.0.1
Branch API Plugin (branch-api): 2.5.4
Handy Uri Templates 2.x API Plugin (handy-uri-templates-2-api): 2.1.7-1.0
Jackson 2 API Plugin (jackson2-api): 2.9.9.1
Workspace Cleanup Plugin (ws-cleanup): 0.37
GitLab Plugin (gitlab-plugin): 1.5.12
Copy Artifact Plugin (copyartifact): 1.42.1
Pipeline: Declarative (pipeline-model-definition): 1.3.9
Blue Ocean Executor Info (blueocean-executor-info): 1.19.0
Durable Task Plugin (durable-task): 1.30
Email Extension Plugin (email-ext): 2.66
i18n for Blue Ocean (blueocean-i18n): 1.19.0
Pipeline: Input Step (pipeline-input-step): 2.11
SQLPlus Script Runner (sqlplus-script-runner): 2.0.8
Script Security Plugin (script-security): 1.62
Matrix Project Plugin (matrix-project): 1.14
Build Timeout (build-timeout): 1.19
Pub-Sub "light" Bus (pubsub-light): 1.13
Fingerprint Plugin (create-fingerprint): 1.2
Personalization for Blue Ocean (blueocean-personalization): 1.19.0
Server Sent Events (SSE) Gateway Plugin (sse-gateway): 1.20
Authentication Tokens API Plugin (authentication-tokens): 1.3
Pipeline Graph Analysis Plugin (pipeline-graph-analysis): 1.10
Mailer Plugin (mailer): 1.26
jQuery UI plugin (jquery-ui): 1.0.2
Timestamper (timestamper): 1.10
SSH Agent Plugin (ssh-agent): 1.17
Multi slave config plugin (multi-slave-config-plugin): 1.2.0
Pipeline: Supporting APIs (workflow-support): 3.3
Build Pipeline Plugin (build-pipeline-plugin): 1.5.8
Pipeline: Multibranch (workflow-multibranch): 2.21
Conditional BuildStep (conditional-buildstep): 1.3.6
Pipeline: Basic Steps (workflow-basic-steps): 2.18
Git Changelog (git-changelog): 2.17
Config File Provider Plugin (config-file-provider): 3.6.2
Pipeline SCM API for Blue Ocean (blueocean-pipeline-scm-api): 1.19.0
Subversion Plug-in (subversion): 2.12.2
JIRA Integration for Blue Ocean (blueocean-jira): 1.19.0
JavaScript GUI Lib: Handlebars bundle plugin (handlebars): 1.1.1
SCM API Plugin (scm-api): 2.6.3
FindBugs Plug-in (findbugs): 5.0.0
jQuery plugin (jquery): 1.12.4-1
Blue Ocean Pipeline Editor (blueocean-pipeline-editor): 1.19.0
Pipeline: Shared Groovy Libraries (workflow-cps-global-lib): 2.15
JavaScript GUI Lib: jQuery bundles (jQuery and jQuery UI) plugin (jquery-detached): 1.2.1
Email Extension Template Plugin (emailext-template): 1.1
Docker Pipeline (docker-workflow): 1.19
Dashboard for Blue Ocean (blueocean-dashboard): 1.19.0
Pipeline: Declarative Agent API (pipeline-model-declarative-agent): 1.1.1
disk-usage plugin (disk-usage): 0.28
Pipeline: REST API Plugin (pipeline-rest-api): 2.12
Structs Plugin (structs): 1.20
Dashboard View (dashboard-view): 2.11
Parameterized Trigger plugin (parameterized-trigger): 2.35.2
Resource Disposer Plugin (resource-disposer): 0.13
Authorize Project (authorize-project): 1.3.0
JIRA plugin (jira): 3.0.9
Credentials Binding Plugin (credentials-binding): 1.20
Bitbucket Branch Source Plugin (cloudbees-bitbucket-branch-source): 2.4.6
Favorite (favorite): 2.3.2
Git plugin (git): 4.0.0-rc
Pipeline: Stage Tags Metadata (pipeline-stage-tags-metadata): 1.3.9
OWASP Markup Formatter Plugin (antisamy-markup-formatter): 1.6
Pipeline: GitHub Groovy Libraries (pipeline-github-lib): 1.0
JUnit Plugin (junit): 1.28
PAM Authentication plugin (pam-auth): 1.5.1
Folders Plugin (cloudbees-folder): 6.9
user build vars plugin (build-user-vars-plugin): 1.5
Pipeline: Stage View Plugin (pipeline-stage-view): 2.12
Pipeline: Nodes and Processes (workflow-durable-task-step): 2.33
Gradle Plugin (gradle): 1.33
GitHub Pipeline for Blue Ocean (blueocean-github-pipeline): 1.19.0
Common API for Blue Ocean (blueocean-commons): 1.19.0
Docker Commons Plugin (docker-commons): 1.15
Javadoc Plugin (javadoc): 1.5
JavaScript GUI Lib: Moment.js bundle plugin (momentjs): 1.1.1
JavaScript GUI Lib: ACE Editor bundle plugin (ace-editor): 1.1
Blue Ocean Core JS (blueocean-core-js): 1.19.0
Git Tag Message Plugin (git-tag-message): 1.6.1
Variant Plugin (variant): 1.3
Mercurial plugin (mercurial): 2.8
Pipeline: Declarative Extension Points API (pipeline-model-extensions): 1.3.9
Pipeline: SCM Step (workflow-scm-step): 2.9
Matrix Authorization Strategy Plugin (matrix-auth): 2.4.2
Pipeline: Step API (workflow-step-api): 2.20
Static Analysis Utilities (analysis-core): 1.96
HTML Publisher plugin (htmlpublisher): 1.18
Events API for Blue Ocean (blueocean-events): 1.19.0
MapDB API Plugin (mapdb-api): 1.0.9.0
Git client plugin (git-client): 3.0.0-rc
JSch dependency plugin (jsch): 0.1.55.1
Web for Blue Ocean (blueocean-web): 1.19.0
Pipeline: API (workflow-api): 2.37
GitHub API Plugin (github-api): 1.95
Apache HttpComponents Client 4.x API Plugin (apache-httpcomponents-client-4-api): 4.5.5-3.0
Checkstyle Plug-in (checkstyle): 4.0.0
drecycler (drecycler): 0.20
GitHub Branch Source Plugin (github-branch-source): 2.5.6
Blue Ocean (blueocean): 1.19.0
Command Agent Launcher Plugin (command-launcher): 1.3
Forensics API Plugin (forensics-api): 0.4.1
bouncycastle API Plugin (bouncycastle-api): 2.17
Pipeline: Build Step (pipeline-build-step): 2.9
SSH Credentials Plugin (ssh-credentials): 1.17.1
Pipeline: Job (workflow-job): 2.34
WMI Windows Agents Plugin (windows-slaves): 1.4
Autofavorite for Blue Ocean (blueocean-autofavorite): 1.2.4
Pipeline: Stage Step (pipeline-stage-step): 2.3
Mantis plugin (mantis): 0.26
LDAP Plugin (ldap): 1.20
Pipeline: Model API (pipeline-model-api): 1.3.9
Credentials Plugin (credentials): 2.3.0
Lockable Resources plugin (lockable-resources): 2.5
PMD Plug-in (pmd): 4.0.0
Token Macro Plugin (token-macro): 2.8
Role-based Authorization Strategy (role-strategy): 2.13
Pipeline implementation for Blue Ocean (blueocean-pipeline-api-impl): 1.19.0
Pipeline: Groovy (workflow-cps): 2.74
SSH Slaves plugin (ssh-slaves): 1.30.1
Run Condition Plugin (run-condition): 1.2
GIT server Plugin (git-server): 1.8
Ant Plugin (ant): 1.10
External Monitor Job Type Plugin (external-monitor-job): 1.7
Pipeline: Milestone Step (pipeline-milestone-step): 1.3.1
Oracle Java SE Development Kit Installer Plugin (jdk-tool): 1.3
Embeddable Build Status Plugin (embeddable-build-status): 2.0.2
REST Implementation for Blue Ocean (blueocean-rest-impl): 1.19.0
Static Analysis Collector Plug-in (analysis-collector): 2.0.0
Bitbucket Pipeline for Blue Ocean (blueocean-bitbucket-pipeline): 1.19.0
Analysis Model API Plug-in (analysis-model-api): 6.0.1
Warnings Next Generation Plugin (warnings-ng): 6.0.0
Git Parameter Plug-In (git-parameter): 0.9.11

---

Result: [Plugin:blueocean-display-url, Plugin:plain-credentials, Plugin:blueocean-rest, Plugin:blueocean-git-pipeline, Plugin:trilead-api, Plugin:workflow-aggregator, Plugin:github, Plugin:display-url-api, Plugin:blueocean-jwt, Plugin:maven-plugin, Plugin:blueocean-config, Plugin:greenballs, Plugin:jenkins-design-language, Plugin:warnings, Plugin:branch-api, Plugin:handy-uri-templates-2-api, Plugin:jackson2-api, Plugin:ws-cleanup, Plugin:gitlab-plugin, Plugin:copyartifact, Plugin:pipeline-model-definition, Plugin:blueocean-executor-info, Plugin:durable-task, Plugin:email-ext, Plugin:blueocean-i18n, Plugin:pipeline-input-step, Plugin:sqlplus-script-runner, Plugin:script-security, Plugin:matrix-project, Plugin:build-timeout, Plugin:pubsub-light, Plugin:create-fingerprint, Plugin:blueocean-personalization, Plugin:sse-gateway, Plugin:authentication-tokens, Plugin:pipeline-graph-analysis, Plugin:mailer, Plugin:jquery-ui, Plugin:timestamper, Plugin:ssh-agent, Plugin:multi-slave-config-plugin, Plugin:workflow-support, Plugin:build-pipeline-plugin, Plugin:workflow-multibranch, Plugin:conditional-buildstep, Plugin:workflow-basic-steps, Plugin:git-changelog, Plugin:config-file-provider, Plugin:blueocean-pipeline-scm-api, Plugin:subversion, Plugin:blueocean-jira, Plugin:handlebars, Plugin:scm-api, Plugin:findbugs, Plugin:jquery, Plugin:blueocean-pipeline-editor, Plugin:workflow-cps-global-lib, Plugin:jquery-detached, Plugin:emailext-template, Plugin:docker-workflow, Plugin:blueocean-dashboard, Plugin:pipeline-model-declarative-agent, Plugin:disk-usage, Plugin:pipeline-rest-api, Plugin:structs, Plugin:dashboard-view, Plugin:parameterized-trigger, Plugin:resource-disposer, Plugin:authorize-project, Plugin:jira, Plugin:credentials-binding, Plugin:cloudbees-bitbucket-branch-source, Plugin:favorite, Plugin:git, Plugin:pipeline-stage-tags-metadata, Plugin:antisamy-markup-formatter, Plugin:pipeline-github-lib, Plugin:junit, Plugin:pam-auth, Plugin:cloudbees-folder, Plugin:build-user-vars-plugin, Plugin:pipeline-stage-view, Plugin:workflow-durable-task-step, Plugin:gradle, Plugin:blueocean-github-pipeline, Plugin:blueocean-commons, Plugin:docker-commons, Plugin:javadoc, Plugin:momentjs, Plugin:ace-editor, Plugin:blueocean-core-js, Plugin:git-tag-message, Plugin:variant, Plugin:mercurial, Plugin:pipeline-model-extensions, Plugin:workflow-scm-step, Plugin:matrix-auth, Plugin:workflow-step-api, Plugin:analysis-core, Plugin:htmlpublisher, Plugin:blueocean-events, Plugin:mapdb-api, Plugin:git-client, Plugin:jsch, Plugin:blueocean-web, Plugin:workflow-api, Plugin:github-api, Plugin:apache-httpcomponents-client-4-api, Plugin:checkstyle, Plugin:drecycler, Plugin:github-branch-source, Plugin:blueocean, Plugin:command-launcher, Plugin:forensics-api, Plugin:bouncycastle-api, Plugin:pipeline-build-step, Plugin:ssh-credentials, Plugin:workflow-job, Plugin:windows-slaves, Plugin:blueocean-autofavorite, Plugin:pipeline-stage-step, Plugin:mantis, Plugin:ldap, Plugin:pipeline-model-api, Plugin:credentials, Plugin:lockable-resources, Plugin:pmd, Plugin:token-macro, Plugin:role-strategy, Plugin:blueocean-pipeline-api-impl, Plugin:workflow-cps, Plugin:ssh-slaves, Plugin:run-condition, Plugin:git-server, Plugin:ant, Plugin:external-monitor-job, Plugin:pipeline-milestone-step, Plugin:jdk-tool, Plugin:embeddable-build-status, Plugin:blueocean-rest-impl, Plugin:analysis-collector, Plugin:blueocean-bitbucket-pipeline, Plugin:analysis-model-api, Plugin:warnings-ng, Plugin:git-parameter]

*/
