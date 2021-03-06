package edu.ecnu.sqslab.resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mr.Liu
 * @since 2017/10/15
 */
@Repository
public interface IssueRepository extends PagingAndSortingRepository<Issue, Long> {
    Page<Issue> findByTypeGreaterThan(Long type ,Pageable request);

    Page<Issue> findAllByTypeNotContainsAndSummaryIsNull(int type, Pageable request);
}
