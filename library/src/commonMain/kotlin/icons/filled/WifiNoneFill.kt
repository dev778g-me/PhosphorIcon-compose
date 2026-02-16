package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WifiNoneFill: ImageVector
    get() {
        if (_WifiNoneFill != null) {
            return _WifiNoneFill!!
        }
        _WifiNoneFill = ImageVector.Builder(
            name = "Filled.WifiNoneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(247.89f, 80.91f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.17f, -10.81f)
                arcTo(186.67f, 186.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 32f)
                arcTo(186.67f, 186.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.28f, 70.1f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.11f, 80.91f)
                arcTo(15.65f, 15.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.65f, 92.8f)
                lineToRelative(104f, 125.43f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 224f)
                horizontalLineToRelative(0f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.31f, -5.77f)
                horizontalLineToRelative(0f)
                lineToRelative(104f, -125.43f)
                arcTo(15.65f, 15.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.89f, 80.91f)
                close()
                moveTo(128f, 208f)
                lineTo(24.09f, 82.74f)
                arcTo(170.76f, 170.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 48f)
                arcTo(170.76f, 170.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.91f, 82.74f)
                close()
            }
        }.build()

        return _WifiNoneFill!!
    }

@Suppress("ObjectPropertyName")
private var _WifiNoneFill: ImageVector? = null
