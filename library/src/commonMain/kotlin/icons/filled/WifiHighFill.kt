package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WifiHighFill: ImageVector
    get() {
        if (_WifiHighFill != null) {
            return _WifiHighFill!!
        }
        _WifiHighFill = ImageVector.Builder(
            name = "Filled.WifiHighFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(244.35f, 92.8f)
                lineToRelative(-104f, 125.43f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 224f)
                horizontalLineToRelative(0f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.31f, -5.77f)
                lineTo(11.65f, 92.8f)
                arcTo(15.65f, 15.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.11f, 80.91f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.28f, 70.1f)
                arcTo(186.67f, 186.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 32f)
                arcTo(186.67f, 186.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 241.72f, 70.1f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.17f, 10.81f)
                arcTo(15.65f, 15.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 244.35f, 92.8f)
                close()
            }
        }.build()

        return _WifiHighFill!!
    }

@Suppress("ObjectPropertyName")
private var _WifiHighFill: ImageVector? = null
