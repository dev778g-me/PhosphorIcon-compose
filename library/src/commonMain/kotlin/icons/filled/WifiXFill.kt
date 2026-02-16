package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WifiXFill: ImageVector
    get() {
        if (_WifiXFill != null) {
            return _WifiXFill!!
        }
        _WifiXFill = ImageVector.Builder(
            name = "Filled.WifiXFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(229.66f, 98.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(200f, 91.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(188.69f, 80f)
                lineTo(170.34f, 61.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(200f, 68.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(211.31f, 80f)
                close()
                moveTo(206.85f, 131f)
                arcToRelative(32.75f, 32.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.15f, -3.14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.37f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -45.18f, -45.18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.34f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 149f, 38.91f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.11f, -6.08f)
                quadTo(137f, 32f, 128f, 32f)
                arcTo(186.67f, 186.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.28f, 70.1f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.11f, 80.91f)
                arcTo(15.65f, 15.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.65f, 92.8f)
                lineToRelative(104f, 125.43f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 224f)
                horizontalLineToRelative(0f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.31f, -5.77f)
                lineToRelative(67.45f, -81.31f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 206.85f, 131f)
                close()
            }
        }.build()

        return _WifiXFill!!
    }

@Suppress("ObjectPropertyName")
private var _WifiXFill: ImageVector? = null
