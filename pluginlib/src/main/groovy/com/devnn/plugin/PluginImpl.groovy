package com.devnn.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImpl implements Plugin<Project>{

    void apply(Project project){
        System.out.println("========================")
        System.out.println("apply MyPlugin succeed!")
        System.out.println("========================")

        project.repositories{
            maven{
                //添加maven库地址
                url 'http://localhost:8081/nexus3/repository/maven-public/'
            }
        }

        //定义project的依赖部分
        project.dependencies {
            implementation 'androidx.appcompat:appcompat:1.0.2'
            implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
            implementation 'com.devnn.lib:lib1:1.1.5'
        }

    }
}