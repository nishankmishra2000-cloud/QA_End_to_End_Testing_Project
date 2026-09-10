# Test Plan

**Test Plan ID:** TP-SD-001  
**Application:** SauceDemo  
**Scope:** Login, product listing/sorting, cart, checkout, logout and negative validation.

## Out of Scope
Payment gateway integration, production infrastructure, third-party identity providers and performance/load testing.

## Test Strategy
- Functional testing
- Smoke testing
- Regression testing
- Negative testing
- Boundary-oriented input validation
- Cross-browser sanity checks where environment permits

## Test Environment
Windows 10/11, Chrome/Edge, Java 17+, Maven 3.9+, Selenium 4.x, TestNG 7.x, Postman, Rest Assured and Jenkins.

## Entry Criteria
Application is accessible; test environment is available; test data is prepared.

## Exit Criteria
Planned cases executed; critical defects reported; automation/API suites execute successfully or known blockers are documented.

## Risks & Mitigation
- Demo environment changes → keep locators centralized in POM.
- Network instability → explicit waits and retry only where justified.
- Test-data changes → externalize configuration.
- Flaky UI behavior → stable locators and synchronization.

## Tools
Excel/CSV, Selenium, TestNG, Maven, Postman, Rest Assured, Git, GitHub, Jenkins and AI assistance.
