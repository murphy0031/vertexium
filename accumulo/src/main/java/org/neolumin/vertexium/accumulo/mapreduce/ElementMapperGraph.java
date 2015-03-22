package org.neolumin.vertexium.accumulo.mapreduce;

import org.neolumin.vertexium.*;
import org.neolumin.vertexium.accumulo.AccumuloAuthorizations;
import org.neolumin.vertexium.id.IdGenerator;
import org.neolumin.vertexium.query.GraphQuery;
import org.neolumin.vertexium.query.MultiVertexQuery;

import java.util.EnumSet;

public class ElementMapperGraph extends GraphBase {
    private ElementMapper elementMapper;

    public ElementMapperGraph(ElementMapper elementMapper) {
        this.elementMapper = elementMapper;
    }

    @Override
    public VertexBuilder prepareVertex(String vertexId, Visibility visibility) {
        return this.elementMapper.prepareVertex(vertexId, visibility);
    }

    @Override
    public Iterable<Vertex> getVertices(EnumSet<FetchHint> fetchHints, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void removeVertex(Vertex vertex, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public EdgeBuilder prepareEdge(String edgeId, Vertex outVertex, Vertex inVertex, String label, Visibility visibility) {
        return this.elementMapper.prepareEdge(edgeId, outVertex, inVertex, label, visibility);
    }

    @Override
    public EdgeBuilderByVertexId prepareEdge(String edgeId, String outVertexId, String inVertexId, String label, Visibility visibility) {
        return this.elementMapper.prepareEdge(edgeId, outVertexId, inVertexId, label, visibility);
    }

    @Override
    public Iterable<Edge> getEdges(EnumSet<FetchHint> fetchHints, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void removeEdge(Edge edge, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public Iterable<GraphMetadataEntry> getMetadata() {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void setMetadata(String key, Object value) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public GraphQuery query(Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public GraphQuery query(String queryString, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public MultiVertexQuery query(String[] vertexIds, String queryString, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public MultiVertexQuery query(String[] vertexIds, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void reindex(Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void flush() {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void shutdown() {
        throw new VertexiumException("Not supported");
    }

    @Override
    public IdGenerator getIdGenerator() {
        return this.elementMapper.getIdGenerator();
    }

    @Override
    public boolean isVisibilityValid(Visibility visibility, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public DefinePropertyBuilder defineProperty(String propertyName) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public boolean isFieldBoostSupported() {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void clearData() {
        throw new VertexiumException("Not supported");
    }

    @Override
    public SearchIndexSecurityGranularity getSearchIndexSecurityGranularity() {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void markVertexHidden(Vertex vertex, Visibility visibility, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void markVertexVisible(Vertex vertex, Visibility visibility, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void markEdgeHidden(Edge edge, Visibility visibility, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public void markEdgeVisible(Edge edge, Visibility visibility, Authorizations authorizations) {
        throw new VertexiumException("Not supported");
    }

    @Override
    public Authorizations createAuthorizations(String... auths) {
        return new AccumuloAuthorizations(auths);
    }
}
