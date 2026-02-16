package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CheckFatFill: ImageVector
    get() {
        if (_CheckFatFill != null) {
            return _CheckFatFill!!
        }
        _CheckFatFill = ImageVector.Builder(
            name = "Filled.CheckFatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(243.31f, 90.91f)
                lineToRelative(-128.4f, 128.4f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.62f, 0f)
                lineToRelative(-71.62f, -72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -22.61f)
                lineToRelative(20f, -20f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.58f, 0f)
                lineTo(104f, 144.22f)
                lineToRelative(96.76f, -95.57f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.59f, 0f)
                lineToRelative(19.95f, 19.54f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 243.31f, 90.91f)
                close()
            }
        }.build()

        return _CheckFatFill!!
    }

@Suppress("ObjectPropertyName")
private var _CheckFatFill: ImageVector? = null
