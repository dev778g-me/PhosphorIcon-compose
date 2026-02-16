package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BluetoothXFill: ImageVector
    get() {
        if (_BluetoothXFill != null) {
            return _BluetoothXFill!!
        }
        _BluetoothXFill = ImageVector.Builder(
            name = "Filled.BluetoothXFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.2f, 6.4f)
                lineToRelative(-64f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 232f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.11f, -1.14f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.9f, -7.18f)
                lineTo(103.99f, 144f)
                lineTo(52.76f, 182.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.16f, -1.55f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.8f, -11.43f)
                lineTo(98.66f, 128f)
                lineTo(43.38f, 86.57f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.13f, -10.93f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.51f, -2f)
                lineTo(104f, 112f)
                lineTo(104f, 32.24f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, -6.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, -0.3f)
                lineToRelative(33.62f, 25.2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 54f)
                verticalLineToRelative(52f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 3.2f)
                lineTo(125.34f, 128f)
                lineToRelative(55.5f, 41.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 176f)
                close()
                moveTo(237.47f, 98.13f)
                lineTo(219.37f, 80f)
                lineToRelative(18.11f, -18.11f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, -11.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.49f, -0.18f)
                lineTo(208.05f, 68.69f)
                lineTo(189.93f, 50.58f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.83f, -0.88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.73f, 12f)
                lineTo(196.73f, 80f)
                lineTo(178.58f, 98.13f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 11.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.71f, 0.43f)
                lineToRelative(18.36f, -18.35f)
                lineToRelative(18.35f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.72f, -0.43f)
                arcTo(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.51f, 98.13f)
                close()
            }
        }.build()

        return _BluetoothXFill!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothXFill: ImageVector? = null
