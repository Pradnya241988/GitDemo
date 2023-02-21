Feature: Search and Place the order for Products

Scenario: Search experience for product search on home and offers page

Given User is on GreenKart landing page
When user searched with short name "Tom" and extracted actual name of product
Then user searched for same short name on offers page to check if product exist

