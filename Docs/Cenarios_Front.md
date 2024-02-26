# User Filtering Scenarios

## Scenario: Filtering users by name

### Given
- The user is on the user query screen

### When
- The user enters a valid name in the name filter field
- Clicks on the filter button

### Then
- The system should display only the users whose names match the entered criteria

## Scenario: Filtering users by email

### Given
- The user is on the user query screen

### When
- The user enters a valid email in the email filter field
- Clicks on the filter button

### Then
- The system should display only the users whose emails match the entered criteria

## Scenario: Filtering users by role

### Given
- The user is on the user query screen

### When
- The user selects a valid role from the role filter dropdown
- Clicks on the filter button

### Then
- The system should display only the users who belong to the selected role

## Scenario: No matching users found

### Given
- The user is on the user query screen

### When
- The user enters criteria in the filter fields that do not match any existing users
- Clicks on the filter button

### Then
- The system should display a message indicating no users were found matching the criteria

## Scenario: Clearing filters

### Given
- The user is on the user query screen with applied filters

### When
- The user clicks on the clear filters button

### Then
- All filter fields should be reset to their default state
- The system should display all users without any filtering
