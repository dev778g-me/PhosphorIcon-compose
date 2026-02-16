package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowClockwiseFill: ImageVector
    get() {
        if (_ArrowClockwiseFill != null) {
            return _ArrowClockwiseFill!!
        }
        _ArrowClockwiseFill = ImageVector.Builder(
            name = "Filled.ArrowClockwiseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 56f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineToRelative(17f, -17f)
                lineToRelative(-10.55f, -9.65f)
                lineToRelative(-0.25f, -0.24f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.67f, 114.78f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 11.63f)
                arcTo(95.44f, 95.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 224f)
                horizontalLineToRelative(-1.32f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 195.75f, 60f)
                lineToRelative(10.93f, 10f)
                lineTo(226.34f, 50.3f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 56f)
                close()
            }
        }.build()

        return _ArrowClockwiseFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwiseFill: ImageVector? = null
