import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LandingScreen(
    onAddRecipeClicked: () -> Unit,
    onScanBarcodeClicked: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // App Title
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Recipe Analyzer",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Calculate nutrition facts from your recipes",
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            // Buttons
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Button(
                    onClick = onAddRecipeClicked,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary
                    )
                ) {
                    Text(
                        text = "Add Recipe",
                        fontSize = 18.sp,
                        color = Color.White
                    )
                }

                Button(
                    onClick = onScanBarcodeClicked,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.secondary
                    )
                ) {
                    Text(
                        text = "Scan Barcode",
                        fontSize = 18.sp,
                        color = Color.White
                    )
                }
            }

            // Footer
            Text(
                text = "Powered by Open Food Facts",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}
