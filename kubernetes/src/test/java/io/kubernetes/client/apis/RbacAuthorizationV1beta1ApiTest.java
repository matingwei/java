/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1Status;
import io.kubernetes.client.models.V1beta1ClusterRole;
import io.kubernetes.client.models.V1beta1ClusterRoleBinding;
import io.kubernetes.client.models.V1beta1ClusterRoleBindingList;
import io.kubernetes.client.models.V1beta1ClusterRoleList;
import io.kubernetes.client.models.V1beta1Role;
import io.kubernetes.client.models.V1beta1RoleBinding;
import io.kubernetes.client.models.V1beta1RoleBindingList;
import io.kubernetes.client.models.V1beta1RoleList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RbacAuthorizationV1beta1Api
 */
@Ignore
public class RbacAuthorizationV1beta1ApiTest {

    private final RbacAuthorizationV1beta1Api api = new RbacAuthorizationV1beta1Api();

    
    /**
     * 
     *
     * create a ClusterRole
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClusterRoleTest() throws ApiException {
        V1beta1ClusterRole body = null;
        String pretty = null;
        V1beta1ClusterRole response = api.createClusterRole(body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a ClusterRoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClusterRoleBindingTest() throws ApiException {
        V1beta1ClusterRoleBinding body = null;
        String pretty = null;
        V1beta1ClusterRoleBinding response = api.createClusterRoleBinding(body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedRoleTest() throws ApiException {
        String namespace = null;
        V1beta1Role body = null;
        String pretty = null;
        V1beta1Role response = api.createNamespacedRole(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a RoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedRoleBindingTest() throws ApiException {
        String namespace = null;
        V1beta1RoleBinding body = null;
        String pretty = null;
        V1beta1RoleBinding response = api.createNamespacedRoleBinding(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a ClusterRole
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClusterRoleTest() throws ApiException {
        String name = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteClusterRole(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a ClusterRoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClusterRoleBindingTest() throws ApiException {
        String name = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteClusterRoleBinding(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of ClusterRole
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionClusterRoleTest() throws ApiException {
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionClusterRole(pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of ClusterRoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionClusterRoleBindingTest() throws ApiException {
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionClusterRoleBinding(pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedRoleTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedRole(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of RoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedRoleBindingTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedRoleBinding(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedRoleTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedRole(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a RoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedRoleBindingTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedRoleBinding(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ClusterRole
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClusterRoleTest() throws ApiException {
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1ClusterRoleList response = api.listClusterRole(pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ClusterRoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClusterRoleBindingTest() throws ApiException {
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1ClusterRoleBindingList response = api.listClusterRoleBinding(pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedRoleTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1RoleList response = api.listNamespacedRole(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind RoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedRoleBindingTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1RoleBindingList response = api.listNamespacedRoleBinding(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind RoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRoleBindingForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1RoleBindingList response = api.listRoleBindingForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRoleForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1RoleList response = api.listRoleForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified ClusterRole
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchClusterRoleTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        V1beta1ClusterRole response = api.patchClusterRole(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified ClusterRoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchClusterRoleBindingTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        V1beta1ClusterRoleBinding response = api.patchClusterRoleBinding(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedRoleTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V1beta1Role response = api.patchNamespacedRole(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified RoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedRoleBindingTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V1beta1RoleBinding response = api.patchNamespacedRoleBinding(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified ClusterRole
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readClusterRoleTest() throws ApiException {
        String name = null;
        String pretty = null;
        V1beta1ClusterRole response = api.readClusterRole(name, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified ClusterRoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readClusterRoleBindingTest() throws ApiException {
        String name = null;
        String pretty = null;
        V1beta1ClusterRoleBinding response = api.readClusterRoleBinding(name, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedRoleTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1beta1Role response = api.readNamespacedRole(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified RoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedRoleBindingTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1beta1RoleBinding response = api.readNamespacedRoleBinding(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified ClusterRole
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceClusterRoleTest() throws ApiException {
        String name = null;
        V1beta1ClusterRole body = null;
        String pretty = null;
        V1beta1ClusterRole response = api.replaceClusterRole(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified ClusterRoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceClusterRoleBindingTest() throws ApiException {
        String name = null;
        V1beta1ClusterRoleBinding body = null;
        String pretty = null;
        V1beta1ClusterRoleBinding response = api.replaceClusterRoleBinding(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedRoleTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1Role body = null;
        String pretty = null;
        V1beta1Role response = api.replaceNamespacedRole(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified RoleBinding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedRoleBindingTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1RoleBinding body = null;
        String pretty = null;
        V1beta1RoleBinding response = api.replaceNamespacedRoleBinding(name, namespace, body, pretty);

        // TODO: test validations
    }
    
}
