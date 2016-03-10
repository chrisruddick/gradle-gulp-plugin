package com.moowork.gradle.gulp

class GulpInstall_integTest
    extends AbstractIntegTest
{
    def 'gulp install'()
    {
        given:
        writeBuild( '''
            apply plugin: 'com.moowork.gulp'

            node {
                download = true
            }
        ''' )

        when:
        def result = runTasksSuccessfully( 'installGulp' )

        then:
        result.wasExecuted( 'installGulp' )
    }
}
