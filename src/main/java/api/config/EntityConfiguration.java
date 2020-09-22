package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    CATEGORIES {
        @Override
        public Class<?> getEntityService() {
            return CategoriesService.class;
        }

    },
    ANALYSIS {
        @Override
        public Class<?> getEntityService() {
            return AnalysisService.class;
        }
    },

    ERRORES {
        @Override
        public Class<?> getEntityService() { return ErroresService.class; }

    };

    public abstract Class<?> getEntityService();
}
