#Set A Q.3.
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler, LabelEncoder
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score, classification_report

# Sample data for User dataset
data = {
    'User ID': [1, 2, 3, 4, 5],
    'Gender': ['Male', 'Female', 'Male', 'Female', 'Male'],
    'Age': [25, 30, 35, 40, 45],
    'EstimatedSalary': [50000, 60000, 70000, 80000, 90000],
    'Purchased': [0, 1, 0, 1, 0]  # Assuming 0 means not purchased, and 1 means purchased
}

# Create DataFrame
user_df = pd.DataFrame(data)

# Display the DataFrame
print(user_df)  

# Encode categorical variable 'Gender'
le = LabelEncoder()
user_df['Gender'] = le.fit_transform(user_df['Gender'])

# Split data into features (X) and target (y)
X = user_df.drop(columns=['Purchased', 'User ID'])  # Removed 'User ID' as it is not a relevant feature
y = user_df['Purchased']

# Split data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Scale numerical features
scaler = StandardScaler()
X_train_scaled = scaler.fit_transform(X_train)
X_test_scaled = scaler.transform(X_test)

# Build logistic regression model
model = LogisticRegression()
model.fit(X_train_scaled, y_train)

# Predict on the testing data
y_pred = model.predict(X_test_scaled)

# Evaluate model
accuracy = accuracy_score(y_test, y_pred)
print("Accuracy:", accuracy)
print(classification_report(y_test, y_pred))
