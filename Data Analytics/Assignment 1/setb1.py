#Set B Q.1.
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

# Load the dataset
fish_data = pd.read_csv(r'C:\Users\amres\Downloads\Fish.csv') # Ensure "Fish.csv" is in the correct directory

# Explore the dataset
print(fish_data.head())

# Split the dataset into features (X) and target variable (y)
X = fish_data[['Length1', 'Length2', 'Length3', 'Height', 'Width']]
y = fish_data['Weight']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Train the linear regression model
model = LinearRegression()
model.fit(X_train, y_train)

# Evaluate the model
train_rmse = mean_squared_error(y_train, model.predict(X_train), squared=False)
test_rmse = mean_squared_error(y_test, model.predict(X_test), squared=False)

print(f"Training RMSE: {train_rmse:.2f}")
print(f"Testing RMSE: {test_rmse:.2f}")

# Make predictions
# Example: Predict the weight of a fish with given features
new_fish_features = [[25.4, 26.3, 29.1, 7.2, 4.0]]  # Example features
predicted_weight = model.predict(new_fish_features)

print(f"Predicted weight of the fish: {predicted_weight[0]:.2f}")
