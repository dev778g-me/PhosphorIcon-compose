package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ClockCounterClockwiseFill: ImageVector
    get() {
        if (_ClockCounterClockwiseFill != null) {
            return _ClockCounterClockwiseFill!!
        }
        _ClockCounterClockwiseFill = ImageVector.Builder(
            name = "Filled.ClockCounterClockwiseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 128f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.11f, 197.82f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, -11.64f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 71.43f, 71.43f)
                curveTo(67.9f, 75f, 64.58f, 78.51f, 61.35f, 82f)
                lineTo(77.66f, 98.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 112f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineTo(50f, 70.7f)
                curveToRelative(3.22f, -3.49f, 6.54f, -7f, 10.06f, -10.55f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                close()
                moveTo(128f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.88f, 6.86f)
                lineToRelative(40f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.24f, -13.72f)
                lineTo(136f, 123.47f)
                verticalLineTo(80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 72f)
                close()
            }
        }.build()

        return _ClockCounterClockwiseFill!!
    }

@Suppress("ObjectPropertyName")
private var _ClockCounterClockwiseFill: ImageVector? = null
