#Set A Q.1.
import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

# Create sales dataset
data = {
    'ID': range(1, 501),
    'TV': np.random.randint(0, 100, 500),
    'Radio': np.random.randint(0, 100, 500),
    'Newspaper': np.random.randint(0, 100, 500),
    'Sales': np.random.randint(50, 500, 500)
}

sales_df = pd.DataFrame(data)

# Identify independent and target variables
X = sales_df[['TV', 'Radio', 'Newspaper']]
y = sales_df['Sales']

# Split the variables into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)

# Print the shapes of training and testing sets
print("Training set shape:", X_train.shape, y_train.shape)
print("Testing set shape:", X_test.shape, y_test.shape)

# Build simple linear regression model
model = LinearRegression()
model.fit(X_train, y_train)

# Print coefficients
print("Coefficients:", model.coef_)
