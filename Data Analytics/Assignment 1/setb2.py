#Set B Q.2.
import pandas as pd
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score

# Load iris dataset
iris = load_iris()
iris_df = pd.DataFrame(data=iris.data, columns=iris.feature_names)
iris_df['species'] = iris.target

# Basic statistical details for each species
species_names = {0: 'setosa', 1: 'versicolor', 2: 'virginica'}
for species in range(3):
    species_data = iris_df[iris_df['species'] == species]
    print(f"Species: {species_names[species]}")
    print(species_data.describe())

# Prepare data for logistic regression
X = iris.data
y = iris.target

# Split data into train and test sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Initialize logistic regression model
model = LogisticRegression(max_iter=1000)

# Fit the model
model.fit(X_train, y_train)

# Predictions
y_pred = model.predict(X_test)

# Calculate accuracy
accuracy = accuracy_score(y_test, y_pred)
print(f"Accuracy of the model: {accuracy:.2f}")











# import pandas as pd
# from sklearn.model_selection import train_test_split
# from sklearn.linear_model import LogisticRegression
# from sklearn.metrics import accuracy_score

# # Load iris dataset from CSV
# iris_df = pd.read_csv(r"C:\Users\amres\Downloads\iris_synthetic_data.csv")

# # Basic statistical details for each species
# species_names = {0: 'setosa', 1: 'versicolor', 2: 'virginica'}
# for species in range(3):
#     species_data = iris_df[iris_df['species'] == species]
#     print(f"\nSpecies: {species_names[species]}")
#     print(species_data.describe())

# # Prepare data for logistic regression
# X = iris_df.drop(columns=['species'])  # Feature variables
# y = iris_df['species']  # Target variable

# # Split data into train and test sets
# X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# # Initialize logistic regression model
# model = LogisticRegression(max_iter=1000)

# # Fit the model

# model.fit(X_train, y_train)

# # Predictions
# y_pred = model.predict(X_test)

# # Calculate accuracy
# accuracy = accuracy_score(y_test, y_pred)
# print(f"\nAccuracy of the model: {accuracy:.2f}")

