#Set A Q.2.
import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

# Create the dataset
np.random.seed(0)
data = {
    'ID': np.arange(1, 501),
    'flat': np.random.randint(1, 6, 500),
    'houses': np.random.randint(1, 6, 500),
    'purchases': np.random.randint(100000, 1000000, 500)
}

df = pd.DataFrame(data)

# Split the dataset into independent variables (X) and target variable (y)
X = df[['flat', 'houses']]
y = df['purchases']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Print the training and testing sets
print("Training set:")
print(X_train.head())
print(y_train.head())

print("\nTesting set:")
print(X_test.head())
print(y_test.head())

# Build a simple linear regression model
model = LinearRegression()
model.fit(X_train, y_train)

# Print the coefficients
print("\nCoefficients:", model.coef_)

# Print the intercept
print("Intercept:", model.intercept_)
